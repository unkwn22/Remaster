package HANDLER;

import INVENTORY_ENTITY.*;
import ITEM_ENTITY.*;

import java.util.ArrayList;

/*
 * this is where all the INGAME (instance) functions are held
 */
public class InGameInventory {
    /*
     * container that can store gears, potions, weapons
     * like I mentioned above, this class is going to be a dynamic class used all around the project
     * so the Inventory will be static (moved by pointer memory)
     */

    ArrayList<GearInventory> gearInventoryList = new ArrayList();
    ArrayList<PotionInventory> potionInventoryList = new ArrayList();
    ArrayList<WeaponInventory> weaponInventoryList = new ArrayList();

    // for returning into a group method and making things easy when objects are added
    /*
     * 0. Gear
     * 1. Potion
     * 2. Weapon
     */
    private ArrayList criteriaItemGroup = new ArrayList<>();

    // number of counts available to upgrade
    // which means you can only upgrade your inventory 3 times
    // temporary FINAL property
    private Inventory inventory;

    private int maxUpgradeCnt;
    private int maxSpaceCnt;
    private int currentSpaceCnt;
    private int startPotionAmount;

    // for Global method uses
    private GearInventory gearInventoryGlobal;
    private PotionInventory potionInventoryGlobal;
    private WeaponInventory weaponInventoryGlobal;

    /*
     * constructor
     */
    public InGameInventory(Inventory inventory){
        // setting criteria to instance global variable
        this.inventory         = inventory;
        this.criteriaItemGroup = inventory.getCriteriaItemGroup();
        this.maxUpgradeCnt     = inventory.getMaxUpgradeCnt();
        this.maxSpaceCnt       = inventory.getMaxSpaceCnt();
        this.currentSpaceCnt   = inventory.getCurrentSpaceCnt();
        this.startPotionAmount = inventory.getStartPotionAmount();
        // starting starterItem method
        createStarterItem();
    }

    /*
     * starter item creation method
     */
    public void createStarterItem(){
        // creating slots for INGAME inventory
        for(int i = 0; i < criteriaItemGroup.size(); i++){
            /*
             * 0. Gear
             * 1. Potion
             * 2. Weapon
             */
            // category identifier
            switch(i){
                case 0:
                    break;
                case 1:
                    // setting starters item since criteriaItemGroup arraylist is capsuling 3 arraylists we need to cast the first arraylist into
                    // a temporary list
                    ArrayList<Potion> tempList = (ArrayList<Potion>) criteriaItemGroup.get(1);
                    // getting that one specific tempList object and casting it into a ObjectInventory class to set the amount
                    potionInventoryGlobal = new PotionInventory(tempList.get(0), startPotionAmount);
                    // adding it into a inGame usable item list
                    potionInventoryList.add(potionInventoryGlobal);
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }

    public void viewItemArrayList(int itemCategory){
        /*
         * 0. Gear
         * 1. Potion
         * 2. Weapon
         */
        switch(itemCategory){
            case 0:
                System.out.println(itemCategory + "]Gear");
                for(Object object : gearInventoryList){
                    GearInventory gearInventory = (GearInventory) object;
                    Gear gear = gearInventory.getGear();
                    // defining item index
                    int itemDefineIndex = 0;
                    System.out.println(itemDefineIndex + "]Name: " + gear.getName() + " Cost:" + gear.getCost() + " Amount: " + gearInventory.getAmount());
                    itemDefineIndex++;
                }
                break;
            case 1:
                System.out.println(itemCategory + "]Potion");
                for(Object object : potionInventoryList){
                    PotionInventory potionInventory = (PotionInventory) object;
                    Potion potion = potionInventory.getPotion();
                    // defining item index
                    int itemDefineIndex = 0;
                    System.out.println(itemDefineIndex + "]Name: " + potion.getName() + " Cost:" + potion.getCost() + " Amount: " + potionInventory.getAmount());
                    itemDefineIndex++;
                }
                break;
            case 2:
                System.out.println(itemCategory + "]Weapon");
                for(Object object : weaponInventoryList){
                    WeaponInventory weaponInventory = (WeaponInventory) object;
                    Weapon weapon = weaponInventory.getWeapon();
                    // defining item index
                    int itemDefineIndex = 0;
                    System.out.println(itemDefineIndex + "]Name: " + weapon.getName() + " Cost:" + weapon.getCost() + " Amount" + weaponInventory.getAmount());
                    itemDefineIndex++;
                }
                break;
            default:
                break;
        }
    }

    public void useOrTossItem(int categoryIndex, int itemIndex, int amount){
// Hard coded
        // selecting category to enter
        switch(categoryIndex){
            case 0:
                break;
            case 1:
                potionInventoryGlobal = potionInventoryList.get(itemIndex);
                int currentAmount = potionInventoryGlobal.getAmount();
                // calculation
                int calculationResult               = currentAmount -= amount;

                if(calculationResult > 0){
                    potionInventoryGlobal.setAmount(calculationResult);
                }else{
                    potionInventoryList.remove(itemIndex);
                }
                break;
            case 2:
                break;
        }
    }
}
