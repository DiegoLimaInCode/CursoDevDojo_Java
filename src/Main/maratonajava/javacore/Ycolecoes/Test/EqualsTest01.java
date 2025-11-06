package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Smartphone;

public class EqualsTest01 {
    static void main() {
        Smartphone s1  = new Smartphone("1ABC1","Iphone");
        Smartphone s2  = new Smartphone("1ABC1","Iphone");
        System.out.println(s1.equals(s2));
    }
}
