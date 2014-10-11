package ch.heb.nrg16.desktop;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import ch.heb.nrg16.application.EnergyVO;
import ch.heb.nrg16.application.EntryId;
import ch.heb.nrg16.application.MutatorBoundaryService;

public class DesktopController {

    private static Logger log = Logger.getLogger(DesktopController.class);
    
    private MutatorBoundaryService service = new MutatorBoundaryService();
    
    public void actionSave() {
        EnergyVO userdata = fetchDataFromUI();
        log.debug("save in spread sheet...");
        EntryId newid = service.addEntry(userdata);
        log.debug("newid -> " + newid);
    }

    private EnergyVO fetchDataFromUI() {
        EnergyVO dummy = new EnergyVO(); //TODO take data from UI
        dummy.setElMeter1(123);
        return dummy;
    }
    
    
    
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        log.debug("started ...");
        DesktopController dc = new DesktopController();
        dc.actionSave();        
        log.debug("... finished.");
    }

}
