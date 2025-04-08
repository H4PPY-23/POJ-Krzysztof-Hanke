package lab3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);
        Scanner scanner = new Scanner(System.in);
        int funkcja = 0;
        do {
            System.out.println("Wybierz: 1-Kanał w górę, 2-Kanał w dół, 3-Głośność w górę, 4-Głośność w dół, 5-Włącz/Wyłącz TV 0-Zakończ");
            funkcja = scanner.nextInt();
            switch (funkcja){
                case 1:
                    remote.kanal(true);
                    break;
                case 2:
                    remote.kanal(false);
                    break;
                case 3:
                    remote.glosnosc(true);
                    break;
                case 4:
                    remote.glosnosc(false);
                    break;
                case 5:
                    remote.wlaczWylacz();
                    break;
            }
        }while(funkcja != 0);
    }
}

class TV{
    int channel = 1, volume = 1;
    boolean on;
}

class Remote{
    Remote(TV tv){
        this.tv = tv;
    }
    TV tv;
    public void kanal(boolean kierunek){
        if (kierunek){
            if (tv.channel!=20 && tv.on){
                tv.channel++;
                System.out.println(tv.channel);
            }
        }else {
            if(tv.channel!=1 && tv.on) {
                tv.channel--;
                System.out.println(tv.channel);
            }
        }
    }
    public void glosnosc(boolean kierunek){
        if (kierunek){
            if(tv.volume!=10 &&tv.on) {
                tv.volume++;
                System.out.println(tv.volume);
            }
        }else {
            if(tv.volume!=1 && tv.on) {
                tv.volume--;
                System.out.println(tv.volume);
            }
        }
    }
    public void wlaczWylacz(){
        tv.on = !tv.on;
        System.out.println(tv.on);
    }
}