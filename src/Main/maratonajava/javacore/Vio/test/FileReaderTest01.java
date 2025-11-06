package Main.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    static void main() {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
            char[] in = new char[30];
            int size = fr.read(in);
            System.out.println(size);
            for (char c : in) {
                System.out.print(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
