package HANDLER;

import INVENTORY_ENTITY.*;
import ITEM_ENTITY.*;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * this is where all the INGAME (instance) functions are held
 */
public class InGameInventory {
    /*
     * container that can store gears, potions, weapons
     * like I mentioned above, this class is going to be a dynamic class used all around the project
     * so the Inventory will be static (moved by pointer memory)
     */
    static HashMap<Integer, Object> INGAMEINVENTORY = new HashMap<>();

    // for returning into a group method and making things easy when objects are added
    /*
     * 0. Gear
     * 1. Potion
     * 2. Weapon
     */
    private ArrayList criteriaItemGroup = new ArrayList<>();
    private Inventory inventory;

    // number of counts available to upgrade
    // which means you can only upgrade your inventory 3 times
    // temporary FINAL property
    private int maxUpgradeCnt;
    private int maxSpaceCnt;
    private int currentSpaceCnt;
    private int startPotionAmount;

    // for Global method uses
    private GearInventory gearInventory;
    private PotionInventory potionInventory;
    private WeaponInventory weaponInventory;

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
            // for adding category lists to INGAME INVENTORY
            ArrayList emptySlot = new ArrayList<>();
            // category identifier
            switch(i){
                /*
                 * Gear
                 */
                case 0: INGAMEINVENTORY.put(i, emptySlot);
                    break;
                /*
                 * Potion
                 */
                case 1:
                    // since criteria is made up of multiple arraylists we need to take out one specific arraylist and use that element
                    ArrayList criteriaPotionTempList = (ArrayList) criteriaItemGroup.get(i);
                    // casting criteria potion object to Potion class, therefore shrimp is index 0
// Hard coded
                    Potion starterPotion   = (Potion) criteriaPotionTempList.get(0);
                    // creating a new PotionInventory class
                    PotionInventory potion = new PotionInventory(starterPotion, startPotionAmount);
                    // adding PotionInventory object to emptySlot arrayList
                    emptySlot.add(potion);
                    // adding into static INGAMEINVENTORY
                    INGAMEINVENTORY.put(i, emptySlot);
                    break;
                /*
                 * Weapon
                 */
                case 2: INGAMEINVENTORY.put(i, emptySlot);
                    break;
                default:
                    break;
            }
        }
    }

    // TODO refactor unnecessary methods
    /*
     * viewing inventory
     */
    public void viewInventory(){
        // for viewing all elements in INGAMEINVENTORY
        for(int i = 0; i < INGAMEINVENTORY.size(); i++){
            // casting each elements in INGAMEINVENTORY (HashMap)
            ArrayList viewTempList = (ArrayList) INGAMEINVENTORY.get(i);
            // viewing item method
            viewItemArrayList(i, viewTempList);
        }
    }

    // TODO refactor every for loop in case
    /*
     * param: String categoryName, ArrayList categoryList
     */
// Hard coded
    public void viewItemArrayList(int itemIndex, ArrayList categoryList){
        /*
         * 0. Gear
         * 1. Potion
         * 2. Weapon
         */
        switch(itemIndex){
            case 0:
                System.out.println(itemIndex + "]Gear");
                for(Object object : categoryList){
                    GearInventory gearInventory = (GearInventory) object;
                    Gear gear = gearInventory.getGear();
                    // defining item index
                    int itemDefineIndex = 0;
                    System.out.println(itemDefineIndex + "]Name: " + gear.getName() + " Cost:" + gear.getCost() + " Amount: " + gearInventory.getAmount());
                    itemDefineIndex++;
                }
                break;
            case 1:
                System.out.println(itemIndex + "]Potion");
                for(Object object : categoryList){
                    PotionInventory potionInventory = (PotionInventory) object;
                    Potion potion = potionInventory.getPotion();
                    // defining item index
                    int itemDefineIndex = 0;
                    System.out.println(itemDefineIndex + "]Name: " + potion.getName() + " Cost:" + potion.getCost() + " Amount: " + potionInventory.getAmount());
                    itemDefineIndex++;
                }
                break;
            case 2:
                System.out.println(itemIndex + "]Weapon");
                for(Object object : categoryList){
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

    /*
     * method for using or tossing items
     * param: String use or toss, which category, which item, number of items
     */
    public void useOrTossItem(int categoryIndex, int itemIndex, int amount){
// Hard coded
        // selecting category to enter
        switch(categoryIndex){
            case 0:
                break;
            case 1:
                ArrayList categoryItemList          = (ArrayList) INGAMEINVENTORY.get(categoryIndex);
                PotionInventory potionInventoryTemp = (PotionInventory) categoryItemList.get(itemIndex);
                int currentAmount                   = potionInventoryTemp.getAmount();
                int calculationResult               = currentAmount -= amount;
                if(calculationResult > 0){
                    potionInventoryTemp.setAmount(calculationResult);
                    categoryItemList.set(itemIndex, potionInventoryTemp);
                }else{
                    categoryItemList.remove(itemIndex);
                }
                break;
            case 2:
                break;
        }
    }
}
