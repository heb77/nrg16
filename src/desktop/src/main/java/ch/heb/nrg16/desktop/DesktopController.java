package ch.heb.nrg16.desktop;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import ch.heb.nrg16.application.EnergyVO;
import ch.heb.nrg16.application.EntryId;
import ch.heb.nrg16.application.MutatorBoundaryService;

/**
 * <code>DesktopController</code> represents the Main Controller of the Swing application.
 * <p>
 * 
 * @see http://docs.oracle.com/javase/tutorial/uiswing/painting/step1.html
 * 
 * @version
 * 12.10.2014 / heb : initial version
 */
public class DesktopController {

    private static Logger log = Logger.getLogger(DesktopController.class);
    
    private MutatorBoundaryService service;

    
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        log.debug("started ...");
        DesktopController dc = new DesktopController();
        dc.start();
        
        log.debug("... finished.");
    }

    
    public void storeUserDataToApplication(EnergyVO userData) {
        log.debug("save in spread sheet...");
        EntryId newid = service.addEntry(userData);
        log.debug("newid -> " + newid);
    }
    
    // private stuff ----------------------------------------------------------
    
    private void start() {
        service = new MutatorBoundaryService();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });        
    }

    private void createAndShowGUI() {
        log.debug("Created GUI on EDT? "+  SwingUtilities.isEventDispatchThread());
        String mainWindowTitle = "NRG16 Stromverbrauch EFH Aeschstrasse 16";
        JFrame f = new JFrame(mainWindowTitle);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,300);
        f.add(new MainWindowPanel(this));
        f.setVisible(true);
    }

}
