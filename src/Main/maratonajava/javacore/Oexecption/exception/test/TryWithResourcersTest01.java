package Main.maratonajava.javacore.Oexecption.exception.test;

import Main.maratonajava.javacore.Oexecption.exception.domain.Leitor01;
import Main.maratonajava.javacore.Oexecption.exception.domain.Leitor02;

import java.io.*;

public class TryWithResourcersTest01 {
    static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02();) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
