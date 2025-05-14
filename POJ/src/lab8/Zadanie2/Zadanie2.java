package lab8.Zadanie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zadanie2 {
    public static void main(String[] args) {
        int suma = 0;
        int linijkaNumer = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("./POJ/src/lab8/Zadanie2/Input"))) {
            String LiniaTekst;
            while ((LiniaTekst = reader.readLine()) != null) {
                if (linijkaNumer % 2 == 0) {
                    try {
                        suma += Integer.parseInt(LiniaTekst.trim());
                    } catch (NumberFormatException e) {
                        System.out.println("bład");
                    }
                }
                linijkaNumer++;
            }

            System.out.println("Suma: " + suma);

        } catch (IOException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
