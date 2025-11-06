package Main.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;

import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    static void main() {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter2Years = LocalDate.now().plusYears(2).plusDays(21);
        Period p1 = Period.between(now, nowAfter2Years);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}
