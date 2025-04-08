package lab3;

public class Zadanie1 {
    public static void main(String[] args){
        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println(kwadrat.obwod());
        System.out.println(kwadrat.pole());
    }
}
class Kwadrat{
    Kwadrat(double bok){
        this.bok = bok;
    }
    private double bok = 0;
    public double obwod(){
        return bok*4;
    }
    public double pole(){
        return bok*bok;
    }
}