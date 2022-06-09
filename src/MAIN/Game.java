package MAIN;

import HANDLER.InitMain;
import INIT.*;

import java.util.Scanner;

public class Game {
    public Game(){
        // able to be set by admin control
        int startPotionAmount = 5;

        /*
         * purpose: initiating item/object entity creation
         *  return: inventory object
         */
        InitObject initObj = new InitObject(startPotionAmount);

        /*
         * purpose: INGAME object uses
         */
        InitMain initMain  = new InitMain(initObj.getInventoryObject());
    }

    public static void main(String[] args) {

        new Game();
    }

}
