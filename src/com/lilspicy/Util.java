package com.lilspicy;


public final class Util {
    public static boolean percent(int a) {
        int p = (int)(Math.random()*101);
        if (0 <= p && p < a) {
            return true;
        } else {
            return false;
        }
    }
}
