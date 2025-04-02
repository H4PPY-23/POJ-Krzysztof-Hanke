package lab2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Zadanie2 {
    public static int min(int rozmiar, int[] tablica){
        int min = tablica[0];
        for(int i=0;i<rozmiar;i++){
            if(tablica[i]<min){
                min = tablica[i];
            }
        }
        return min;
    }

    public static int max(int rozmiar, int[] tablica){
        int max = tablica[0];
        for(int i=0;i<rozmiar;i++){
            if(tablica[i]>max){
                max = tablica[i];
            }
        }
        return max;
    }

    public static int suma(int rozmiar, int[] tablica){
        int suma=0;
        for(int i=0;i<rozmiar;i++){
            suma+=tablica[i];
        }
        return suma;
    }

    public static float srednia(int rozmiar, int[] tablica){
        float srednia = 0;
        for(int i=0;i<rozmiar;i++){
            srednia+=tablica[i];
        }
        srednia/=rozmiar;
        return srednia;
    }

    public static float mediana(int rozmiar, int[] tablica){
        float mediana;
        if(rozmiar==1) {
            mediana = tablica[0];
        }else if(rozmiar%2==1){
            mediana = tablica[rozmiar/2];
        }else{
            mediana = (tablica[rozmiar/2-1] + tablica[rozmiar/2])/2;
        }
        return mediana;
    }

    public static void main(String[] args){
        System.out.print("Podaj wielkość tablicy: ");
        Scanner sc = new Scanner(System.in);
        int rozmiar = sc.nextInt();
        int[] tablica = new int[rozmiar];
        System.out.print("Podaj pierwszy element: ");
        tablica[0] = sc.nextInt();
        for(int i = 1;i<rozmiar;i++){
            if(tablica[i-1]%2 == 0){
                tablica[i] = tablica[i-1]+2;
            }else{
                tablica[i] = tablica[i-1]+1;
            }
        }

        for(int i = 0;i<rozmiar;i++){
            System.out.print(tablica[i]+" ");
        }

        System.out.print("\nmin: " + min(rozmiar, tablica));
        System.out.print("\nmax: " + max(rozmiar, tablica));
        System.out.print("\nsuma: " + suma(rozmiar, tablica));
        System.out.print("\nśrednia: " + srednia(rozmiar, tablica));
        System.out.print("\nmediana: " + mediana(rozmiar, tablica));
    }
}
