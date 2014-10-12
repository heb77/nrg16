package ch.heb.nrg16.desktop;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;

public class DesktopControllerTest {

    private static Logger log = Logger.getLogger(DesktopControllerTest.class);

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        log.debug("started ...");
        PropertyConfigurator.configure("src/test/resources/log4j.properties");
    }

    @Test
    public void test() {
        log.debug("started ...");
        
        DesktopController dc = new DesktopController();
//        dc.actionSave();
        
        log.debug("... finished.");
    }

}
