package Main.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    static void main() {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("O dia esta bonito");
             fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
