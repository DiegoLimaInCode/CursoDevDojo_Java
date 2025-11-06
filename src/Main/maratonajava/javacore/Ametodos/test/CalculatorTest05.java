package Main.maratonajava.javacore.Ametodos.test;

import Main.maratonajava.javacore.Ametodos.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        Calculator calculator =new Calculator();

        calculator.somaArrays(numeros);
        calculator.somaVarArgs(numeros);
    }
}
