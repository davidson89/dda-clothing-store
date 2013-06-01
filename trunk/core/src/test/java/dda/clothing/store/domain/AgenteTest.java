package dda.clothing.store.domain;

import bancosys.tec.persist.dao.BeanNotFoundException;
import dda.clothing.store.AbstractBoBaseTestCase;

public class AgenteTest extends AbstractBoBaseTestCase<Agente>{
	
	private static final String[] MNE = new String[] {"AGENTE 1", "AGENTE 2"};
	
	private static final String[] LOGRADOURO = new String[] {"RUA X", "RUA Y"};
	
	private static final String[] TELEFONE = new String[] {"3333-0000", "3333-1111"};
	
	private static final String[] CIDADE = new String[] {"SÃO PAULO", "RIO DE JANEIRO"};
	
	private static final String[] UF = new String[] {"SP", "RJ"};
	
	private static final String[] CPF_CNPJ = new String[] {"12345678900", "98765432000111"};

	@Override
	protected int getTestDataSize() {
		return 2;
	}

	@Override
	protected void fillData(int idx, Agente bo) {
		bo.setMnemonico(MNE[idx]);
		bo.setCpfCnpg(CPF_CNPJ[idx]);
		bo.setLogradouro(LOGRADOURO[idx]);
		bo.setCidade(CIDADE[idx]);
		bo.setUf(UF[idx]);
		bo.setTelefone(TELEFONE[idx]);
	}

	@Override
	protected void compareData(int idx, Agente bo) throws BeanNotFoundException {
		assertEquals(MNE[idx], bo.getMnemonico());
		assertEquals(CPF_CNPJ[idx], bo.getCpfCnpg());
		assertEquals(LOGRADOURO[idx], bo.getLogradouro());
		assertEquals(CIDADE[idx], bo.getCidade());
		assertEquals(UF[idx], bo.getUf());
		assertEquals(TELEFONE[idx], bo.getTelefone());
	}
}
