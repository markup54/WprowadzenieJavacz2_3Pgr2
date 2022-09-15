import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Witaj na losowaniu 6 liczb");
        Set<Integer> wylosowaneLiczby = new HashSet<>();
        List<Integer> wpisaneLiczby = new ArrayList<>();
        List<Integer> trafioneLiczby = new LinkedList<>();
        wylosowaneLiczby = wylosowanieLiczb(6);
        wpisaneLiczby = wpisanieLiczb(10);
        trafioneLiczby = podsumowanie(wpisaneLiczby, wylosowaneLiczby);
        System.out.println("Wylosowano:" + wylosowaneLiczby);
        System.out.println("Trafiono:" + trafioneLiczby);
    }

    public static Set<Integer> wylosowanieLiczb(int n) {
        Set<Integer> wylosowane = new HashSet<>();
        while (wylosowane.size() < n) {
            wylosowane.add((int) (Math.random() * 100 + 1));
        }
        return wylosowane;
    }

    public static List<Integer> wpisanieLiczb(int n) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj 6 liczb");
        List<Integer> wpisane = new ArrayList<>();
        while (wpisane.size() < n) {
            int liczba = klawiatura.nextInt();
            while (wpisane.contains(liczba)) {
                System.out.println("Już taką liczbę wpisano wpisz inną ");
                liczba = klawiatura.nextInt();
            }
            wpisane.add(liczba);
        }
        return wpisane;
    }

    public static List<Integer> podsumowanie(List<Integer> wpisane,
                                             Set<Integer> wylosowane) {
        List<Integer> trafione = new LinkedList<>();
        for (Integer wpisanaWartosc : wpisane) {
            if (wylosowane.contains(wpisanaWartosc))
                trafione.add(wpisanaWartosc);
        }
        return trafione;
    }
}