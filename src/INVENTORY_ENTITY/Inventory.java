package INVENTORY_ENTITY;

import ITEM_ENTITY.*;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * this class will be a dynamic inventory class which is used after compiling and INGAME
 */
public class Inventory {

    // Criteria list received from Object Initiation
    private ArrayList criteriaGearList;
    private ArrayList criteriaWeaponList;
    private ArrayList criteriaPotionList;

    // Actual INGAME inventory
    private String gearSlotName      = "GEAR";
    private ArrayList gearSlotList   = new ArrayList<>();
    private String weaponSlotName    = "WEAPON";
    private ArrayList weaponSlotList = new ArrayList<>();
    private String potionSlotName    = "POTION";
    private ArrayList potionSlotList = new ArrayList<>();

    // number of counts available to upgrade
    // which means you can only upgrade your inventory 3 times
    // temporary FINAL property
    private int maxUpgradeCnt;
    private int maxSpaceCnt;
    private int currentSpaceCnt;
    private int startPotionAmount;

    // for Global method uses
    GearInventory gearInventory;
    PotionInventory potionInventory;
    WeaponInventory weaponInventory;

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
    }

    /*
     * GETTERS AND SETTERS
     */
    public ArrayList getCriteriaGearList() {
        return criteriaGearList;
    }

    public ArrayList getCriteriaWeaponList() {
        return criteriaWeaponList;
    }

    public ArrayList getCriteriaPotionList() {
        return criteriaPotionList;
    }

    public String getGearSlotName() {
        return gearSlotName;
    }

    public ArrayList getGearSlotList() {
        return gearSlotList;
    }

    public String getWeaponSlotName() {
        return weaponSlotName;
    }

    public ArrayList getWeaponSlotList() {
        return weaponSlotList;
    }

    public String getPotionSlotName() {
        return potionSlotName;
    }

    public ArrayList getPotionSlotList() {
        return potionSlotList;
    }

    public int getMaxUpgradeCnt() {
        return maxUpgradeCnt;
    }

    public int getMaxSpaceCnt() {
        return maxSpaceCnt;
    }

    public int getCurrentSpaceCnt() {
        return currentSpaceCnt;
    }

    public int getStartPotionAmount() {
        return startPotionAmount;
    }
}
