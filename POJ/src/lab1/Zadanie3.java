package lab1;
public class Zadanie3 {
    public static void main(String[] args){
        System.out.println("Miles   Kilometers");
        for (int i = 1;i <= 10; i++){
            double kilo = i * 1.609;
            System.out.println(i + " " + kilo);
        }
    }
}