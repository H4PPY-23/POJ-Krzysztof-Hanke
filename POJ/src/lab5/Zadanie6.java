package lab5;

public class Zadanie6 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(5));
        System.out.println(calculator.calculate(2,5));
        System.out.println(calculator.calculate(1,2,3));
    }
}

class Calculator{
    int calculate(int a){
        return a*a;
    }
    int calculate(int a, int b){
        return a*b;
    }
    int calculate(int a, int b, int c){
        return a+b+c;
    }
}