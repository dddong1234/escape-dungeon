package com.lilspicy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dragon d = new Dragon();
        Dragon d2 = new Dragon();

        d.attack(d2);
        System.out.println(d2.hp);


        int floor = 1;
        while (floor< Config.MAX_FLOOR) {

            floor++;
        }
        System.out.println("100층 클리어~!!");
    }



}
