package Main.maratonajava.javacore.Pwrapper.Tests;

import java.sql.SQLOutput;

public class WrapperTest01 {
    static void main() {
        byte byteP = 1;
        short shortp = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;


        Byte byteW = 1;            //autoboxing
        Short shortW = 1;          //autoboxing
        Integer intW = 1;          //autoboxing
        Long longW = 10L;          //autoboxing
        Float floatW = 10F;        //autoboxing
        Double doubleW = 10D;      //autoboxing
        Character charW = 'W';     //autoboxing
        Boolean booleanW = false;  //autoboxing

        int i = intW;//unboxing
        Integer intW2 = Integer.parseInt("2");
        Boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetterOrDigit('a'));
    }
}
