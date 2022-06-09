package HANDLER;

import INVENTORY_ENTITY.GearInventory;
import INVENTORY_ENTITY.Inventory;
import INVENTORY_ENTITY.PotionInventory;
import INVENTORY_ENTITY.WeaponInventory;
import ITEM_ENTITY.Potion;

import java.util.ArrayList;
import java.util.HashMap;

public class InitMain {

    /*
     * container that can store gears, potions, weapons
     * like I mentioned above, this class is going to be a dynamic class used all around the project
     * so the Inventory will be static (moved by pointer memory)
     */
    static HashMap<Integer, Object> INGAMEINVENTORY = new HashMap<>();
    private Inventory inventoryObj;

    // for Global method uses
    GearInventory gearInventory;
    PotionInventory potionInventory;
    WeaponInventory weaponInventory;


    public InitMain(Inventory inventory){
        inventoryObj = inventory;

        int startPotionAmount = inventoryObj.getStartPotionAmount();

        if(startPotionAmount > 0){
            ArrayList potionSlotList = inventoryObj.getPotionSlotList();
            Potion potion = (Potion) inventoryObj.getCriteriaPotionList().get(0);
            potionInventory = new PotionInventory(potion, inventoryObj.getStartPotionAmount());
            potionSlotList.add(potionInventory);


            INGAMEINVENTORY.put(, potionSlotList);
            INGAMEINVENTORY.put(, weaponInventory);
            INGAMEINVENTORY.put(, gearInventory);

        }
        Town town = new Town(inventoryObj);
    }
}
