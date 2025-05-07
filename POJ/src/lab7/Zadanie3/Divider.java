package lab7.Zadanie3;
import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        try {
            String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
            String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

            int numerator = convertToInteger(number);
            int divisor = convertToInteger(divider);

            if (divisor == 0) {
                throw new ArithmeticException("Błąd, dzielenie przez 0");
            }

            int result = numerator / divisor;
            JOptionPane.showMessageDialog(null, ("Wynik dzielenia to "+result));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd formatu");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
