package INVENTORY;

import ITEM.*;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * this class will be a dynamic inventory class which is used after compiling and INGAME
 */
public class Inventory {
    /*
     * container that can store gears, potions, weapons
     * like I mentioned above, this class is going to be a dynamic class used all around the project
     * so the Inventory will be static (moved by pointer memory)
     */
    static HashMap<String, Object> INVENTORY;

    // Inventory property
    private int amount;

    // Criteria list received from Object Initiation
    private ArrayList criteriaGearList;
    private ArrayList criteriaWeaponList;
    private ArrayList criteriaPotionList;

    // INGAME usable inventory
    ArrayList gearSlot         = new ArrayList<>();
    ArrayList weaponSlot       = new ArrayList<>();
    ArrayList potionSlot       = new ArrayList<>();

    // number of counts available to upgrade
    // which means you can only upgrade your inventory 3 times
    // temporary FINAL property
    private int maxUpgradeCnt;
    private int maxSpaceCnt;
    private int currentSpaceCnt;
    private int startPotionAmount;

    // for Global method uses
    Gear gear;
    Potion potion;
    Weapon weapon;

    /*
     * beginning initiation for creating inventory class & upgrading inventory slot spaces
     */
    public Inventory(int startPotionAmount, ArrayList gearList, ArrayList potionList, ArrayList weaponList){
        Space space = new Space();
        // temporary FINAL properties
        maxSpaceCnt     = space.getMaxSpaceCnt();
        maxUpgradeCnt   = space.getMaxUpgradeCnt();
        currentSpaceCnt = space.getMaxStartSpaceCnt();

        // setting criteria items GLOBALLY
        criteriaGearList   = gearList;
        criteriaWeaponList = weaponList;
        criteriaPotionList = potionList;

        // amount of shrimps started
        this.startPotionAmount = startPotionAmount;

        inventoryStartUpdate();
    }

    /*
     * inventory wipe out
     */
    public void clearInventory(){
        INVENTORY = new HashMap<>();
        INVENTORY.put("GEAR", gearSlot);
        INVENTORY.put("WEAPON", weaponSlot);
        INVENTORY.put("POTION", potionSlot);
    }

    /*
     * param: condition, index, amount
     * return: string
     */
    public String inventoryValidation(String condition, int index, int amount){
        // using items will decrease the amount
        if(condition.equals("USE")){

        }
        // adding an item will increase the amount
        else if(condition.equals("ADD")){

        }

        return "";
    }

    /*
     * update initiating in the beginning of inventory construction
     */
    public void inventoryStartUpdate(){
        // no.0 index of potion is shrimp
        potion = (Potion) criteriaPotionList.get(0);

    }
}
