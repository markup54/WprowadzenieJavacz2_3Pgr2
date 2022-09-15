package com.klasa3P.gra;

import java.util.*;

public class Gra {
    //modyfikatory dostępu
    /*
    public -dostępne wszędzie
    brak - dostępne wszędzie w pakiecie
    private - dostępne tylko w klasie
    protected - w klasie i klasach potomnych oraz w pakiecie
    używanie private hermetyzacja
     */
    private Set<Integer> wylosowaneLiczby = new HashSet<>();
    private List<Integer> wpisaneLiczby = new ArrayList<>();
    private List<Integer> trafioneLiczby = new LinkedList<>();

    private void wylosowanieLiczb(int n) {
        while (wylosowaneLiczby.size() < n) {
            wylosowaneLiczby.add((int) (Math.random() * 100 + 1));
        }
    }

    private void wpisanieLiczb(int n) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj " + n + " liczb");
        wpisaneLiczby.clear();
        while (wpisaneLiczby.size() < n) {
            int liczba = klawiatura.nextInt();
            while (wpisaneLiczby.contains(liczba)) {
                System.out.println("Już taką liczbę wpisano wpisz inną ");
                liczba = klawiatura.nextInt();
            }
            wpisaneLiczby.add(liczba);
        }
    }

    private void podsumowanie() {
        for (Integer wpisanaWartosc : wpisaneLiczby) {
            if (wylosowaneLiczby.contains(wpisanaWartosc))
                trafioneLiczby.add(wpisanaWartosc);
        }
    }

    public void zagraj(int liczbaWpisanych) {
        wylosowanieLiczb(6);
        wpisanieLiczb(liczbaWpisanych);
        podsumowanie();
        System.out.println("Wylosowano:" + wylosowaneLiczby);
        System.out.println("Wpisano:" + wpisaneLiczby);
        System.out.println("Trafiono" + trafioneLiczby);
    }
}
