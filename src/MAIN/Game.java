package MAIN;

import HANDLER.InitMain;
import INIT.*;

import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window;

    // Frame properties
    int windowWidth = 800;
    int windowHeight = 600;
    Color backGroundColor = Color.black;
    boolean visibleSet = true;

    public Game(){

        // creating a JFrame panel
        window = new JFrame();
        // setting the size of the panel
        window.setSize(windowWidth, windowHeight);
        // creating a JFrame close option, used to make the JFrame close properly
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setting the frame background color
        window.getContentPane().setBackground(backGroundColor);
        // setting a the frame layout, setting it to null means turning off the default layout
        window.setLayout(null);
        // even though we created a window component, it isnt visible in the UI so to make it visible...
        window.setVisible(visibleSet);

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
