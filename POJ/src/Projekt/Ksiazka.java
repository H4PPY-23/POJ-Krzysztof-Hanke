package Projekt;

import static java.lang.String.valueOf;

public class Ksiazka {
    String tytul, autor;
    int rokWydania;
    String jezyki, gatunki;
    Ksiazka(String tytul, String autor, int rokWydania, String jezyki, String gatunki){
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.jezyki = jezyki;
        this.gatunki = gatunki;
    }
    public String informacje(){
        return "tytuł: "+tytul+"\nautor: "+autor+"\nrok wydania: "+rokWydania+"\njęzki: "+jezyki+"\ngatunki: "+gatunki+"\n";
    }
}
