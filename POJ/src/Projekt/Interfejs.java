package Projekt;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Interfejs {
    public static String oknoWyboru(String[] zbior){
        return (String)JOptionPane.showInputDialog(null,
                "Wybierz opcję",
                "System zarządzania ksiązkami",
                JOptionPane.QUESTION_MESSAGE,
                null,
                zbior,
                zbior[0]
        );
    }

    public static String oknoWyboruZbioru(String[] zbior){
        return zbior[JOptionPane.showOptionDialog(null,
                "Wybierz zbiór",
                "System zarządzania ksiązkami",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                zbior,
                zbior[0]
        )];
    }

    public static Ksiazka wczytajDaneKsiazki(){
        int rok_wydania = 0;
        String tytul = JOptionPane.showInputDialog("Podaj tytuł", null);
        String autor = JOptionPane.showInputDialog("Podaj autora", null);
        try {
            rok_wydania = parseInt( JOptionPane.showInputDialog("Podaj rok wydania", null));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Błędny rok wydania");
        }
        String jezyki = JOptionPane.showInputDialog("Podaj języki");
        String gatunki = JOptionPane.showInputDialog("Podaj gatunki np. czarny humor, historyczne");

        return new Ksiazka(tytul,autor,rok_wydania,jezyki,gatunki);
    }

    public static Ksiazka oknoWyboruKsiazki(Biblioteka obiektOperacji){
        //która książka ze zbioru odpowiada książce z okna wyboru
        String ksiazkaStr = oknoWyboru(obiektOperacji.listaKsiazekStr());
        for(int id = 0; id<obiektOperacji.listaKsiazekStr().length; id++){
            if(obiektOperacji.listaKsiazekStr()[id].equals(ksiazkaStr)){
                return obiektOperacji.ksiazkaPoID(id);
            }
        }
        //jeśli żadna to zwracamy pustą
        return new Ksiazka(null,null,0,null,null);
    }

    public static boolean main(Biblioteka biblioteka, Ulubione ulubione){
        final String[] operacje = {"wyświetl","dodaj","usuń", "wyszukaj"};
        final String[] zbiory = {"ulubione","biblioteka"};

        String wybranyZbior = oknoWyboruZbioru(zbiory);
        String wybranaOperacja = oknoWyboru(operacje);
        Biblioteka zbior;

        //zbiór do wykonywania metod
        try{
            switch (wybranyZbior){
                case "ulubione":
                    zbior = ulubione;
                    break;
                case "biblioteka":
                    zbior = biblioteka;
                    break;
                default:
                    return false;
            }
        } catch (Exception e) {
            return false;
        }

        //dodawanie ulubionych
        if(zbior==ulubione && wybranaOperacja.equals("dodaj")){
            try{
                JOptionPane.showMessageDialog(null,zbior.dodajKsiazke(oknoWyboruKsiazki(biblioteka)));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        //usuwanie z dwóch zbiorów
        }else if(zbior==biblioteka && wybranaOperacja.equals("usuń")){
            if(zbior.informacje().equals("")){
                JOptionPane.showMessageDialog(null, "Brak książek do usunięcia");
            }else {
                Ksiazka ksiazka = oknoWyboruKsiazki(biblioteka);
                JOptionPane.showMessageDialog(null, biblioteka.usunKsiazke(ksiazka));
                JOptionPane.showMessageDialog(null, ulubione.usunKsiazke(ksiazka));
            }
        //pozostałe metody
        }else{
            try{
                switch (wybranaOperacja){
                    case "wyświetl":
                        JOptionPane.showMessageDialog(null, zbior.informacje());
                        break;
                    case "dodaj":
                        JOptionPane.showMessageDialog(null,zbior.dodajKsiazke(wczytajDaneKsiazki()));
                        break;
                    case "usuń":
                        if(zbior.informacje().equals("")){
                            JOptionPane.showMessageDialog(null, "Brak książek do usunięcia");
                        }else {
                            JOptionPane.showMessageDialog(null, zbior.usunKsiazke(oknoWyboruKsiazki(zbior)));
                        }
                        break;
                    case "wyszukaj":
                        String haslo = JOptionPane.showInputDialog("Podaj hasło", null);
                        Biblioteka wyniki = zbior.wyszukajKsiazke(haslo);
                        if(wyniki.informacje().equals("")){
                            JOptionPane.showMessageDialog(null,"brak wyników");
                        }else{
                            JOptionPane.showMessageDialog(null, wyniki.informacje());
                        }
                        break;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
