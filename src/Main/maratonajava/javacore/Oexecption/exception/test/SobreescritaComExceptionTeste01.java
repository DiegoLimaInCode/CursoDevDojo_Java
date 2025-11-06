package Main.maratonajava.javacore.Oexecption.exception.test;

import Main.maratonajava.javacore.Oexecption.exception.domain.Funcionario;
import Main.maratonajava.javacore.Oexecption.exception.domain.LoginInvalidoException;
import Main.maratonajava.javacore.Oexecption.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaComExceptionTeste01 {
    static void main() {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
