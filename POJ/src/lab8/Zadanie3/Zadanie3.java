package lab8.Zadanie3;

import java.io.File;

public class Zadanie3 {
    public static void main(String[] args) {
        File KatalogNadrzedny = new File("POJ/src/lab8/Zadanie3/basedir");
        File[] Katalogi = KatalogNadrzedny.listFiles();
        int maxPliki = 0;
        String maxKatalog = "";
        for (File Katalog : Katalogi){
            if (Katalog.isDirectory()){
                if(Katalog.listFiles().length > maxPliki){
                    maxPliki = Katalog.listFiles().length;
                    maxKatalog = Katalog.getName();
                }
            }
        }
        System.out.println(maxKatalog+": "+maxPliki);
    }
}
