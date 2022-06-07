package INVENTORY;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * this class will be a dynamic inventory class which is used after compiling
 */
public class Inventory {
    /*
     * container that can store gears, potions, weapons
     * like I mentioned above, this class is going to be a dynamic class used all around the project
     * so the Inventory will be static (moved by pointer memory)
     */
    static HashMap<String, Object> INVENTORY = new HashMap<>();

    // available upgrade inventory space amount
    private int maxSpaceCnt = 5;

    // number of counts available to upgrade
    // which means you can only upgrade your inventory 3 times
    private int maxUpgradeCnt = 3;
    private int startFoodAmount;

    // TODO need to plan a structure for amounts of food or will it be also for weapons and gears?
    private int amount;
    ArrayList gearSlot = new ArrayList<>();
    ArrayList weaponSlot = new ArrayList<>();
    ArrayList foodSlot = new ArrayList<>();

    // beginning initiation for creating inventory class & upgrading inventory slot spaces
    public Inventory(int maxUpgradeCnt, int maxSpaceCnt, int startFoodAmount){
        // inventory settings criteria
        this.maxSpaceCnt   = maxUpgradeCnt;
        this.maxUpgradeCnt = maxSpaceCnt;

        // amount of shrimps started
        this.startFoodAmount = startFoodAmount;
    }

    public void inventoryUpdate(){
        INVENTORY.put("GEAR", gearSlot);
        INVENTORY.put("WEAPON", weaponSlot);
        INVENTORY.put("FOOD", foodSlot);
    }
}
