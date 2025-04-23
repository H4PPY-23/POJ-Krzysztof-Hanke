package lab5;

public class Zadanie3 {
    public static void main(String[] args) {
        StreetCar wyscigowka = new StreetCar("czerwony", "Honda", 200);
        Truck ciezarowka = new Truck("biały", "Volvo", 50);
        Limousine limuzyna = new Limousine("czarny", "Toyota", 10);
        Car[] tablica = {wyscigowka, ciezarowka, limuzyna};
        for (Car x : tablica){
            System.out.println(x.kolor+" | "+x.marka);
        }
    }
}
class Car{
    String kolor, marka;
    Car(String kolor, String marka){
        this.kolor = kolor;
        this.marka = marka;
    }
}
class StreetCar extends Car{
    int predkosc;
    StreetCar(String kolor, String marka, int predkosc){
        super(kolor, marka);
        this.predkosc = predkosc;
    }
}
class Truck extends Car{
    int waga;
    Truck(String kolor, String marka, int waga){
        super(kolor, marka);
        this.waga = waga;
    }
}
class Limousine extends Car{
    int dlugosc;
    Limousine(String kolor, String marka, int dlugosc){
        super(kolor, marka);
        this.dlugosc = dlugosc;
    }
}