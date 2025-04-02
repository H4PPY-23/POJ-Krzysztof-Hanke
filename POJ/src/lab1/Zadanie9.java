
package lab1;import java.util.Scanner;
import java.lang.Math;

public class Zadanie9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj x1");
        double x1 = sc.nextDouble();
        System.out.print("Podaj y1");
        double y1 = sc.nextDouble();
        System.out.print("Podaj x2");
        double x2 = sc.nextDouble();
        System.out.print("Podaj y2");
        double y2 = sc.nextDouble();
        double odleglosc = Math.pow(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2), 0.5);
        System.out.print("Odległość wynosi: " + odleglosc);
    }
}
