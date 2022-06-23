package MAIN;

import HANDLER.InitMain;
import INIT.*;

import javax.swing.*;
import java.awt.*;

public class Game {

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
    int sButtonPanelX      = 200;
    int sButtonPanelY      = 300;
    int sButtonPanelW      = 400;
    int sButtonPanelH      = 200;
    Color sButtonPanelBackColor = Color.blue;

    // button object
    JButton startButton, loadButton, exitButton;
    Color sButtonBackColor  = Color.black;
    Color sButtonForeColor  = Color.white;
    String startButtonLabel = "Start";
    String loadButtonLabel  = "Load";
    String exitButtonLabel  = "Exit";

    public Game(){

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

        // creating Jbutton start button panel
        startButton = new JButton(startButtonLabel);
        startButton.setBackground(sButtonBackColor);
        startButton.setForeground(sButtonForeColor);
        startButton.setFont(normalFont);

        loadButton = new JButton(loadButtonLabel);
        loadButton.setBackground(sButtonBackColor);
        loadButton.setForeground(sButtonForeColor);
        loadButton.setFont(normalFont);

        exitButton = new JButton(exitButtonLabel);
        exitButton.setBackground(sButtonBackColor);
        exitButton.setForeground(sButtonForeColor);
        exitButton.setFont(normalFont);

        // adding the title label to the title panel
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        startButtonPanel.add(loadButton);
        startButtonPanel.add(exitButton);

        // adding a panel
        container.add(titleNamePanel);
        container.add(startButtonPanel);







        // able to be set by admin control
        int startPotionAmount = 5;

        /*
         * purpose: initiating item/object entity creation
         *  return: inventory object
         */
        InitObject initObj = new InitObject(startPotionAmount);

        // depending on mode selection, player will be started with starter items
        int mode = 1;
        /*
         * purpose: INGAME object uses
         */
        InitMain initMain  = new InitMain(initObj.getInventoryObject(), mode);
    }

    public static void main(String[] args) {

        new Game();
    }

}
