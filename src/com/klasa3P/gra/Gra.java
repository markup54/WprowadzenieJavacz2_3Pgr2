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
    List<Integer> trafioneLiczby = new LinkedList<>();

    public void wylosowanieLiczb(int n) {
        while (wylosowaneLiczby.size() < n) {
            wylosowaneLiczby.add((int) (Math.random() * 100 + 1));
        }
    }

    public void wpisanieLiczb(int n) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj " + n + " liczb");
        while (wpisaneLiczby.size() < n) {
            int liczba = klawiatura.nextInt();
            while (wpisaneLiczby.contains(liczba)) {
                System.out.println("Już taką liczbę wpisano wpisz inną ");
                liczba = klawiatura.nextInt();
            }
            wpisaneLiczby.add(liczba);
        }
    }

    public void podsumowanie() {
        for (Integer wpisanaWartosc : wpisaneLiczby) {
            if (wylosowaneLiczby.contains(wpisanaWartosc))
                trafioneLiczby.add(wpisanaWartosc);
        }
    }
}
