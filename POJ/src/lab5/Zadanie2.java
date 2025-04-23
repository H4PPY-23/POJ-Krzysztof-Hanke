package lab5;

import java.util.Arrays;

public class Zadanie2 {
    public static void main(String[] args) {
        Bookshop ksiegarnia = new Bookshop("Łódź, Piotrkowska 12", "duży");
        Bakery piekarnia = new Bakery("Gdańsk, Hynka 7", "mały");
        System.out.println(ksiegarnia.getInformation());
        System.out.println(piekarnia.getInformation());
    }
}
class Shop{
    String address, size;
    Shop(String address, String size){
        this.address = address;
        this.size = size;
    }
    String getInformation(){
        return address+" | "+size;
    }

}
class Bookshop extends Shop{
    Bookshop(String address, String size){
        super(address, size);
    }
    String[] products = {"słownik", "komiks"};

    @Override
    String getInformation() {
        return super.getInformation()+" | "+Arrays.toString(products);
    }
}

class Bakery extends Shop{
    Bakery(String address, String size){
        super(address, size);
    }
    String[] products = {"bułka", "chleb"};

    @Override
    String getInformation() {
        return super.getInformation()+" | "+Arrays.toString(products);
    }
}