import java.util.*;
public class Gra {
    private static HashSet<Integer> wylosowane;
    private ArrayList<Integer> wpisane;


    public Gra() {
        if(wylosowane == null){
            wylosujLiczby();
        }
        wpisane = new ArrayList<>();
    }

    public ArrayList<Integer> getWpisane() {
        return wpisane;
    }

    public static HashSet<Integer> getWylosowane() {
        return wylosowane;
    }
    //mazwa: wylosuj liczby
    //opis: metoda losuje 6 liczb z zakresu 1, 49 bez powtorzen
    // parametry: brak
    // zwracana wartość: brak
    //autor: 000

    private void wylosujLiczby(){
        Random rand = new Random();
        wylosowane = new HashSet<>();
        while (wylosowane.size()!=6){
            wylosowane.add(rand.nextInt(1,49));
        }
    }
}
