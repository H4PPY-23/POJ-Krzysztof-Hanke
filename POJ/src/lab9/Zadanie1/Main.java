package lab9.Zadanie1;

public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>(5);
        lista.dodaj(5);
        System.out.println(lista.czyZawiera(5));
        Lista<String> lista1 = new Lista<>(5);
        lista1.dodaj("ala ma kota");
        lista1.dodaj("ala ma kota");
        System.out.println(lista1.zwrocOstatniIndeks("ala ma kota"));
    }
}
