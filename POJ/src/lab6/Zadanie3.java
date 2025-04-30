package lab6;

public class Zadanie3 {
    public static void main(String[] args) {
        MojaData mojaData = new MojaData(12,8,2024);
        System.out.print(mojaData.toString());
    }
}

class MojaData{
    int dzien, miesiac, rok;
    MojaData(int dzien, int miesiac, int rok){
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }
    @Override
//    public String toString(){
//        return dzien+"."+miesiac+"."+rok;
//    }
//    public String toString(){
//        String dzienTekst = String.valueOf(dzien);
//        String miesiacTekst = String.valueOf(dzien);
//        if(dzien<10){
//            dzienTekst = "0"+String.valueOf(dzien);
//        }
//        if(miesiac<10){
//            miesiacTekst = "0"+String.valueOf(miesiac);
//        }
//        return dzienTekst+"."+miesiacTekst+"."+rok;
//    }
    public String toString(){
        String miesiacTekst = "sty";
        switch (miesiac){
            case 1:
                miesiacTekst="sty";
                break;
            case 2:
                miesiacTekst="lut";
                break;
            case 3:
                miesiacTekst="mar";
                break;
            case 4:
                miesiacTekst="kwi";
                break;
            case 5:
                miesiacTekst="maj";
                break;
            case 6:
                miesiacTekst="cze";
                break;
            case 7:
                miesiacTekst="lip";
                break;
            case 8:
                miesiacTekst="sie";
                break;
            case 9:
                miesiacTekst="wrz";
                break;
            case 10:
                miesiacTekst="paź";
                break;
            case 11:
                miesiacTekst="lis";
                break;
            case 12:
                miesiacTekst="gru";
                break;
        }
        return dzien+"."+miesiacTekst+"."+rok;
    }
}
