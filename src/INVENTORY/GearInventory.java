package INVENTORY;

import ITEM.*;

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }
}
