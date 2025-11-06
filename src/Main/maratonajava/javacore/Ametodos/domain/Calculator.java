package Main.maratonajava.javacore.Ametodos.domain;

public class Calculator {
    public void somaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subtraiDoisNumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiplicaDoisNuemros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divisaoResto(int num1, int num2) {
        System.out.println(num1 % num2);
        if (num1 % 2 == 0) {
            System.out.println("esse numero e par");
        } else System.out.println("esse numero e impar");
    }

    public void alteraDoisNumero(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro Do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArrays(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
