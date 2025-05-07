package lab7.Zadanie1;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Osoba osoba = null;

        while (osoba == null) {
            try {
                System.out.print("Podaj imię: ");
                String imie = scanner.nextLine();

                System.out.print("Podaj nazwisko: ");
                String nazwisko = scanner.nextLine();

                System.out.print("Podaj rok urodzenia: ");
                int rok = Integer.parseInt(scanner.nextLine());

                osoba = new Osoba(imie, nazwisko, rok);
            } catch (Exception ex) {
                System.out.println("Błąd: " + ex.getMessage());
            }
        }


        System.out.println(osoba);
    }
}