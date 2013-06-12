package dda.clothing.store.pages.pessoa.cliente;

import jmine.tec.web.wicket.pages.form.FormType;

import org.apache.wicket.Page;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import dda.clothing.store.domain.pessoa.Cliente;
import dda.clothing.store.pages.pessoa.AbstractPesquisaAgente;
import dda.clothing.store.pages.pessoa.model.AgenteModel;

public class PesquisaCliente extends AbstractPesquisaAgente<AgenteModel, Cliente> {

	@Override
	protected AgenteModel createModel() {
		return new AgenteModel();
	}

	@Override
	protected Page createFormPage(Cliente entity, FormType formType) {
		return new CadastroCliente(this, new PageParameters(), entity, formType);
	}
	
	public Page createNewPage() {
		return new CadastroCliente(new PageParameters());
	}

}
