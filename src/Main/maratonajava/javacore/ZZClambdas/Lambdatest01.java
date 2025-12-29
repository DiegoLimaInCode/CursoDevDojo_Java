package Main.maratonajava.javacore.ZZClambdas;

import java.util.List;
import java.util.function.Consumer;

public class Lambdatest01 {
    static void main() {
        List<String> Strings = List.of("William", "Suane", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        forEach(Strings,s -> System.out.println(s));
        forEach(integers,i -> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
