package Projekt;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Biblioteka {
    private LinkedList<Ksiazka> ksiazki = new LinkedList<Ksiazka>();

    public String dodajKsiazke(Ksiazka ksiazka){
        if(ksiazka.tytul!=null && !ksiazki.contains(ksiazka)){
            ksiazki.addLast(ksiazka);
            return "Dodano książkę";
        }else{
            return "Nie można dodać książki";
        }
    }
    public String usunKsiazke(Ksiazka ksiazka){
        if (ksiazki.remove(ksiazka)) {
            return "Usunięto książkę";
        } else {
            return "Nie znaleziono książki do usunięcia";
        }
    }

    public Biblioteka wyszukajKsiazke(String tekst){
        Pattern pattern = Pattern.compile(tekst, Pattern.CASE_INSENSITIVE);
        boolean znaleziono;
        Biblioteka wyniki = new Biblioteka();
        for(Ksiazka ksiazka : ksiazki){;
            Matcher matcher = pattern.matcher(ksiazka.informacje());
            znaleziono = matcher.find();
            if(znaleziono){
                wyniki.dodajKsiazke(ksiazka);
            }
        }
        return wyniki;
    }

    public String informacje(){
        StringBuilder daneStr = new StringBuilder();
        for(Ksiazka ksiazka : ksiazki){
            daneStr.append("id: "+ksiazki.indexOf(ksiazka)+"\n");
            daneStr.append(ksiazka.informacje());
            daneStr.append("\n");
        }
        return daneStr.toString();
    }

    public String[] listaKsiazekStr(){
        LinkedList<String> listaKsiazekStr = new LinkedList<>();
        for(Ksiazka ksiazka : ksiazki){
            listaKsiazekStr.addLast(ksiazka.autor+": "+ksiazka.tytul);
        }
        return listaKsiazekStr.toArray(new String[0]);
    }

    public Ksiazka ksiazkaPoID(int id){
        return ksiazki.get(id);
    }
}
