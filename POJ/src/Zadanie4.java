import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args){
        System.out.println("Podaj liczbę studentów: ");
        Scanner scanner = new Scanner(System.in);
        int n_studentow = scanner.nextInt();
        int punkty_max = 0;
        String imie_max = "";
        for(int i=0;i<n_studentow;i++){
            System.out.println("Podaj imię studenta: ");
            String imie = scanner.next();
            System.out.println("Podaj liczbę punktów: ");
            int punkty = scanner.nextInt();
            if (punkty> punkty_max){
                imie_max = imie;
                punkty_max = punkty;
            }
        }
        System.out.println("Najlepszy student: " + imie_max + " punkty: " + punkty_max);
    }
}