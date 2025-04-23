package lab5;

public class Zadanie4 {
    public static void main(String[] args) {
        Klasa klasa = new Klasa(1,2,3,4,5);
        System.out.println(klasa.toString());
    }
}

class Klasa{
    int a1, a2, a3,a4,a5;
    Klasa(int a1, int a2, int a3, int a4, int a5){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }
    @Override
    public String toString(){
        return a1+", "+a2+", "+a3+", "+a4+", "+a5;
    }
}