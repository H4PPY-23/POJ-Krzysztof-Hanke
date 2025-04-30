package lab6;

public class Zadanie6 {
    static String usun(int n, String... elementy) {
        String tekst="";
        for(int i=0;i<elementy.length;i++) {
            if((i+1)%n != 0) {
                tekst+=elementy[i];
            }else{
                tekst+=" ";
            }
        }
        return tekst;
    }

    public static void main(String[] args) {
        System.out.println(usun(2, "Ala", "nie", "ma", "test", "kota i", "psa", "papugę"));
    }
}
