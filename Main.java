package javaBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco XYZ!");
        System.out.println("Escolha o tipo de conta que deseja acessar:");
        System.out.println("1. Conta Bancária");
        System.out.println("2. Conta Corrente");
        System.out.println("3. Conta Poupança");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        banco banco = new banco();

        if (opcao == 1) {
            // Solicitar informações da Conta Bancária
            System.out.println("Digite o número da conta bancária:");
            int numeroConta = scanner.nextInt();
            System.out.println("Digite o saldo da conta bancária:");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.println("Digite o titular da conta bancária:");
            String titular = scanner.nextLine();

            // Criar a conta bancária
            contaBancaria conta = new contaBancaria(numeroConta, saldo, titular);
            banco.adicionarConta(conta);
        } else if (opcao == 2) {
            // Solicitar informações da Conta Corrente
            System.out.println("Digite o número da conta corrente:");
            int numeroConta = scanner.nextInt();
            System.out.println("Digite o saldo da conta corrente:");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.println("Digite o titular da conta corrente:");
            String titular = scanner.nextLine();
            System.out.println("Digite o limite da conta corrente:");
            double limite = scanner.nextDouble();

            // Criar a conta corrente
            contaCorrente conta = new contaCorrente(numeroConta, saldo, titular, limite);
            banco.adicionarConta(conta);
        } else if (opcao == 3) {
            // Solicitar informações da Conta Poupança
            System.out.println("Digite o número da conta poupança:");
            int numeroConta = scanner.nextInt();
            System.out.println("Digite o saldo da conta poupança:");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.println("Digite o titular da conta poupança:");
            String titular = scanner.nextLine();

            // Criar a conta poupança
            contaPoupanca conta = new contaPoupanca(numeroConta, saldo, titular);
            banco.adicionarConta(conta);
        } else {
            System.out.println("Opção inválida.");
        }

        // Mostrar informações das contas
        System.out.println("Informações das contas:");
        for (contaBancaria conta : banco.getContas()) {
            if (conta instanceof contaCorrente) {
                System.out.println("Conta Corrente:");
                contaCorrente cc = (contaCorrente) conta;
                System.out.println("Número da Conta: " + cc.numeroConta);
                System.out.println("Titular: " + cc.titular);
                System.out.println("Saldo: " + cc.saldo);
                System.out.println("Limite: " + cc.getLimite());
                System.out.println("Rendimento Diário: " + cc.calcularRendimentoDiario(0.01)); // Assumindo 1% de rendimento anual
            } else if (conta instanceof contaPoupanca) {
                System.out.println("Conta Poupança:");
                System.out.println("Número da Conta: " + conta.numeroConta);
                System.out.println("Titular: " + conta.titular);
                System.out.println("Saldo: " + conta.saldo);
                System.out.println("Rendimento Diário: " + conta.calcularRendimentoDiario(0.05)); // Assumindo 5% de rendimento anual
            } else {
                System.out.println("Conta Bancária:");
                System.out.println("Número da Conta: " + conta.numeroConta);
                System.out.println("Titular: " + conta.titular);
                System.out.println("Saldo: " + conta.saldo);
            }
            System.out.println();
        }

        scanner.close();
    }
}