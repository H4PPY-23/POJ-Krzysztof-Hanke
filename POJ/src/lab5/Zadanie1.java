package lab5;

public class Zadanie1 {
    public static void main(String[] args) {
        Dog dog = new Dog("hau hau", "Marcin", "ładny");
        Cat cat = new Cat("miau miau", "Szymon", "ładniejszy");
        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }

}

class Animal{
    protected String dzwiek, imie, kolor;
    Animal(String dzwiek, String imie, String kolor){
        this.dzwiek = dzwiek;
        this.imie = imie;
        this.kolor = kolor;
    }
    public String makeSound(){
        return " koloru "+kolor+" ma na imię "+imie+" i mówi "+dzwiek;
    }
}
class Dog extends Animal{
    protected String zwierze = "Pies", dzwiek, imie, kolor;
    Dog(String dzwiek, String imie, String kolor){
        super(dzwiek, imie, kolor);
    }
    @Override
    public String makeSound(){
        return zwierze+super.makeSound();
    }

}
class Cat extends Animal{
    protected String zwierze = "Kot", dzwiek, imie, kolor;
    Cat(String dzwiek, String imie, String kolor){
        super(dzwiek, imie, kolor);
    }
    @Override
    public String makeSound(){
        return zwierze+super.makeSound();
    }
}
