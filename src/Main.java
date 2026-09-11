import java.util.*;
public class Main {
    public static void main(String[] args) {
    Gra gra = new Gra();
        System.out.println(Gra.getWylosowane());

        Gra gra2 = new Gra();
        System.out.println("te same liczby sie losują "+gra2.getWylosowane());

    }
}