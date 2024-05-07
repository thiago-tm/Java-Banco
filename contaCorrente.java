package javaBanco;

public class contaCorrente extends contaBancaria {
    protected double limite;//estava private e não deu certo 

    public contaCorrente(int numeroConta, double saldo, String titular, double limite) {
        super(numeroConta, saldo, titular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double calculadoraRendimento() {
        // Simulação rendimento cdb com liquidez diaria
        return saldo * 0.01; // Rendimento de 1% ao ano
    }
}


