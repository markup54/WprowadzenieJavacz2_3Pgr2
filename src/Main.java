import java.util.HashSet;
import java.util.Set;

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

    }
}