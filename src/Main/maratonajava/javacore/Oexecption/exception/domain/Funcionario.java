package Main.maratonajava.javacore.Oexecption.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("salvando funcionario");
    }
}
