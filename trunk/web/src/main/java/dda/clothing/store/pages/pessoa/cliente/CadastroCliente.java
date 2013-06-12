package dda.clothing.store.pages.pessoa.cliente;

import jmine.tec.web.wicket.pages.form.FormType;

import org.apache.wicket.Page;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import dda.clothing.store.domain.pessoa.Cliente;
import dda.clothing.store.pages.pessoa.AbstractCadastroAgente;

public class CadastroCliente extends AbstractCadastroAgente<Cliente>{

	public CadastroCliente(Class<? extends Page> source, PageParameters sourcePageParameters, Cliente entity,
			FormType formType) {
		super(source, sourcePageParameters, entity, formType);
	}

	public CadastroCliente(Class<? extends Page> source, PageParameters sourcePageParameters) {
		super(source, sourcePageParameters);
	}

	public CadastroCliente(Page sourcePage, PageParameters sourcePageParameters, Cliente entity, FormType formType) {
		super(sourcePage, sourcePageParameters, entity, formType);
	}

	public CadastroCliente(PageParameters pageParameters, Page pageInstance) {
		super(pageParameters, pageInstance);
	}

	public CadastroCliente(PageParameters pageParameters) {
		super(pageParameters);
	}
}
