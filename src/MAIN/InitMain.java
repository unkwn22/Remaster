package MAIN;

import INVENTORY_ENTITY.Inventory;

import java.util.ArrayList;
import java.util.HashMap;

public class InitMain {

    /*
     * container that can store gears, potions, weapons
     * like I mentioned above, this class is going to be a dynamic class used all around the project
     * so the Inventory will be static (moved by pointer memory)
     */
    private HashMap<String, Object> realInventory = new HashMap<>();
    private Inventory inventory;

    public InitMain(Inventory inventory){
        this.inventory = inventory;

    }
}
