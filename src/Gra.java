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

    public void wpiszLiczby(){
        Scanner sc = new Scanner(System.in);
        wpisane = new ArrayList<>();

        int liczba;
        for (int i = 0; i < 6; i++){
            System.out.println("Podaj " + (i + 1) + " liczbę");
            liczba = sc.nextInt();
            while (wpisane.contains(liczba)){
                System.out.println("Taka liczba już była podaj inną");
                liczba = sc.nextInt();
            }
            wpisane.add(liczba);
        }
    }

    public LinkedList<Integer> zwrocTrafione(){
        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wylosowana:wylosowane){
            if(wpisane.contains(wylosowana)){
                trafione.add(wylosowana);
            }
        }

        return trafione;
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
