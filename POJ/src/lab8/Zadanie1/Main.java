package lab8.Zadanie1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        new File("./exercise").mkdirs();
        try {
            File plik0 = new File("./exercise/plik0.txt");
            plik0.createNewFile();
            new File("./exercise/plik1.txt").createNewFile();
            new File("./exercise/plik2.txt").createNewFile();
            File folder0 = new File("./exercise/folder0");
            folder0.mkdirs();
            new File("./exercise/folder1").mkdirs();
            InformationProvider informationProvider = new InformationProvider();
            informationProvider.displayInformation(plik0);
            informationProvider.displayInformation(folder0);
        } catch (IOException e){
            System.out.println("błąd");
        }

    }
}
