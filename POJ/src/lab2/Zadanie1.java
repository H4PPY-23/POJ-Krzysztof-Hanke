package lab2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args){
        System.out.print("Podaj wielkość tablicy: ");
        Scanner sc = new Scanner(System.in);
        int rozmiar = sc.nextInt();
        String[] tablica = new String[rozmiar];
        for(int i = 0;i<rozmiar;i++){
            System.out.print("Podaj element numer "+i+": ");
            tablica[i] = sc.next();
        }
        for(int i = 0;i<rozmiar;i++){
            System.out.print(tablica[i]+' ');
        }
    }
}
