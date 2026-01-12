package Main.maratonajava.javacore.ZZEStreams.test;

import java.util.List;

public class StreamTest07 {
    static void main() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);


        System.out.println(integers.stream().reduce(0, Integer::sum));
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);

    }
}
