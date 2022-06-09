package HANDLER;

import INVENTORY_ENTITY.Inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Town {

    Scanner scan = new Scanner(System.in);

    public Town(Inventory inventory){
        while(true){
            HashMap<Integer, Object> inventoryTemp = InitMain.INGAMEINVENTORY;
            for(int i = 0; i < InitMain.INGAMEINVENTORY.size(); i++){
                ArrayList temp = (ArrayList) inventoryTemp.get(i);
                int size = temp.size();
            }

            int num = scan.nextInt();
        }
    }
}
