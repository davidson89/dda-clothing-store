package dda.clothing.store;

import jmine.tec.web.wicket.application.JMineWicketWebApplication;
import jmine.tec.web.wicket.pages.main.Home;
import jmine.tec.web.wicket.pages.main.Login;
import jmine.tec.web.wicket.pages.main.Logout;
import jmine.tec.web.wicket.security.SecureSession;
import jmine.tec.web.wicket.upperCase.UpperCaseBeforeRenderListener;

import org.apache.commons.lang.StringUtils;
import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.authorization.IAuthorizationStrategy;
import org.apache.wicket.markup.html.pages.AccessDeniedPage;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.request.mapper.MountedMapper;
import org.apache.wicket.request.resource.caching.FilenameWithVersionResourceCachingStrategy;
import org.apache.wicket.request.resource.caching.version.LastModifiedResourceVersion;
import org.apache.wicket.settings.IResourceSettings;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import bancosys.tec.rtm.impl.RtmController;
import bancosys.tec.security.SecurityManager;
import bancosys.tec.security.impl.web.WebSecurityContext;

/**
 * Starting point webApplication
 * 
 * @author takeshi
 */
public class WebApplication extends JMineWicketWebApplication {
    private SecurityManager<WebSecurityContext> securityManager;

    private RtmController rtmController;

    private String style;

    private IAuthorizationStrategy authorizationStrategy;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void init() {
        super.init();
        this.getComponentInstantiationListeners().add(new SpringComponentInjector(this));
        this.getComponentPostOnBeforeRenderListeners().add(new UpperCaseBeforeRenderListener());
        this.getSecuritySettings().setAuthorizationStrategy(this.authorizationStrategy);
        this.getApplicationSettings().setAccessDeniedPage(AccessDeniedPage.class);
        IResourceSettings resourceSettings = this.getResourceSettings();
        resourceSettings.addResourceFolder("");
        resourceSettings.setCachingStrategy(new FilenameWithVersionResourceCachingStrategy(new LastModifiedResourceVersion()));

        this.mount(new MountedMapper("logout", Logout.class));
        this.mount(new MountedMapper("login", Login.class));
        this.mount(new MountedMapper("accessDenied", AccessDeniedPage.class));
        this.mount(new MountedMapper("home", Home.class));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends Page> getHomePage() {
        return Home.class;
    }

    /**
     * @return the securityManager
     */
    public SecurityManager<WebSecurityContext> getSecurityManager() {
        return securityManager;
    }

    /**
     * @param securityManager the securityManager to set
     */
    public void setSecurityManager(SecurityManager<WebSecurityContext> securityManager) {
        this.securityManager = securityManager;
    }

    /**
     * @return the rtmController
     */
    public RtmController getRtmController() {
        return rtmController;
    }

    /**
     * @param rtmController the rtmController to set
     */
    public void setRtmController(RtmController rtmController) {
        this.rtmController = rtmController;
    }

    /**
     * @return the authorizationStrategy
     */
    public IAuthorizationStrategy getAuthorizationStrategy() {
        return authorizationStrategy;
    }

    /**
     * @param authorizationStrategy the authorizationStrategy to set
     */
    public void setAuthorizationStrategy(IAuthorizationStrategy authorizationStrategy) {
        this.authorizationStrategy = authorizationStrategy;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Session newSession(Request request, Response response) {
        SecureSession session = new SecureSession(request);
        session.setSecurityManager(this.securityManager);
        if (!StringUtils.isEmpty(this.style)) {
            session.setStyle(this.style);
        }

        return session;
    }
	
	
	public void setStyle(String style) {
		this.style = style;
	}
}
