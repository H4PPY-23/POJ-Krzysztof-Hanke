package lab3;
public class Zadanie4 {
    public static void main(String[] args) {
        Wiatrak wiatrak1 = new Wiatrak();
        Wiatrak wiatrak2 = new Wiatrak(10,true,20,"czerwony");
        System.out.println(wiatrak1.informacje());
        System.out.println(wiatrak2.informacje());
    }
}

class Wiatrak{
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private double speed;
    private boolean on;
    private double radius;
    private String color;
    Wiatrak(){
        this.speed = 1;
        this.on = false;
        this.radius = 10;
        this.color = "biały";
    }
    Wiatrak(double speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String informacje(){
        return "Informacje o wiatraku. Prędkości: "+SLOW+", "+MEDIUM+", "+FAST+", obecna prędkość: "+speed+", stan: "+on+", średnica: "+radius+", kolor: "+color;
    }
}