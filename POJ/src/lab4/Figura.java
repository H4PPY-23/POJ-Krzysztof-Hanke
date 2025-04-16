package lab4;

public enum Figura {
    DWA("2"),TRZY("3"),CZTERY("4"),PIEC("5"),SZESC("6"),SIEDEM("7"),OSIEM("8"),DZIWEIEC("9"),DZIESIEC("10"),WALET("Walet"),DAMA("Dama"),KROL("Król"),AS("As");
    public String nazwa;
    Figura(String nazwa) {
        this.nazwa = nazwa;
    }
}
