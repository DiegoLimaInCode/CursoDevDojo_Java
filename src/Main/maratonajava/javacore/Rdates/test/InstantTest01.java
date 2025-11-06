package Main.maratonajava.javacore.Rdates.test;

import java.time.Instant;

public class InstantTest01 {
    static void main() {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3,-1_000_000_000));
    }
}
