package lab8.Zadanie1;
import java.io.File;
import java.io.IOException;

public class InformationProvider {
    void displayInformation(File file){
        System.out.println("nazwa: "+file.getName());
        System.out.println("ścieżka: "+file.getAbsolutePath());
        System.out.println("Czy jest plikiem: "+file.isFile());
        System.out.println("Czy jest katalogiem: "+file.isDirectory());
        System.out.println("Czy istnieje: "+file.exists());
    }
}
