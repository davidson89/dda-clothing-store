package dda.clothing.store;

import bancosys.tec.persist.bussobj.PersistableBusinessObject;
import jmine.tec.test.testcase.BOBaseTestCase;

public abstract class AbstractBoBaseTestCase<T extends PersistableBusinessObject> extends BOBaseTestCase<T> {

	@Override
	protected String getSpringMainXMLFilename() {
		return "core-test-beans.xml";
	}

	@Override
	protected String[] getResourcesBaseReferencia() {
		return new String[] {"core-db.xml"};
	}

}
