package lab4;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Main main = new Main();
        main.psvm();
    }
}

class Main{
    public void psvm(){
        int min, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj min");
        min = scanner.nextInt();
        System.out.println("Podaj max");
        max = scanner.nextInt();
        Gra gra = new Gra(min, max);
    }
}
class Gra{
    int liczba, wartosc_uzy;
    Gra(int min, int max){
        Scanner scanner = new Scanner(System.in);
        liczba = (int) Math.floor(Math.random() * max + min);
        for(int i=0;i<5;i++){
            System.out.println("Podaj wartość: ");
            wartosc_uzy = scanner.nextInt();
            if(wartosc_uzy < liczba){
                System.out.println("Za mało");
            }else if(wartosc_uzy > liczba){
                System.out.println("Za dużo");
            }else{
                System.out.println("W sam raz");
                return;
            }
        }
        System.out.println("Przegrałeś");
    }

}