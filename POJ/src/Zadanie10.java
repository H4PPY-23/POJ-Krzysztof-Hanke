import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args){
        int los = (int) Math.floor((Math.random()*3));
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj 0papier 1kamień lub 2nożyce");
        int pkn = sc.nextInt();
        if(los == pkn){
            System.out.print("Remis");
        }else {
            if(los == 0){
                if(pkn == 1){
                    System.out.print("01przegrana");
                }else{
                    System.out.print("02wygrana");
                }
            }else if(los ==1){
                if(pkn ==0){
                    System.out.print("10wygrana");
                }else{
                    System.out.print("12przegrana");
                }
            }else{
                if(pkn ==0){
                    System.out.print("20przegrana");
                }else{
                    System.out.print("21wygrana");
                }
            }
        }
    }
}
