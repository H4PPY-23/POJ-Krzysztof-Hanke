package lab9.Zadanie2i3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Klucze<K,V> {
    private K[] klucze;
    private V[] wartosci;

    public Klucze(int size) {
        klucze = (K[])new Object[size];
        wartosci = (V[]) new Object[size];
    }

    public int wielkosc(){
        for(int i = 0; i< klucze.length; i++){
            if(klucze[i]!=null){
                return i+1;
            }
        }
        return klucze.length;
    }

    public boolean dodaj(K klucz, V wartosc){
//      czy jest miejsce, nadpisanie, dodanie
        for(int i = 0; i< klucze.length; i++){
            if(klucze[i]==null || klucze[i]==klucz){
                klucze[i] = klucz;
                wartosci[i] = wartosc;
                return true;
            }
        }
        return false;
    }

    public boolean czyZawiera(K klucz){
        for(K x:klucze){
            if(x==klucz){
                return true;
            }
        }
        return false;
    }

    private int pierwszyWolnyIndeks(){
        if (klucze[0]==null){
            return 0;
        }
        int wolnyIndeks=1;
        for (int i=1;i<klucze.length; i++){
            if (klucze[i]==null){
                return i;
            }
            wolnyIndeks++;
        }
        return wolnyIndeks>klucze.length? -1:wolnyIndeks;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (int i=0;i<pierwszyWolnyIndeks();i++){
            buffer.append(String.format("%s->%s,", klucze[i], wartosci[i]));
        }
        if (buffer.length()>1){
            buffer.deleteCharAt(buffer.length()-1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Klucze<String, String> wczytajSlownik(File file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int linijka =1;
            while(reader.readLine() != null){
                linijka++;
            }
            Klucze<String, String> slownikPlik = new Klucze<>(linijka/2);

            linijka = 1;
            String klucz ="";
            String haslo = "";
            while(reader.readLine() != null){
                if(linijka%2==1){
                    klucz= reader.readLine();
                }else{
                    haslo = reader.readLine();
                    slownikPlik.dodaj(klucz, haslo);
                }
                linijka++;
            }
            reader.close();
            System.out.println(slownikPlik.wielkosc());
            System.out.println(slownikPlik.toString());

        } catch (IOException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
        return null;
    }
}
