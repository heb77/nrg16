package ch.heb.nrg16.application;

import org.apache.log4j.Logger;

import ch.heb.nrg16.application.persistency.PersistencyAdapter;

/**
 * <code>MutatorBoundary</code> provides entry point to Application layer
 * <p>
 * @version
 * 10.10.2014 / heb : initial version
 */
public class MutatorBoundaryService {
	
	private static Logger log = Logger.getLogger(MutatorBoundaryService.class);
    private PersistencyAdapter persistencyAdapter;
	
	
    public MutatorBoundaryService () {
        init();
    }
    
	private void init(){
	    persistencyAdapter = new PersistencyAdapter();
	}
	
	public EntryId addEntry(EnergyVO energyVO){
	    log.debug("started ...");
	    EntryId newid = persistencyAdapter.storeEntry(energyVO);
	    log.debug("... finished, id : " + newid);
	    return newid;
	}
	
	public void modifyEntry(){
	    log.debug("started ...");
		
	    
	    log.debug("... finished.");
	}

}
