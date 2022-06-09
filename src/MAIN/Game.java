package MAIN;

import INIT.*;
import INVENTORY_ENTITY.Inventory;

import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);

    public Game(){
        // able to be set by admin control
        int startPotionAmount = 0;

        /*
         * purpose: initiating item/object entity creation
         *  return: inventory object
         */
        InitObject initObj = new InitObject(startPotionAmount);

        /*
         * purpose: INGAME object uses
         */
        InitMain initMain  = new InitMain(initObj.getInventoryObject());

        while(true){
            int num = scan.nextInt();
        }
    }

    public static void main(String[] args) {

        new Game();
    }

}
