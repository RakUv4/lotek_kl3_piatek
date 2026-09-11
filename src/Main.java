import java.util.*;
public class Main {
    public static void main(String[] args) {
    Gra gra = new Gra();


        gra.wpiszLiczby();
        System.out.println("wylosowane: "+ Gra.getWylosowane());
        System.out.println("wpisane liczby " + gra.getWpisane());
        System.out.println("trafione " + gra.zwrocTrafione());

        Gra gra2 = new Gra();
        System.out.println("te same liczby sie losują "+gra2.getWylosowane());

    }
}