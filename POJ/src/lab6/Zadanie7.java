package lab6;

public class Zadanie7 {
    static int sumowanie(int[]... tablice){
        int suma=0;
        for (int[] tablica : tablice) {
            for (int liczba : tablica) {
                suma += liczba;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] tab1 ={1,2,3,4};
        int[] tab2 = {5,6,7,8};
        int[] tab3 = {9,10,11,12};
        System.out.println(sumowanie(tab1,tab2,tab3));
    }
}
