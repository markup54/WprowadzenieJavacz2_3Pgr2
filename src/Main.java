import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Witaj na losowaniu 6 liczb");
        //losowanie bez powtórzeń
        //kolekcje
        //mogą mieć tylko typy złożone
        //po zadeklarowaniu można usuwać i dodawać elementy
        Set<Integer> wylosowane = new HashSet<>();
        //zbiór zazwyczaj zawiera elementy bez powtórzeń
        //zbiór zazwyczaj nie ma indeksowania elementów
        while (wylosowane.size() < 6) {
            wylosowane.add((int) (Math.random() * 100 + 1));
        }
        for (int element : wylosowane) {
            System.out.print(element + ", ");
        }
        System.out.println("wylosowane inaczej:");
        System.out.println(wylosowane);

        //wpisywanie 6 liczb z klawiatury
        //dodajemy elementy na końcu listy
        //na razie dowolnie potem bez powtórzeń
        Scanner klawiatura = new Scanner(System.in);
        //Lista to kolekcja w której można zmieniać rozmiar w trakcie działania programu
        //elementy indeksowane mogą się powtarzać
        System.out.println("podaj 6 liczb");
        List<Integer> wpisane = new ArrayList<>();
        while (wpisane.size() < 6) {
            int liczba = klawiatura.nextInt();
            while (wpisane.contains(liczba)) {
                System.out.println("Już taką liczbę wpisano wpisz inną ");
                liczba = klawiatura.nextInt();
            }
            wpisane.add(liczba);
        }
        System.out.println(wpisane);
    }
}