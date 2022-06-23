package HANDLER;

import javax.swing.*;
import java.awt.*;

public class CharacterCreationHandler {

    Container container;

    JPanel inputNamePanel;
    int inputNameBoundX       = 100;
    int inputNameBoundY       = 100;
    int inputNameBoundWidth   = 600;
    int inputNameBoundHeight  = 250;
    Color inputPanelBackColor = Color.blue;

    JTextField inputTextField;
    int inputTextBoundX      = 100;
    int inputTextBoundY      = 100;
    int inputTextBoundWidth  = 100;
    int inputTextBoundHeight = 100;

    // making a grid criteria for panel layout
    GridLayout gridLayout    = new GridLayout(3, 1);

    // constructor
    public CharacterCreationHandler(Container container){
        this.container = container;
        createScreen();
    }

    // creating character creation page
    public void createScreen(){
        inputNamePanel = new JPanel();
        inputNamePanel.setBounds(inputNameBoundX, inputNameBoundY, inputNameBoundWidth, inputNameBoundHeight);
        inputNamePanel.setBackground(inputPanelBackColor);
        // setting the panel layout
        inputNamePanel.setLayout(gridLayout);
        container.add(inputNamePanel);

        inputTextField = new JTextField();
        inputNamePanel.add(inputTextField);
    }

}
