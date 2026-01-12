package Main.maratonajava.javacore.ZZEStreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamtest09 {
    static void main() {
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        Stream.of("Eleve ", " O", " Cosmo", " no seu coraçao")
                .map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println("-------");

        int num[] = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(l-> l.contains("Java")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
