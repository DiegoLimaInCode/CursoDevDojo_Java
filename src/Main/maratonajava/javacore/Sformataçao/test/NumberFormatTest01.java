package Main.maratonajava.javacore.Sformataçao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    static void main() {
        Locale locareBR = new Locale("PT","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa =new NumberFormat[4];
        nfa[0]=NumberFormat.getCurrencyInstance();
        nfa[1]=NumberFormat.getCurrencyInstance(localeJP);
        nfa[2]=NumberFormat.getCurrencyInstance(locareBR);
        nfa[3]=NumberFormat.getCurrencyInstance(localeIT);
        double valor = 100_000_000.2130;
        for (NumberFormat numberFormat: nfa){
//            System.out.println(numberFormat.format(valor));
        }
        String valorString ="1000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
