package INIT;

import ITEM.*;
import INVENTORY.*;

import java.util.ArrayList;

// object, item, structure create(initiation)
public class InitObject {

    // Base criteria list
    ArrayList<Gear> gearList = new ArrayList<>();
    ArrayList<Potion> potionList = new ArrayList<>();
    ArrayList<Weapon> weaponList = new ArrayList<>();

    Gear gearItem;
    Potion potionItem;
    Weapon weaponItem;
    Inventory inventory;

    Space spaceObject = new Space();
    int maxUpgradeCnt;
    int maxSpaceCnt;

    // Initiation
    public InitObject(){

        // initiate inventory settings
        this.maxUpgradeCnt = spaceObject.getMaxUpgradeCnt();
        this.maxSpaceCnt   = spaceObject.getMaxSpaceCnt();
        // creating inventory
        Inventory inventoryInit = new Inventory(maxUpgradeCnt, maxSpaceCnt);

        // initiate create gear
        gearItem = new Gear("Bronze gear", 10, 10);
        gearList.add(gearItem);

        gearItem = new Gear("Iron gear", 15, 15);
        gearList.add(gearItem);

        gearItem = new Gear("Steel gear", 20, 20);
        gearList.add(gearItem);

        gearItem = new Gear("Black gear", 25, 25);
        gearList.add(gearItem);

        gearItem = new Gear("Mithril gear", 30, 30);
        gearList.add(gearItem);

        gearItem = new Gear("Adamant gear", 35, 35);
        gearList.add(gearItem);

        gearItem = new Gear("Dragon gear", 40, 40);
        gearList.add(gearItem);

        // initiate create potion
        potionItem = new Potion("Shrimp", 1, 3);
        potionList.add(potionItem);

        potionItem = new Potion("Trout", 3, 5);
        potionList.add(potionItem);

        potionItem = new Potion("Salmon", 5, 7);
        potionList.add(potionItem);

        potionItem = new Potion("Lobster", 10, 10);
        potionList.add(potionItem);

        potionItem = new Potion("Mantray", 15, 15);
        potionList.add(potionItem);

        // initiate create weapon
        weaponItem = new Weapon("Bronze sword", 20, 10);
        weaponList.add(weaponItem);

        weaponItem = new Weapon("Iron sword", 30, 20);
        weaponList.add(weaponItem);

        weaponItem = new Weapon("Steel sword", 40, 30);
        weaponList.add(weaponItem);

        weaponItem = new Weapon("Black sword", 50, 40);
        weaponList.add(weaponItem);

        weaponItem = new Weapon("Mithril sword", 60, 50);
        weaponList.add(weaponItem);

        weaponItem = new Weapon("Adamant sword", 70, 60);
        weaponList.add(weaponItem);

        weaponItem = new Weapon("Dragon sword", 80, 70);
        weaponList.add(weaponItem);
    }
}
