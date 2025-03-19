import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double l1 = sc.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double l2 = sc.nextDouble();
        System.out.print("Podaj trzecią liczbę: ");
        double l3 = sc.nextDouble();
        if(l1 < l2 && l1 < l3){
            //l1
            if(l2<l3){
                System.out.print(l1 + " " + l2 + " " + l3);
            }else{
                System.out.print(l1 + " " + l3 + " " + l2);
            }
        } else if(l2 < l3 && l2 < l1){
            //l2
            if(l1<l3){
                System.out.print(l2 + " " + l1 + " " + l3);
            }else{
                System.out.print(l2 + " " + l3 + " " + l1);
            }
        }else{
            //l3
            if(l1<l2){
                System.out.print(l3 + " " + l1 + " " + l2);
            }else{
                System.out.print(l3 + " " + l2 + " " + l1);
            }
        }
    }
}
