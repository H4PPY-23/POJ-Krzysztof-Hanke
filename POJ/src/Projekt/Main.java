package Projekt;

public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();
        Ulubione ulubione = new Ulubione();
        Ksiazka ksiazka0 = new Ksiazka(
                "1984",
                "George Orwell",
                1949,
                "angielski, polski",
                "dystopia, poważne"
        );
        Ksiazka ksiazka1 = new Ksiazka(
                "Pan tadeusz",
                "Adam mickiewicz",
                2005,
                "polski",
                "słabe"
        );
        Ksiazka ksiazka2 = new Ksiazka(
                "Lalka",
                "Bolesław Prus",
                1889,
                "polski",
                "spoko nawet takie, dramat"
        );
        Ksiazka ksiazka3 = new Ksiazka(
                "Atak Tytanów",
                "Isayama Hajime",
                2009,
                "japoński, polski, angielski",
                "manga, komiks"
        );
        biblioteka.dodajKsiazke(ksiazka0);
        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);
        ulubione.dodajKsiazke(ksiazka0);

        boolean flag;
        do{
             flag = Interfejs.main(biblioteka, ulubione);
        }while (flag);
    }
}