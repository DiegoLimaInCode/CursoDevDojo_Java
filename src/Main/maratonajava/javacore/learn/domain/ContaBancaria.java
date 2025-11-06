package Main.maratonajava.javacore.learn.domain;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public void init(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            return;
        }
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void imprime() {
        System.out.println("O numero da conta é : " + this.numeroConta);
        System.out.println("O saldo da conta é : " + this.saldo);
    }
}
