package com.lilspicy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int floor = 1;
        User user = new User();
        Scanner sc = new Scanner(System.in);

        while (floor< Config.MAX_FLOOR) {
            double rate = ((double) floor / 10)+1;

            if (user.hp == 0) {
                System.out.println("game over");
                break;
            }

            System.out.println("현재 " + floor + " 층");

            Monster slime = new Slime();
            slime.hp *= rate;
            slime.atk *= rate;
            slime.def *= rate;
            slime.mp*= rate;
            slime.exp *= rate;
            System.out.println("슬라임 등장");
            System.out.println("slime hp = " + slime.hp);

            while (slime.hp > 0) {
                System.out.println("my hp : " + user.hp);
                System.out.print("1: 공격, 2: 스킬, 4: 빤쓰런 5: 내정보 6: 게임종료> ");
                int choose = sc.nextInt();
                System.out.println();

                switch (choose) {
                    case 1:
                        user.attack(slime);
                        slime.attack(user);
                        System.out.println("slime hp : "+slime.hp);
                        System.out.println();
                        break;
                    case 2:
                        user.skill();
                        slime.attack(user);
                        break;

                    case 4:
                        floor--;
                        break;
                    case 5:
                        System.out.println("my lv :"+user.lv);
                        System.out.println("my atk :"+user.atk);
                        System.out.println("my def :"+user.def);
                        System.out.println("my hp :"+user.hp);
                        System.out.println("my mp :"+user.mp);
                        System.out.println("my exp :"+user.exp);
                        break;
                    case 6:
                        System.exit(0);
                }
            }
            user.exp += slime.exp;
            System.out.println("my exp = " + user.exp);
            System.out.println();
            System.out.println();

            floor++;
        }
        System.out.println("100층 클리어~!!");
    }



}
