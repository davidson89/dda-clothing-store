package dda.clothing.store.pages.pessoa;

import java.util.ArrayList;
import java.util.List;

import jmine.tec.web.wicket.ComponentHelper;
import jmine.tec.web.wicket.pages.form.FormPage;
import jmine.tec.web.wicket.pages.form.FormType;

import org.apache.wicket.Component;
import org.apache.wicket.Page;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import bancosys.tec.exception.MessageCreator;
import dda.clothing.store.HelpMessages;
import dda.clothing.store.domain.pessoa.Agente;

public abstract class AbstractCadastroAgente<A extends Agente> extends FormPage<A>{
	
	public AbstractCadastroAgente(Class<? extends Page> source, PageParameters sourcePageParameters, A entity,
			FormType formType) {
		super(source, sourcePageParameters, entity, formType);
	}

	public AbstractCadastroAgente(Class<? extends Page> source, PageParameters sourcePageParameters) {
		super(source, sourcePageParameters);
	}

	public AbstractCadastroAgente(Page sourcePage, PageParameters sourcePageParameters, A entity, FormType formType) {
		super(sourcePage, sourcePageParameters, entity, formType);
	}

	public AbstractCadastroAgente(PageParameters pageParameters, Page pageInstance) {
		super(pageParameters, pageInstance);
	}

	public AbstractCadastroAgente(PageParameters pageParameters) {
		super(pageParameters);
	}

	@Override
	protected List<Component> createFormComponents() {
		List<Component> form = new ArrayList<Component>();
		form.add(ComponentHelper.createTextField("mnemonico"));
		form.add(ComponentHelper.createTextField("cpfCnpj"));
		form.add(ComponentHelper.createTextField("telefone"));
		form.add(ComponentHelper.createTextField("logradouro"));
		form.add(ComponentHelper.createTextField("cidade"));
		form.add(ComponentHelper.createTextField("uf"));
		form.add(ComponentHelper.createTextField("email"));
		return form;
	}

	@Override
	protected MessageCreator getHelpTextCreator() {
		return HelpMessages.CADASTRO_AGENTE;
	}

}
