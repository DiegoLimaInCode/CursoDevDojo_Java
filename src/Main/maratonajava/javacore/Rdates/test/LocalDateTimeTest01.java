package Main.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    static void main() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getMonthValue());
    }
}
