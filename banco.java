package javaBanco;

import java.util.ArrayList;

public class banco {
    private ArrayList<contaBancaria> contas;

    public banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(contaBancaria conta) {
        contas.add(conta);
    }

    public void excluirConta(contaBancaria conta) {
        contas.remove(conta);
    }

    public ArrayList<contaBancaria> getContas() {
        return contas;
    }
}