package com.klasa3P.gra;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu 6 liczb");
        Gra gra1 = new Gra();
        gra1.zagraj(4);
        gra1.zagraj(10);
        Gra gra2 = new Gra();
        gra2.zagraj(3);
    }
}