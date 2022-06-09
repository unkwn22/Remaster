package HANDLER;

import INVENTORY_ENTITY.Inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Town {

    Scanner scan = new Scanner(System.in);

    public Town(InGameInventory inGameInventory){
        // TODO delete debug uses
        while(true){
            inGameInventory.viewInventory();

            System.out.println("What category would you like to delete?");
            int categoryIndex = scan.nextInt();
            System.out.println("What potion would you like to delete?");
            int itemIndex = scan.nextInt();
            System.out.println("how many would you like to delete?");
            int amount = scan.nextInt();

            inGameInventory.useOrTossItem(categoryIndex, itemIndex, amount);
        }
    }
}
