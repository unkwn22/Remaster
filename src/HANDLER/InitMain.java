package HANDLER;

import INVENTORY_ENTITY.Inventory;

/*
 * for constructing INGAME uses (LOADING)
 */
public class InitMain {

    public InitMain(Inventory inventory, int mode){
        // constructing INGAME inventory instance
        InGameInventory inGameInventory;
        // heading to Start Game
        Town town = new Town(inGameInventory = new InGameInventory(inventory));
    }
}
