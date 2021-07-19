package com.lilspicy;


public class Alive implements Fightable {
    int hp;
    int mp;
    int atk;
    int def;
    int exp;
    int attr;

    public Alive(int hp, int mp, int atk, int def, int exp, int attr) {
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.exp = exp;
        this.attr = attr;
    }

    public Alive() {
    }

    public void attack(Alive a) {
        a.hp -= this.atk;
    }
}
