package lab6;

public class Zadanie1 {
    public static void main(String[] args) {
        Firma firma = new Firma();
        for(int i=0;i<10;i++){
            firma.pracownicy[i]=new Pracownik(300+i*50);
        }
        System.out.println(firma.ObliczKosztFirmy(Czas.MIESIAC, 6));
        System.out.println(firma.ObliczKosztFirmy(Czas.DZIEN, 2));
    }
}

class Pracownik{
    String imie, nazwisko;
    double dzienneWynagrodzenie;
    Pracownik(double dzienneWynagrodzenie){
        this.dzienneWynagrodzenie = dzienneWynagrodzenie;
    }
}

class Firma{
    Pracownik[] pracownicy = new Pracownik[10];
    double obliczMiesiecznyKosztFirmy(){
        double mieszecznyKoszt=0;
        for (Pracownik pracownik : pracownicy){
            mieszecznyKoszt+=pracownik.dzienneWynagrodzenie;
        }
        mieszecznyKoszt*=20;
        return mieszecznyKoszt;
    }
    double obliczRocznyKosztFirmy(){
        return obliczMiesiecznyKosztFirmy()*12;
    }
    double ObliczKosztFirmy(Czas czas, int krotnosc){
        double koszt=0;
        switch (czas){
            case DZIEN:
                for (Pracownik pracownik : pracownicy){
                    koszt+=pracownik.dzienneWynagrodzenie;
                }
                koszt*=krotnosc;
                break;
            case MIESIAC:
                koszt=obliczMiesiecznyKosztFirmy()*krotnosc;
                break;
            case ROK:
                koszt=obliczRocznyKosztFirmy()*krotnosc;
                break;
        }
        return koszt;
    }
}