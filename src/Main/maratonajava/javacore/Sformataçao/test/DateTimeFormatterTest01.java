package Main.maratonajava.javacore.Sformataçao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    static void main() {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("-----------------");
        LocalDate p1 = LocalDate.parse("20250905", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate p2 = LocalDate.parse("2025-09-05", DateTimeFormatter.ISO_DATE);
        LocalDate p3 = LocalDate.parse("2025-09-05", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
