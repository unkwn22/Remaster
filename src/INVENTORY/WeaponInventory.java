package INVENTORY;

import ITEM.*;

/*
 * individual property
 */
public class WeaponInventory {

    private Weapon weapon;
    private int amount;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
