package lab6;

public class Zadanie5 {
    public static void main(String[] args) {
        Samochod samochod = new Samochod(2005, "Czarny", "Ford");
        SzybkiSamochod szybkiSamochod = new SzybkiSamochod(2007, "czerwony", "Nissan");
        System.out.println(samochod.equals(szybkiSamochod));
    }
}
class Samochod{
    int predkosc = 0, rocznik;
    String kolor, marka;
    Samochod(){

    }
    Samochod(int rocznik, String kolor, String marka){
        this.rocznik = rocznik;
        this.kolor = kolor;
        this.marka = marka;
    }
    void przyspiesz(){
        if(predkosc<=120){
            predkosc+=20;
        }
    }
    @Override
    public String toString(){
        return "markaa: "+marka+", rocznik: "+rocznik+", kolor: "+kolor;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return false;
        if (!(obj instanceof Samochod)) return false;
        Samochod samochod = (Samochod) obj;
        if(kolor==samochod.kolor && rocznik==samochod.rocznik && marka==samochod.marka){
            return true;
        }else{
            return false;
        }
    }
}

class SzybkiSamochod extends Samochod{
    SzybkiSamochod(int rocznik, String kolor, String marka){
        super(rocznik, kolor, marka);
    }
    void przyspiesz(){
        if(predkosc<=180){
            predkosc+=20;
        }
    }
}