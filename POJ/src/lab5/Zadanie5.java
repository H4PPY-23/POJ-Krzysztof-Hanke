package lab5;

public class Zadanie5 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        e.present("haha");
    }
}

class A{
    protected void present(String phrase){
        System.out.println(phrase);
        System.out.println("W klasie a");
    }
}
class B extends A{
    @Override
    protected void present(String phrase) {
        super.present(phrase);
    }
}
class C extends B{
    @Override
    protected void present(String phrase) {
        super.present(phrase);
    }
}
class D extends C{
    @Override
    protected void present(String phrase) {
        super.present(phrase);
    }
}
class E extends D{
    @Override
    protected void present(String phrase) {
        super.present(phrase);
    }
}
