package ch.heb.nrg16;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;

public class MutatorBoundaryServiceTest {
    
    private static Logger log = Logger.getLogger(MutatorBoundaryServiceTest.class);

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
      PropertyConfigurator.configure("src/test/resources/log4j.properties");
    }


    @Test
    public void test() {
        log.debug("started ...");
        MutatorBoundaryService service = new MutatorBoundaryService();
        service.addEntry();
        log.debug("... finished.");
    }

}
