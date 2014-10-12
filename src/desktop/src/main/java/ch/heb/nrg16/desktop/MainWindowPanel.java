package ch.heb.nrg16.desktop;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.apache.log4j.Logger;

import ch.heb.nrg16.application.EnergyVO;

/**
 * <code>MainWindowPanel</code> is demo a code for retrieving user data and saving to application.
 * <p>
 * @version
 * 12.10.2014 / heb : initial version
 */
public class MainWindowPanel extends JPanel {

    private static Logger log = Logger.getLogger(MainWindowPanel.class);
    private static final long serialVersionUID = 1L;

    private DesktopController desktopController;
    
    private JButton saveBtn;
    private JTextField elMeter1Txt;

    public MainWindowPanel(DesktopController dc) {
        this.desktopController = dc;

        setBorder(BorderFactory.createLineBorder(Color.black));
        setLayout(new FlowLayout());
        JPanel jp = new JPanel();
        jp.setBorder(new TitledBorder("Stromzähler"));
        jp.add(new JLabel("Stromzähler1:"));

        elMeter1Txt = new JTextField(20);
        jp.add(elMeter1Txt);
        add(jp);
        
        @SuppressWarnings("serial")
        Action addEntryBtnAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                log.debug("started ...");
                try {
                    EnergyVO userData = fetchUIData(); 
                    desktopController.storeUserDataToApplication(userData);
                } catch (Exception ex) {
                    log.error("could not store userdata", ex);
                }
                log.debug("... finished.");
            }
         };

        saveBtn = new JButton(addEntryBtnAction);
        saveBtn.setText("speichern");
        add(saveBtn);
    }
    
    private EnergyVO fetchUIData() {
        log.debug("create entry...");
        String elMeter1Str = elMeter1Txt.getText();
        log.debug("elMeter1Str -> " + elMeter1Str);
        EnergyVO userdata = new EnergyVO();
        userdata.setElMeter1(Long.parseLong(elMeter1Str));
        return userdata;
    }
}
