package Main.maratonajava.javacore.Sformataçao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatTest01 {
    static void main() {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
