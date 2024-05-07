package javaBanco;

public class contaPoupanca extends contaBancaria {
    public contaPoupanca(int numeroConta, double saldo, String titular){
        super(numeroConta, saldo, titular);
    }


    public double calculadoraRendimento(){
        //rendimento da conta poupanca
        return saldo * 0.05;  //nesse caso são 5% ao ano
    }
}    