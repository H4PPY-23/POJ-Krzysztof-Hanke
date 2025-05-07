package lab7.Zadanie4;

import lab7.Zadanie6.Znak;

public class Zadanie4 {
    public void analiza(String tekst){
        int litery = tekst.replaceAll("[^a-zA-z]", "").length();
        int samogloski = tekst.replaceAll("[^aAeEiIoOuUyY]", "").length();
        int spolgloski = tekst.replaceAll("[^qQwWrRtTpPsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM]", "").length();
        int bialeZnaki = tekst.replaceAll("[^ ]", "").length();
        int liczby = tekst.replaceAll("[^0-9]", "").length();
        int znakiInne = tekst.length()-litery-bialeZnaki-liczby;
        System.out.println("Podany tekst "+tekst+" zawiera: "+litery+" liter, w tym "+samogloski+" samogłosek i "+spolgloski+" spółgłosek");
        System.out.println(bialeZnaki+" białych znaków");
        System.out.println(liczby+" liczb");
        System.out.println(znakiInne+" innych znaków");
    }

    public static void main(String[] args) {
        Zadanie4 zadanie4 = new Zadanie4();
        zadanie4.analiza("21 liter!");
    }
}
