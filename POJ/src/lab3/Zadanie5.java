package lab3;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Konto konto1 = new Konto(1, 100);
        Konto konto2 = new Konto(2, 100);
        Konto konto3 = new Konto(3, 100);
        Konto konto4 = new Konto(4, 100);
        Konto konto5 = new Konto(5, 100);
        Konto konto6 = new Konto(6, 100);
        Konto konto7 = new Konto(7, 100);
        Konto konto8 = new Konto(8, 100);
        Konto konto9 = new Konto(9, 100);
        Konto konto10 = new Konto(10, 100);
        Konto[] tablica = {konto1, konto2, konto3, konto4, konto5, konto6, konto7,konto8,konto9,konto10};

        Bankomat bankomat = new Bankomat();
        bankomat.uruchom(tablica);
    }
}

class Konto{
    private int id;
    private double srodki;
    Konto(int id, double srodki){
        this.id = id;
        this.srodki = srodki;
    }
    public void stan_konta(){
        System.out.println(srodki);
    }
    public void wyplac(double wartosc){
        if(wartosc<=srodki){
            srodki-=wartosc;
        }else {
            System.out.println("Za mało środków!");
        }
    }
    public void wplac(double wartosc){
        srodki+=wartosc;
    }
}
class Bankomat{
    void uruchom(Konto[] tablica_kont){
        Scanner scanner = new Scanner(System.in);
        double wartosc =0;
        while(true) {
            System.out.print("Podaj id: ");
            int wybrane_id = scanner.nextInt()-1;
            int opcja = 0;
            while (opcja != 4) {
                System.out.println("Menu");
                System.out.println("1. Sprawdź balans");
                System.out.println("2. Wypłać");
                System.out.println("3. Wpłać");
                System.out.println("4. Wyjdź");
                System.out.print("Wybierz opcję: ");
                opcja = scanner.nextInt();
                switch (opcja) {
                    case 1:
                        tablica_kont[wybrane_id].stan_konta();
                        break;
                    case 2:
                        System.out.print("Podaj wartosc: ");
                        wartosc = scanner.nextDouble();
                        tablica_kont[wybrane_id].wyplac(wartosc);
                        break;
                    case 3:
                        System.out.print("Podaj wartosc: ");
                        wartosc = scanner.nextDouble();
                        tablica_kont[wybrane_id].wplac(wartosc);
                        break;

                }
            }
        }
    }
}