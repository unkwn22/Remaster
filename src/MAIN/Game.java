package MAIN;

import INIT.*;

import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);

    public Game(){
        InitObject init = new InitObject();
        // TODO will i have to pass the instance to another package or make its own handler
        // TODO making its own handler page inside of the INVENTORY package or on its own
        while(true){
            int num = scan.nextInt();
        }
    }

    public static void main(String[] args) {

        new Game();
    }

}
