package dda.clothing.store.runner;

import jmine.tec.test.runner.TestRunnerStarter;

/** 
 * @author davidson.rodrigues
 * @created May 20, 2013
 */
public class ClothingStoreTestRunner {
    
    
    public static void main(String[] args) {
        new TestRunnerStarter("core-test-beans.xml", "core-db.xml").start();
    }

}
