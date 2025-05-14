package lab8.Zadanie5;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Zadanie5 {
    public static void main(String[] args) {
        int roczniki = 1;
        int rok = 2025;
        while (roczniki<100){
            if(LocalDate.of(rok, 1, 1).isLeapYear()){
                System.out.println(rok);
                roczniki++;
            }
            rok++;
        }
    }
}
