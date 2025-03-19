import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj bok 1: ");
        double bok1 = scanner.nextDouble();
        System.out.print("Podaj bok 2: ");
        double bok2 = scanner.nextDouble();
        System.out.print("Podaj bok 3: ");
        double bok3 = scanner.nextDouble();
        if(bok1 + bok2 <= bok3 || bok1 + bok3 <= bok2 || bok2 + bok3 <= bok1){
            System.out.print("To nie jest trójkąt");
        }else{
            System.out.print("To jest trójkąt");
        }
    }
}
