package dda.clothing.store.pages.pessoa;

import java.io.Serializable;
import java.util.List;

import jmine.tec.report.impl.table.ReportTableBuilder;
import jmine.tec.web.wicket.pages.form.CrudModelPage;
import bancosys.tec.exception.MessageCreator;
import bancosys.tec.persist.dao.BaseDAOFactory;
import dda.clothing.store.HelpMessages;
import dda.clothing.store.domain.pessoa.Agente;

public abstract class AbstractPesquisaAgente<M extends Serializable, T extends Agente> extends CrudModelPage<M, T>{

	public List<T> search(BaseDAOFactory daoFactory) {
		return daoFactory.getGenericDAO(this.getEntityClass()).findAll();
	}

	@Override
	protected void addResultTableColumns(ReportTableBuilder<T> table) {
		table.addStringColumn("nome", "Nome", "mnemonico");
		table.addStringColumn("cpfCnpj", "CPF / CNPJ", "cpfCnpj");
		table.addStringColumn("logradouro", "Logradouro", "logradouro");
		table.addStringColumn("cidade", "Cidade", "cidade");
		table.addStringColumn("uf", "UF", "uf");
		table.addStringColumn("telefone", "Telefone", "telefone");
		table.addStringColumn("email", "E-mail", "email");
	}

	@Override
	protected MessageCreator getHelpTextCreator() {
		return HelpMessages.PESQUISA_AGENTE;
	}

}
