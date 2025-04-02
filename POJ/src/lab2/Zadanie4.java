package lab2;

import java.awt.*;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.print("Podaj szerokość tablicy: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Podaj wysokość tablicy: ");
        int y = sc.nextInt();
        int rozmiar = x*y;
        String[][] tablica = new String[y][x];
        for(int i = 0;i<y;i++){
            for(int j = 0;j<x;j++){
                System.out.print("Podaj element "+i+"-"+j+": ");
                tablica[i][j] = sc.next();
            }
        }

        for(int i = 0;i<y;i++){
            for(int j = 0;j<x;j++){
                System.out.print(tablica[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
