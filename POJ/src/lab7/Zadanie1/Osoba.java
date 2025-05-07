package lab7.Zadanie1;

public class Osoba {
    private String Imie;
    private String Nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        sprawdzDaneOsoby(imie, nazwisko, rokUrodzenia);
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        if (imie == null || imie.trim().isEmpty()) {
            throw new Exception("Podano niewłaściwe imię!");
        }
        if (nazwisko == null || nazwisko.trim().isEmpty()) {
            throw new Exception("Podano niewłaściwe nazwisko!");
        }
        if (rokUrodzenia < 1900 || rokUrodzenia > 2020) {
            throw new Exception("Podano niewłaściwy rok urodzenia!");
        }
    }

    @Override
    public String toString() {
        return "Dane osoby to: imię: " + Imie + ", nazwisko: " + Nazwisko + ", rok urodzenia: " + rokUrodzenia;
    }
}
