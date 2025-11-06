package Main.maratonajava.javacore.Sformataçao.test;

import java.util.Arrays;
import java.util.Locale;

public class LocaleTest02 {
    static void main() {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        System.out.println(Arrays.toString(isoCountries) + " : " + Arrays.toString(isoLanguages));
    }
}
