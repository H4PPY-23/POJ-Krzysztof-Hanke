package lab7.Zadanie6;

public class Main {
    public static void main(String[] args) {
        TransformacjaString transformacjaString = new TransformacjaString();
        System.out.println(transformacjaString.podmienZnaki("Ameryka? w Lublinie!", Znak.SAMOGLOSKA, '%'));
        System.out.println(transformacjaString.pozostawZnaki("W sierpniu, jadę; na narty!", Znak.SPACJA));
    }
}
