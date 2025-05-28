package lab9.Zadanie2i3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Klucze<Integer, String> slownik = new Klucze<>(5);
        slownik.dodaj(2,"dwa");
        slownik.dodaj(3,"trzy");
        System.out.println(slownik.czyZawiera(2));
        System.out.println(slownik.toString());
        Klucze<String, String> slownik1 = new Klucze<>(5);
        slownik1.dodaj("Marek Kowalski","Żywy");
        System.out.println(slownik1.wielkosc());
        System.out.println(slownik1.toString());
        Klucze.wczytajSlownik(new File("./POJ/src/lab9/Zadanie2i3/slownik.txt"));
    }
}
