package Main.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    static void main() {
        Path p1 = Paths.get("C:\\Users\\usuario\\Documents\\Intellij\\Main Project\\Java\\file.txt");
        Path p2 = Paths.get("C:\\Users\\usuario\\Documents\\Intellij\\Main Project", "file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());

    }
}
