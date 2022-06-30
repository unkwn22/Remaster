package INVENTORY_ENTITY;

import ITEM_ENTITY.*;

/*
 * individual property
 */
public class GearInventory {
    private Gear gear;
    private int amount;

    public GearInventory(Gear gear, int amount){
        this.gear   = gear;
        this.amount = amount;
    }

    /*
     * GETTERS AND SETTERS
     */
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Gear getGear() {
        return gear;
    }

}
