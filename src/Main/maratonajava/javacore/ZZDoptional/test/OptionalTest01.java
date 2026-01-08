package Main.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    static void main() {
        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é foda.");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);


        String name = findName("William");


    }

    private static String findName(String name) {
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf("name");
        if (i > 9) {
            return list.get(i);
        }
        return null;
    }
}
