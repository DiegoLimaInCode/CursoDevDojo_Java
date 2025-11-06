package Main.maratonajava.javacore.Ametodos.test;

import Main.maratonajava.javacore.Ametodos.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.alteraDoisNumero(num1, num2);
        System.out.println("dentro do CalculatorTest02");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);


    }
}
