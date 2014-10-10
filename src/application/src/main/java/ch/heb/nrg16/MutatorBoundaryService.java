package ch.heb.nrg16;

import org.apache.log4j.Logger;

import ch.heb.nrg16.persistency.PersistencyAdapter;

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
	
	public void addEntry(){
	    log.debug("started ...");
		
	    persistencyAdapter.storeEntry();
	    
	    log.debug("... finished.");
	}
	
	public void modifyEntry(){
	    log.debug("started ...");
		
	    
	    log.debug("... finished.");
	}

}
