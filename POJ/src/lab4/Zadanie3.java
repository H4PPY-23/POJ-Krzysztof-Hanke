package lab4;
import lab4.Kolor;
import lab4.Figura;

public class Zadanie3 {
    public static void main(String[] args) {
        Karta karta = new Karta(Kolor.KARO, Figura.AS);
        System.out.println(karta.toString());
        for(Kolor kolor : Kolor.values()){
            for(Figura figura : Figura.values()){
                Karta karta1 = new Karta(kolor, figura);
                System.out.print(karta1.toString());
            }
            System.out.print("\n");
        }
    }
}

class Karta{
    private final Kolor kolor;
    private final Figura figura;
    public Karta(Kolor kolor, Figura figura){
        this.kolor = kolor;
        this.figura = figura;
    }

    @Override
    public String toString() {
        return figura.nazwa+" "+kolor+" ";
    }
}
