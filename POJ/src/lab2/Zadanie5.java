package lab2;

import java.awt.*;
import java.util.Scanner;

public class Zadanie5 {
    public static double[][] suma(double[][] tablica1, double[][] tablica2, int x, int y){
        if(tablica1.length != tablica2.length){
            double[][] tablicaSuma = {{0.0},{0.0}};
            return tablicaSuma;
        } else{
            double[][] tablicaSuma = new double[x][y];
            for(int i=0;i<y;i++){
                for(int j=0;j<x;j++){
                    tablicaSuma[i][j] = tablica1[i][j] + tablica2[i][j];
                }
            }
            return tablicaSuma;
        }
    }

    public static void main(String[] args) {
        System.out.print("Podaj szerokość tablicy1: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.print("Podaj wysokość tablicy1: ");
        int y1 = sc.nextInt();
        int rozmiar1 = x1*y1;
        double[][] tablica1 = new double[y1][x1];
        for(int i = 0;i<y1;i++){
            for(int j = 0;j<x1;j++){
                System.out.print("Podaj element "+i+"-"+j+": ");
                tablica1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Podaj szerokość tablicy2: ");
        int x2 = sc.nextInt();
        System.out.print("Podaj wysokość tablicy2: ");
        int y2 = sc.nextInt();
        int rozmiar = x2*y2;
        double[][] tablica2 = new double[y2][x2];
        for(int i = 0;i<y2;i++){
            for(int j = 0;j<x2;j++){
                System.out.print("Podaj element "+i+"-"+j+": ");
                tablica2[i][j] = sc.nextInt();
            }
        }

        double[][] tablicaSuma = suma(tablica1, tablica2, x1, y1);

        for(int i = 0;i<y2;i++){
            for(int j = 0;j<x2;j++){
                System.out.print(tablicaSuma[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
