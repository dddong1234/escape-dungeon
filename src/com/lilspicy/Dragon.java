package com.lilspicy;


public class Dragon extends Monster{

    public Dragon(int hp, int mp, int atk, int def, int exp, int attr) {
        super(hp, mp, atk, def, exp, attr);
        classifyRareMonster();
    }

    public Dragon() {
        super(100,100,50,30,100,1);
        classifyRareMonster();
    }

    public String skill1(){
        return "this is dragon skill1";
    }
}
