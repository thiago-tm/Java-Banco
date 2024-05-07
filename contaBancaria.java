package javaBanco;

public class contaBancaria {
    protected int numeroConta;
    protected double saldo;
    protected String titular;

    public contaBancaria(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double calcularRendimentoDiario(double taxaAnual) {
        double taxaDiaria = taxaAnual / 365.0; // Assumindo que o ano tem 365 dias
        return saldo * taxaDiaria;
    }
}
