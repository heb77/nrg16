package ch.heb.nrg16.application.persistency;

import org.apache.log4j.Logger;

import ch.heb.nrg16.application.EnergyVO;
import ch.heb.nrg16.application.EntryId;

/**
 * <code>PersistencyAdapter</code> encapsulate access to spread sheet library.
 * <p>
 * @version
 * 10.10.2014 / heb : initial version
 */
public class PersistencyAdapter {

    private static Logger log = Logger.getLogger(PersistencyAdapter.class);
    
    public EntryId storeEntry(EnergyVO energyVO) {
        log.debug("started, energyVO -> " + energyVO);
        
        
        // load file Excel
        // add to file
        
        
        EntryId newid = new EntryId("abc");
        log.debug("... finished.");
        return newid;
    }

}
