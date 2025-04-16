package lab4;

public class Zadanie1 {
    public static void main(String[] args) {
        Ulamek ulamek1 = new Ulamek(2,1);
        Ulamek ulamek2 = new Ulamek(2,3);
        ulamek1.dodawanie(ulamek2);
        ulamek1.wyswietlanie();
        ulamek1.odejmowanie(ulamek2);
        ulamek1.wyswietlanie();
        ulamek2.mnozenie(ulamek2);
        ulamek2.wyswietlanie();
        ulamek2.dzielenie(ulamek1);
        ulamek2.wyswietlanie();
    }
}

class Ulamek{
    public int licznik;
    public int mianownik;
    Ulamek(int licznik, int mianownik){
        this.licznik = licznik;
        if(mianownik == 0){
            mianownik = 1;
        }
        this.mianownik = mianownik;
    }
    public void dodawanie(Ulamek ulamek){
        if(this.mianownik != ulamek.mianownik){
            int mnoznik = this.mianownik;
            this.licznik*= ulamek.mianownik;
            this.mianownik*= ulamek.mianownik;
            ulamek.licznik*=mnoznik;
            ulamek.mianownik*=mnoznik;
        }
        this.licznik += ulamek.licznik;
    }
    public void odejmowanie(Ulamek ulamek){
        if(this.mianownik != ulamek.mianownik){
            int mnoznik = this.mianownik;
            this.licznik*= ulamek.mianownik;
            this.mianownik*= ulamek.mianownik;
            ulamek.licznik*=mnoznik;
            ulamek.mianownik*=mnoznik;
        }
        this.licznik -= ulamek.licznik;
    }
    public void mnozenie(Ulamek ulamek){
        this.licznik*=ulamek.licznik;
        this.mianownik*= ulamek.mianownik;
    }
    public void dzielenie(Ulamek ulamek){
        this.licznik*=ulamek.mianownik;
        this.mianownik*= ulamek.licznik;
    }
    public void wyswietlanie(){
        System.out.println("Ułamek to: "+licznik+"/"+mianownik);
    }
}
