package lab3;

public class Zadanie2 {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(2, 1);
        System.out.println(punkt1.odleglosc(punkt2));
        System.out.println(punkt2.odleglosc(2, 2));
    }
}

class Punkt{
    public double x, y;
    Punkt(){
        this.x = 0;
        this.y = 0;
    }
    Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double odleglosc(double x, double y){
        return Math.sqrt(Math.pow(this.x- x, 2)+Math.pow(this.y-y,2));
    }
    public double odleglosc(Punkt punkt2){
        return Math.sqrt(Math.pow(this.x- punkt2.x, 2)+Math.pow(this.y-punkt2.y,2));
    }
}