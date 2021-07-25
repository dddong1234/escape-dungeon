package com.lilspicy;


public class User extends Alive{
    int lv;

    public User(int hp, int mp, int atk, int def, int exp, int attr) {
        super(hp, mp, atk, def, exp, attr);
    }
    public User() {
        super(100, 100, 10, 0, 0,0);
        lv = 1;

        if (Util.percent(50)) {
            this.atk = 9999;
            this.hp = 9999;
            this.mp = 9999;
            this.def = 9999;
        }
    }
    public void attack(Alive a) {
        a.hp -= this.atk;
        System.out.println("푸슉푸슉~");
    }
    public void skill() {
        System.out.println("this is skill");
    }

}
