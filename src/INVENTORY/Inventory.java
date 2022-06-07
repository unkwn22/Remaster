package INVENTORY;

import ITEM.Space;

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
    static HashMap<String, Object> INVENTORY;

    // available upgrade inventory space amount
    ArrayList gearSlot   = new ArrayList<>();
    ArrayList weaponSlot = new ArrayList<>();
    ArrayList potionSlot   = new ArrayList<>();

    // number of counts available to upgrade
    // which means you can only upgrade your inventory 3 times
    private int maxUpgradeCnt;
    private int maxSpaceCnt;
    private int currentSpaceCnt;

    private int startFoodAmount;
    private int amount;

    // beginning initiation for creating inventory class & upgrading inventory slot spaces
    public Inventory(int startFoodAmount, ArrayList gearList, ArrayList potionList, ArrayList weaponList){
        Space space = new Space();
        // inventory settings criteria
        maxSpaceCnt     = space.getMaxSpaceCnt();
        maxUpgradeCnt   = space.getMaxUpgradeCnt();
        currentSpaceCnt = space.getMaxStartSpaceCnt();

        // amount of shrimps started
        this.startFoodAmount = startFoodAmount;
    }

    // inventory wipe out
    public void clearInventory(){
        INVENTORY = new HashMap<>();
        INVENTORY.put("GEAR", gearSlot);
        INVENTORY.put("WEAPON", weaponSlot);
        INVENTORY.put("POTION", potionSlot);
    }

    /*
     * param: condition, index, amount
     */
    public String inventoryValidation(String condition, int index, int amount){
        if(condition.equals("USE")){

        }
        else if(condition.equals("ADD")){

        }

        return "";
    }

    public void inventoryUpdate(){
        // global variable initialize
    }
}
