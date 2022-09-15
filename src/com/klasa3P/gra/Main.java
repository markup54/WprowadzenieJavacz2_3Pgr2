package com.klasa3P.gra;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu 6 liczb");
        Gra gra1 = new Gra();
        gra1.wpisanieLiczb(8);
        gra1.wylosowanieLiczb(6);
        gra1.podsumowanie();
        System.out.println(gra1.trafioneLiczby);
    }
}