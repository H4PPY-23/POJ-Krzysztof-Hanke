package lab6;

public class Zadanie4 {
    public static void main(String[] args) {
        Czas1 czas = new Czas1(12, 50);
        Czas1 czas1 = new Czas1(12, 10);
        czas = czas.dodaj(czas1);
        System.out.println(czas.toString());
        czas1 = czas1.odejmij(new Czas1(13,200));
        System.out.println(czas1.toString());
        czas1 = czas1.pomnoz(2);
        System.out.println(czas1.toString());
    }
}
class Czas1{
    int godziny,minuty;
    Czas1(int godziny, int minuty){
        this.godziny = godziny;
        this.minuty = minuty;
    }
    @Override
    public String toString(){
        return godziny+"h "+minuty+"min";
    }
    Czas1 dodaj(Czas1 t){
        Czas1 czas = new Czas1(godziny, minuty);
        czas.godziny+=t.godziny;
        czas.minuty+=t.minuty;
        czas.godziny+=czas.minuty/60;
        czas.minuty%=60;
        czas.godziny%=24;
        return czas;
    }
    Czas1 odejmij(Czas1 t){
        Czas1 czas = new Czas1(godziny, minuty);
        czas.godziny-=t.godziny;
        czas.minuty-=t.minuty;
        while(czas.minuty<0){
            czas.godziny-=1;
            czas.minuty=60+ czas.minuty;
        }
        while(czas.godziny<0){
            czas.godziny=24+ czas.godziny;
        }

        czas.godziny+=czas.minuty/60;
        czas.minuty%=60;
        czas.godziny%=24;
        return czas;
    }
    Czas1 pomnoz(int krotnosc){
        Czas1 czas = new Czas1(godziny, minuty);
        czas.godziny*=krotnosc;
        czas.minuty*=krotnosc;
        czas.godziny+=czas.minuty/60;
        czas.minuty%=60;
        czas.godziny%=24;
        return czas;
    }
}