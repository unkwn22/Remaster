package MAIN;

import HANDLER.InitMain;
import INIT.*;

import javax.swing.*;
import java.awt.*;

public class Game {

    // creating a basic frame
    JFrame window;
    // a container that the window will carry
    Container container;

    // window properties
    int windowWidth       = 800;
    int windowHeight      = 600;
    Color frameColor = Color.black;
    boolean visibleSet    = true;

    // a component for the title
    JPanel titleNamePanel;
    // titleNamePanel properties
    int boundX                = 90;
    int boundY                = 100;
    int boundWidth            = 600;
    int boundHeight           = 150;
    Color titleNamePanelColor = Color.blue;

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

        // adding a panel
        container.add(titleNamePanel);

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
