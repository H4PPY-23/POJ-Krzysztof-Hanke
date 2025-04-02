package lab1;
import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args){
        System.out.println("Podaj stopnie celsjusza");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double farenheit = (9/5) * celsius + 32;
        System.out.println("Stopnie farenheita: " + farenheit);
    }
}