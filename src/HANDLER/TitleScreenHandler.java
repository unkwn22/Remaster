package HANDLER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleScreenHandler implements ActionListener {
    // main Game global variable container
    Container container;
    // main Game global variable
    JPanel titleNamePanel, startButtonPanel;
    // character creation page
    CharacterCreationHandler characterCreationHandler;

    // constructor
    public TitleScreenHandler(JPanel titleNamePanel, JPanel startButtonPanel, Container container){
        this.titleNamePanel   = titleNamePanel;
        this.startButtonPanel = startButtonPanel;
        this.container        = container;
    }

    /*
     * ActionEvent is activated from where components are added with an actionListener
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        // getting the button name
        String actionName = event.getActionCommand();

        switch(actionName){
            case "Start":
                // setting visible to false
                titleNamePanel.setVisible(false);
                startButtonPanel.setVisible(false);
                // moving to character creation page
                characterCreationHandler = new CharacterCreationHandler(container);
                break;
            case "Load":
                titleNamePanel.setVisible(false);
                startButtonPanel.setVisible(false);
                break;
            case "Exit": System.exit(0);
                break;
        }
    }
}
