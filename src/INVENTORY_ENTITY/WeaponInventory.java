package INVENTORY_ENTITY;

import ITEM_ENTITY.*;

/*
 * individual property
 */
public class WeaponInventory {

    private Weapon weapon;
    private int amount;

    public WeaponInventory(Weapon weapon, int amount){
        this.weapon = weapon;
        this.amount = amount;
    }

    /*
     * GETTERS AND SETTERS
     */
    public Weapon getWeapon() {
        return weapon;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
