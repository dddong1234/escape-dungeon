package com.lilspicy;


import java.util.ArrayList;
import java.util.Random;

public class Monster extends Alive {
    boolean isRare;
    boolean hasItem;
    Item item;

    public Monster(int hp, int mp, int atk, int def, int exp, int attr) {
        super(hp, mp, atk, def, exp, attr);
        classifyRareMonster();
        generateItem();

        if (Util.percent(10)) {
            //레어몹
            isRare = true;
        } else {
            //노멀몹
            isRare = false;
        }

        if (Util.percent(50)) {
            hasItem = true;
        } else {
            hasItem = false;
        }
    }

    protected void generateItem() {
        if (hasItem) {
            Item item = new Item();
        }
    }

    protected void classifyRareMonster() {
        if (isRare) {
            hp *= 2;
            mp *= 2;
            atk *= 2;
            def *= 2;
            exp *= 2;
            attr *= 2;
            System.out.print("Rare");;
        }
    }

//    public static ArrayList<Monster> makeMonsterList() {
//        ArrayList monsterList = generateMonsterInArray();
//        return monsterList;
//    }
//
//    private static ArrayList<Monster> generateMonsterInArray() {
//        ArrayList<Monster> monsterList = new ArrayList();
//        Random random = new Random();
//        for (int i = 0; i < 4; i++) {
//            int selector = random.nextInt(4) + 1;

//            if (selector == 1) {
           // monsterList.add(new Dragon());
//            } else if (selector == 2) {
//                monsterList.add(new Monster());
//            } else if (selector == 3) {
//                monsterList.add(new Monster());
//            } else if (selector == 4) {
//                monsterList.add(new Monster());
//            }
//        }
//        return monsterList;
//    }
}
