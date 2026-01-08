package Main.maratonajava.javacore.Oexecption.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.printf("Dentro do RuntimeException");
        }
        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}