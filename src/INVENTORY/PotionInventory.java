package INVENTORY;

import ITEM.*;

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

    public Potion getPotion() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
