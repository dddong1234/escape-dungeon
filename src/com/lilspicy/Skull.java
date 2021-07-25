package com.lilspicy;

public class Skull extends Monster {
    public Skull(int hp, int mp, int atk, int def, int exp, int attr) {
        super(hp, mp, atk, def, exp, attr);
    }

    public Skull() {
        super(30, 30, 30, 30, 30, 1);
    }
}
