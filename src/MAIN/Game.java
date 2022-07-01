package MAIN;

import HANDLER.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {
    // font properties
    String titleFontName    = "Times new Roman";
    int titleFontProperties = Font.PLAIN;
    int titleFontSize       = 90;
    Font titleFont          = new Font(titleFontName, titleFontProperties, titleFontSize);

    int normalFontSize      = 30;
    Font normalFont         = new Font(titleFontName, titleFontProperties, normalFontSize);

    // creating a basic frame
    JFrame window;
    // a container that the window will carry
    Container container;

    // window properties
    int windowWidth       = 800;
    int windowHeight      = 600;
    Color frameColor = Color.black;
    boolean visibleSet    = true;

    // component global variable
    JPanel titleNamePanel, startButtonPanel;
    // titleNamePanel properties
    int boundX                = 90;
    int boundY                = 100;
    int boundWidth            = 600;
    int boundHeight           = 150;
    Color titleNamePanelColor = Color.black;

    // title label properties
    JLabel titleNameLabel;
    String titleName          = "Remasterd";
    // color of the text
    Color textForegroundColor = Color.white;

    // startButtonPanel properties
    int sButtonPanelX           = 200;
    int sButtonPanelY           = 300;
    int sButtonPanelW           = 400;
    int sButtonPanelH           = 200;
    Color sButtonPanelBackColor = Color.black;
    GridLayout gridLayout       = new GridLayout(3, 1);

    // button object
    JButton startButton, loadButton, exitButton;
    Color sButtonBackColor  = Color.black;
    Color sButtonForeColor  = Color.white;
    String startButtonLabel = "Start";
    String loadButtonLabel  = "Load";
    String exitButtonLabel  = "Exit";

    // character creation properties
    JPanel inputNamePanel;
    int inputNameBoundX       = 100;
    int inputNameBoundY       = 100;
    int inputNameBoundWidth   = 600;
    int inputNameBoundHeight  = 250;
    Color inputPanelBackColor = Color.blue;

    // JTextArea properties
    JTextArea textArea, inputTextField;
    String askText          = "Type in your name. (No spaces allowed)";
    String validText        = "Invalid name, Please type in your name again. (No spaces allowed)";
    Color textAreaBackColor = Color.black;
    Color textAreaForeColor = Color.white;
    boolean lineWrap        = true;
    boolean setDisable      = false;

    // JButton properties
    JButton confirmBtn;
    Color confirmBtnBackColor  = Color.black;
    Color confirmBtnForeColor  = Color.white;
    String confirmBtnLabel     = "Confirm";

    public Game(){
        createMainPage();
    }

    // main page screen
    public void createMainPage(){
        // creating a JFrame panel
        window = new JFrame();
        // setting the size of the panel
        window.setSize(windowWidth, windowHeight);
        // creating a JFrame close option, used to make the JFrame close properly
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setting the frame background color
        window.getContentPane().setBackground(frameColor);
        // setting a the frame layout, setting it to null means turning off the default layout
        window.setLayout(null);
        // even though we created a window component, it isnt visible in the UI so to make it visible...
        window.setVisible(visibleSet);

        // when wanting to create a new components on top of the JFrame, the JFrame must have a container
        // so were letting the container know that were going to make the JFrame as a base layout component
        // so now letting the container constructor know that the window Content pane is going to be a new Container object
        container = window.getContentPane();

        // creating a title name panel
        titleNamePanel = new JPanel();
        // setting the panel bounds
        titleNamePanel.setBounds(boundX, boundY, boundWidth, boundHeight);
        // setting the panel background
        titleNamePanel.setBackground(titleNamePanelColor);

        // creating a title name
        titleNameLabel = new JLabel(titleName);
        titleNameLabel.setForeground(textForegroundColor);
        titleNameLabel.setFont(titleFont);

        // creating a start button panel
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(sButtonPanelX, sButtonPanelY, sButtonPanelW, sButtonPanelH);
        startButtonPanel.setBackground(sButtonPanelBackColor);
        startButtonPanel.setLayout(new GridLayout(4, 1));

        // creating Jbutton start button panel
        startButton = new JButton(startButtonLabel);
        startButton.setBackground(sButtonBackColor);
        startButton.setForeground(sButtonForeColor);
        startButton.setFont(normalFont);
        // setting the startbutton an actionListener property so when clicked, it will call into titlescreenhandler implementation
        startButton.addActionListener(this);

        loadButton = new JButton(loadButtonLabel);
        loadButton.setBackground(sButtonBackColor);
        loadButton.setForeground(sButtonForeColor);
        loadButton.setFont(normalFont);
        loadButton.addActionListener(this);

        exitButton = new JButton(exitButtonLabel);
        exitButton.setBackground(sButtonBackColor);
        exitButton.setForeground(sButtonForeColor);
        exitButton.setFont(normalFont);
        exitButton.addActionListener(this);

        // adding the title label to the title panel
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        startButtonPanel.add(loadButton);
        startButtonPanel.add(exitButton);

        // adding a panel
        container.add(titleNamePanel);
        container.add(startButtonPanel);
    }

    // characterCreation page screen
    public void createCharacterPage(){
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

    // title screen handler
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
                createCharacterPage();
                break;
            case "Load":
                titleNamePanel.setVisible(false);
                startButtonPanel.setVisible(false);
                break;
            case "Exit": System.exit(0);
                break;
            case "Confirm":
                // getting the name input from the user
                String nameInput = inputTextField.getText();
                // validate name method
                // return status for continue or to catch validation
                boolean returnStatus = nameValidate(nameInput);

                // user input name judgement
                if(returnStatus == false){
                    textArea.setText(validText);
                }else{
                    // turning off character creation page
                    inputNamePanel.setVisible(false);
                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        new Game();
    }

    // name validation check
    public boolean nameValidate(String nameInput){
        // return status
        boolean rtnStatus = true;

        // variables for checking spaces in between
        int nameInputLength = nameInput.length();

        // same meaning for user aspect, but totally different meanings
        if(nameInput.isEmpty() || nameInput.equals(null) || nameInput.equals("")) return false;
        // checking for spaces when size of input is bigger than one
        for(int i = 0; i < nameInputLength; i++){
            // getting individual characters
            char charCheck = nameInput.charAt(i);
            if(charCheck == ' '){
                return false;
            }
        }

        return rtnStatus;
    }
}
