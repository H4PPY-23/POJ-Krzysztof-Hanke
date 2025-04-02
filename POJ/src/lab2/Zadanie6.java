package lab2;

public class Zadanie6 {
    public static void main(String[] args) {
//        NWD
        int liczba1 = 7;
        int liczba2 = 35;
        int x = liczba1;
        int y = liczba2;
        while(x != y){
            if(x<y){
                y-=x;
            }else{
                x-=y;
            }
        }
        System.out.print("NWD "+liczba1+" i "+liczba2+" = "+x);
    }
}
