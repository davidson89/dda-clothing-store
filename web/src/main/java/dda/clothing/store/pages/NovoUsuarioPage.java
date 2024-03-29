package dda.clothing.store.pages;

import java.util.ArrayList;
import java.util.List;

import jmine.tec.web.wicket.pages.form.FormPage;
import jmine.tec.web.wicket.pages.form.FormType;

import org.apache.wicket.Component;
import org.apache.wicket.Page;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.spring.injection.annot.SpringBean;

import dda.clothing.store.HelpMessages;
import bancosys.tec.exception.MessageCreator;
import bancosys.tec.security.annotation.Secure;
import bancosys.tec.security.authorization.UrlPermission;
import bancosys.tec.security.impl.dao.UserDAO;
import bancosys.tec.security.impl.domain.User;
import bancosys.tec.utils.md5sum.MD5SumTool;

/**
 * Tela para cadastro e edição de usuários.
 *  
 * @author jrenaut
 */
@Secure(id = "URL_CONTROLE_ACESSO", permissionType = UrlPermission.class)
public class NovoUsuarioPage extends FormPage<User>{

	@SpringBean
	private UserDAO dao;
	
	/**
	 * Construtor
	 * 
	 * @param pageParameters os parâmetros da página
	 */
    public NovoUsuarioPage(PageParameters pageParameters) {
        super(pageParameters);
    }

    /**
     * Construtor
     * 
     * @param sourcePage a página de origem
     * @param sourcePageParameters os parâmetros da página
     * @param entity o usuário sendo manipulado
     * @param formType o tipo de formulário
     */
    public NovoUsuarioPage(Page sourcePage, PageParameters sourcePageParameters, User entity, FormType formType) {
        super(sourcePage, sourcePageParameters, entity, formType);
    }

    /**
     * Construtor
     * 
     * @param pageParameters os parâmetros da página
     * @param sourcePage a página de origem
     */
    public NovoUsuarioPage(PageParameters pageParameters, Page sourcePage) {
        super(pageParameters, sourcePage);
    }

    /**
     * {@inheritDoc}
     */
	@Override
	protected List<Component> createFormComponents() {
        List<Component> components = new ArrayList<Component>();

        components.add(this.createTextField("username"));

        Label label = new Label("passwordLabel", "Password:");
        label.setVisible(this.getFormType().isNew());
        components.add(label);

        PasswordTextField passwordField = new PasswordTextField("password");
        passwordField.setVisible(this.getFormType().isNew());
        components.add(passwordField);

        return components;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean beforeSave(User target) {
	    super.beforeSave(target);
	    
        if (this.getFormType().isNew()) {
            target.setPassword(MD5SumTool.md5Sum(target.getPassword()));
        }
	    
	    return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected MessageCreator getHelpTextCreator() {
	    return HelpMessages.CONTROLE_ACESSO;
	}

}
