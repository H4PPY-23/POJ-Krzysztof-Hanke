package lab6;

public class Zadanie2 {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie(2);
        zamowienie.dodajPozycje(new Pozycja("makaron", 2, 4.50));
        zamowienie.dodajPozycje(new Pozycja("jajka", 10, 1.50));
        System.out.println(zamowienie.toString());
    }
}

class Zamowienie{
    Pozycja[] pozycje;
    int maxRozmiar;
    Zamowienie(int maxRozmiar){
        this.maxRozmiar = maxRozmiar;
        this.pozycje = new Pozycja[maxRozmiar];
    }
    Zamowienie(){
        this.maxRozmiar =10;
        this.pozycje = new Pozycja[maxRozmiar];
    }

    void dodajPozycje(Pozycja nowaPozycja){
        for(int i=0;i<maxRozmiar;i++){
            if(pozycje[i] == null){
                pozycje[i] = nowaPozycja;
                break;
            }
        }
    }

    double obliczWartosc(){
        double suma=0;
        for(Pozycja pozycja: pozycje){
            suma+=pozycja.iloscSztuk*pozycja.cenaSztuki;
        }
        return suma;
    }
    @Override
    public String toString(){
        String wynik ="";
        wynik+="Zamówienie: \n";
        for(Pozycja pozycja: pozycje){
            wynik+=(pozycja.toString());
        }
        wynik+=("Razem: "+obliczWartosc()+" zł");
        return wynik;
    }
}

class Pozycja{
    Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki){
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }
    String nazwaTowaru;
    int iloscSztuk;
    double cenaSztuki;

    double obliczWartosc(){
        return iloscSztuk*cenaSztuki;
    }
    @Override
    public String toString(){
        return (nazwaTowaru+" "+cenaSztuki+" zł "+iloscSztuk+" szt. "+obliczWartosc()+ " zł\n");
    }
}