package INVENTORY_ENTITY;

import ITEM_ENTITY.*;

import java.util.ArrayList;

/*
 * this class will be a dynamic inventory class which is used after compiling and INGAME
 */
public class Inventory {

    // for returning into a group method and making things easy when objects are added
    ArrayList criteriaItemGroup = new ArrayList<>();

    // Actual INGAME inventory
    private ArrayList gearSlotList   = new ArrayList<>();
    private ArrayList potionSlotList = new ArrayList<>();
    private ArrayList weaponSlotList = new ArrayList<>();

    // number of counts available to upgrade
    // which means you can only upgrade your inventory 3 times
    // temporary FINAL property
    private int maxUpgradeCnt;
    private int maxSpaceCnt;
    private int currentSpaceCnt;
    private int startPotionAmount;

    /*
     * beginning initiation for creating inventory class & upgrading inventory slot spaces
     */
    public Inventory(int startPotionAmount, ArrayList criteriaItemGroup){
        Space space = new Space();
        // temporary FINAL properties
        maxSpaceCnt     = space.getMaxSpaceCnt();
        maxUpgradeCnt   = space.getMaxUpgradeCnt();
        currentSpaceCnt = space.getMaxStartSpaceCnt();

        // amount of shrimps started
        this.startPotionAmount = startPotionAmount;
    }

    /*
     * GETTERS AND SETTERS
     */
    public ArrayList getCriteriaItemGroup() {
        return criteriaItemGroup;
    }

    public ArrayList getGearSlotList() {
        return gearSlotList;
    }


    public ArrayList getWeaponSlotList() {
        return weaponSlotList;
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
