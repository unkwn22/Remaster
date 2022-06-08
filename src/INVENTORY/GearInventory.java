package INVENTORY;

import java.util.ArrayList;
import ITEM.*;

/*
 * individual property
 */
public class GearInventory {

    private Gear gear;

    private int amount;

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
