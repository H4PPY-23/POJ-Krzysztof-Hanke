package lab4;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Symulacja symulacja = new Symulacja();
        symulacja.psvm();
    }
}

class Moneta{
    public boolean orzel;
    Moneta(){
        int wynik = (int) Math.floor(Math.random()*2);
        if(wynik == 1){
            orzel = true;
        }
    }
}

class Symulacja{
    void psvm(){
        int n, orzel = 0, reszka = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość prób: ");
        n = scanner.nextInt();
        for (int i=0;i<n;i++){
            Moneta moneta = new Moneta();
            if(moneta.orzel){
                orzel++;
            }else{
                reszka++;
            }
        }
        System.out.println(((float)orzel/(float)n*100)+"% orzeł | "+((float)reszka/(float)n*100)+"% reszka dla "+n+" rzutów");
    }
}