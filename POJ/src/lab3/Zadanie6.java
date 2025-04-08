package lab3;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ekwipunek = 1, bron = 30;
        double zbroja = 0.7;
        System.out.println("Symulator walki");
        System.out.println("Podaj swoje imie: ");
        String imie = scanner.next();
        System.out.println("Wybierz ekwipunek 1 - Podwójny miecz, 2 - Miecz i tarcza, 3 - DUUUŻA tarcza");
        ekwipunek = scanner.nextInt();
        switch (ekwipunek){
            case 1:
                bron = 40;
                zbroja = 1;
                break;
            case 2:
                bron = 30;
                zbroja = 0.7;
                break;
            case 3:
                bron = 20;
                zbroja = 0.5;
                break;
        }
        Gracz gracz = new Gracz(bron, zbroja, imie);
        System.out.println("Wybierz przeciwnika 1 - Przemek, 2 - Mateusz, 3 - Przystojniejszy Przemek");
        ekwipunek = scanner.nextInt();
        switch (ekwipunek){
            case 1:
                bron = 50;
                zbroja = 1;
                imie = "Przmek";
                break;
            case 2:
                bron = 30;
                zbroja = 0.7;
                imie = "Mateusz";
                break;
            case 3:
                bron = 15;
                zbroja = 0.4;
                imie = "Przystojniejszy Przemek";
                break;
        }
        Przeciwnik przeciwnik = new Przeciwnik(bron,zbroja,imie);

        boolean ruch_gracza = true;
        while (gracz.hp > 0 && przeciwnik.hp > 0){
            if(ruch_gracza){
                System.out.println("Ruch gracza");
                przeciwnik.hp -= gracz.bron*przeciwnik.zbroja;
                System.out.println("Życie przeciwnika: "+przeciwnik.hp);
                ruch_gracza = !ruch_gracza;
            }else{
                System.out.println("Ruch przeciwnika");
                gracz.hp -= przeciwnik.bron*gracz.zbroja;
                System.out.println("Życie gracza: "+gracz.hp);
                ruch_gracza = !ruch_gracza;
            }
        }
        if(gracz.hp>0){
            System.out.println("Zwycięzca: "+gracz.imie);
        }else{
            System.out.println("Przegrana!");
        }
    }
}
class Postac{
    public double hp = 100, bron;
    double zbroja;
    String imie;

}
class Gracz extends Postac{
    Gracz(int bron, double zbroja, String imie){
        this.bron = bron;
        this.zbroja = zbroja;
        this.imie = imie;
    }
}
class Przeciwnik extends Postac{
    Przeciwnik(int bron, double zbroja, String imie){
        this.bron = bron;
        this.zbroja = zbroja;
        this.imie = imie;
    }
}