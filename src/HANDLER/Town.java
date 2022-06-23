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

            int categorySelIndex = scan.nextInt();
            int itemSelIndex = scan.nextInt();
            int amount = scan.nextInt();

            inGameInventory.useOrTossItem(categorySelIndex, itemSelIndex, amount);
        }
    }
}
