package lab2;

import java.util.Scanner;

public class Zadanie3 {

    public static double[] suma(double[] tablica1, double[] tablica2){
        if(tablica1.length != tablica2.length){
            double[] tablicaSuma = new double[1];
            return tablicaSuma;
        }else{
            double[] tablicaSuma = new double[tablica1.length];
            for(int i = 0;i<tablica1.length;i++){
                tablicaSuma[i] = tablica1[i] + tablica2[i];
            }
            return tablicaSuma;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy1: ");
        int rozmiar1 = scanner.nextInt();
        double[] tablica1 = new double[rozmiar1];
        for(int i = 0;i<rozmiar1;i++){
            System.out.print("Podaj element numer "+i+": ");
            tablica1[i] = scanner.nextInt();
        }

        System.out.print("Podaj rozmiar tablicy2: ");
        int rozmiar2 = scanner.nextInt();
        double[] tablica2 = new double[rozmiar2];
        for(int i = 0;i<rozmiar2;i++){
            System.out.print("Podaj element numer "+i+": ");
            tablica2[i] = scanner.nextInt();
        }

        double[] tablicaSuma = suma(tablica1, tablica2);
        for(int i = 0;i<tablicaSuma.length;i++){
            System.out.print(tablicaSuma[i] + " ");
        }
    }
}
