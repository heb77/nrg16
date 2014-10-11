package ch.heb.nrg16;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ch.heb.nrg16.application.EnergyVO;
import ch.heb.nrg16.application.EntryId;
import ch.heb.nrg16.application.MutatorBoundaryService;

public class MutatorBoundaryServiceTest {

    private static Logger log = Logger.getLogger(MutatorBoundaryServiceTest.class);

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        log.debug("started ...");
        PropertyConfigurator.configure("src/test/resources/log4j.properties");
    }

    /**
     * no exception expected
     */
    @Test
    public void addEntryStandardScenario() {
        log.debug("started ...");
        
        log.debug("initialize..");        
        MutatorBoundaryService service = new MutatorBoundaryService();
        
        
        log.debug("create entry...");
        EnergyVO userdata = new EnergyVO();
        userdata.setElMeter1(123L); 
        
        log.debug("save in spread sheet...");
        EntryId newid = service.addEntry(userdata);
        
        Assert.assertNotNull(newid);
        
        log.debug("... finished.");
    }

    private EnergyVO EnergyVO() {
        // TODO Auto-generated method stub
        return null;
    }

}
