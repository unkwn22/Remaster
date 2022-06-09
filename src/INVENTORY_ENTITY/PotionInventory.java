package INVENTORY_ENTITY;

import ITEM_ENTITY.*;

/*
 * individual property
 */
public class PotionInventory {

    private Potion potion;
    private int amount;

    public PotionInventory(Potion potion, int amount){
        this.potion = potion;
        this.amount = amount;
    }

    /*
     * GETTERS AND SETTERS
     */
    public Potion getPotion() {
        return potion;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
