package Main.maratonajava.javacore.Oexecption.exception.domain;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login Invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
