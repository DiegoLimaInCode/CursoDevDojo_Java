package Main.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    static void main() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingao e o primeiro dia da semana");
        }else {
            System.out.println("Segunda e o primeiro dia da semana");
        }

        System.out.println(c);
    }
}
