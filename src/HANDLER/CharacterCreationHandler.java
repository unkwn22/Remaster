package HANDLER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterCreationHandler implements ActionListener{

    Container container;

    // JPanel properties
    JPanel inputNamePanel;
    int inputNameBoundX       = 100;
    int inputNameBoundY       = 100;
    int inputNameBoundWidth   = 600;
    int inputNameBoundHeight  = 250;
    Color inputPanelBackColor = Color.blue;

    // JTextArea properties
    JTextArea textArea, inputTextField;
    String askText          = "Type in your name.";
    String validText        = "Valid name, Please type in your name again.";
    Color textAreaBackColor = Color.black;
    Color textAreaForeColor = Color.white;
    boolean lineWrap        = true;

    String titleFontName    = "Times new Roman";
    int titleFontProperties = Font.PLAIN;
    int normalFontSize      = 30;
    Font normalFont         = new Font(titleFontName, titleFontProperties, normalFontSize);
    boolean setDisable      = false;

    // JButton properties
    JButton confirmBtn;
    Color confirmBtnBackColor  = Color.black;
    Color confirmBtnForeColor  = Color.white;
    String confirmBtnLabel     = "Confirm";

    // making a grid criteria for panel layout
    GridLayout gridLayout    = new GridLayout(3, 1);

    // constructor
    public CharacterCreationHandler(Container container){
        this.container = container;
        createScreen();
    }

    // creating character creation page
    public void createScreen(){
        // input name panel
        inputNamePanel = new JPanel();
        inputNamePanel.setBounds(inputNameBoundX, inputNameBoundY, inputNameBoundWidth, inputNameBoundHeight);
        inputNamePanel.setBackground(inputPanelBackColor);
        // setting the panel layout
        inputNamePanel.setLayout(gridLayout);
        container.add(inputNamePanel);

        // textArea
        textArea = new JTextArea(askText);
        textArea.setBackground(textAreaBackColor);
        textArea.setForeground(textAreaForeColor);
        textArea.setFont(normalFont);
        textArea.setLineWrap(lineWrap);
        textArea.setEnabled(setDisable);
        inputNamePanel.add(textArea);

        // JTextField
        inputTextField = new JTextArea();
        inputNamePanel.add(inputTextField);

        // confirm button
        confirmBtn = new JButton(confirmBtnLabel);
        confirmBtn.setBackground(confirmBtnBackColor);
        confirmBtn.setForeground(confirmBtnForeColor);
        confirmBtn.setFont(normalFont);
        // getting the inputTextField text when confirm button is clicked
        confirmBtn.addActionListener(this);
        inputNamePanel.add(confirmBtn);
    }

    // name validation check
    @Override
    public void actionPerformed(ActionEvent e) {
        // getting the name input from the user
        String name = inputTextField.getText();
    }
}
