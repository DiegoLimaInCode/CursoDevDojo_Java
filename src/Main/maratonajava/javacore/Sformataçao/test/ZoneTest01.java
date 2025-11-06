package Main.maratonajava.javacore.Sformataçao.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    static void main() {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant instantNow = Instant.now();
        System.out.println(instantNow);
        ZonedDateTime zonedDateTime2 = instantNow.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offManaus = ZoneOffset.of("-07:00");
        OffsetDateTime offsetDateTime = now.atOffset(offManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offManaus);
        System.out.println(offsetDateTime2);

    }
}
