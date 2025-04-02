package lab1;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj literę 1");
        char litera1 = scanner.next().charAt(0);
        System.out.print("Podaj literę 2");
        char litera2 = scanner.next().charAt(0);
        if(litera1 < litera2){
            System.out.print(litera2);
        } else if (litera1 > litera2) {
            System.out.print(litera1);
        } else{
            System.out.print("błąd");
        }
    }
}
