package dda.clothing.store.domain;

import bancosys.tec.persist.dao.BeanNotFoundException;
import dda.clothing.store.domain.pessoa.Fornecedor;

public class FornecedorTest extends AbstractAgenteTest<Fornecedor> {

	private static final String[] INSC_ESTAD = new String[] { "123.456.789.000", "987.654.321.000" };


	@Override
	protected void fillData(int idx, Fornecedor bo) {
		super.fillData(idx, bo);
		bo.setInscricaoEstadual(INSC_ESTAD[idx]);
	}

	@Override
	protected void compareData(int idx, Fornecedor bo) throws BeanNotFoundException {
		super.compareData(idx, bo);
		assertEquals(INSC_ESTAD[idx], bo.getInscricaoEstadual());
	}

}
