package HANDLER;

import INVENTORY_ENTITY.GearInventory;
import INVENTORY_ENTITY.Inventory;
import INVENTORY_ENTITY.PotionInventory;
import INVENTORY_ENTITY.WeaponInventory;
import ITEM_ENTITY.Potion;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * for constructing INGAME uses (LOADING)
 */
public class InitMain {
    /*
     * container that can store gears, potions, weapons
     * like I mentioned above, this class is going to be a dynamic class used all around the project
     * so the Inventory will be static (moved by pointer memory)
     */
    static HashMap<Integer, Object> INGAMEINVENTORY = new HashMap<>();

    // for Global method uses
    GearInventory gearInventory;
    PotionInventory potionInventory;
    WeaponInventory weaponInventory;

    public InitMain(Inventory inventory){
        // setting local variable
        int startPotionAmount = inventory.getStartPotionAmount();
        // when value is modified before compiling it will enter here
        if(startPotionAmount > 0){

        }
        Town town = new Town(inventory);
    }
}
