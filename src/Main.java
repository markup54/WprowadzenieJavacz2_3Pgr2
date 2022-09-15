public class Main {
    public static void main(String[] args) {
        //Losowanie 6 liczb zapiszemy je w tablicy potem w kolekcji
        //wpisywanie 6 liczb
        //sprawdzenie ile trafiony
        System.out.println("Witaj na losowaniu 6 liczb");
        //tablica wylosowane
        int wylosowane[] = new int [6];
        //wartości w tablicy typu prostego lub złożonego
        //w tablicy nie ma możliwości zmiany jej rozmiaru po jej deklaracji
        for(int i=0;i< wylosowane.length;i++){
            wylosowane[i]=(int)(Math.random()*100+1);
        }
        for (int element : wylosowane){
            System.out.print(element+", ");
        }
        int wylosowana2 [] ;
        wylosowana2 = wylosowane;
        wylosowane[0] = 0;
        System.out.println();
        System.out.println("tablica 1");
        for (int element : wylosowane){
            System.out.print(element+", ");
        }
        System.out.println("tablica 2");
        for (int element : wylosowana2){
            System.out.print(element+", ");
        }
        System.out.println(wylosowane);
        System.out.println(wylosowana2);
        int wylosowane3[];
        wylosowane3=wylosowane.clone();
        wylosowane[1]=0;
        System.out.println("tablica 1");
        for (int element : wylosowane){
            System.out.print(element+", ");
        }
        System.out.println("tablica 2");
        for (int element : wylosowana2){
            System.out.print(element+", ");
        }
        System.out.println("tablica 3");
        for (int element : wylosowane3){
            System.out.print(element+", ");
        }
    }
}