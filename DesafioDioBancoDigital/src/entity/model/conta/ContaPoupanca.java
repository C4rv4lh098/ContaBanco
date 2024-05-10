package entity.model.conta;

import entity.model.user.Cliente;

public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 1;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("     ==== Extrato Conta Poupanca ====    ");
        super.imprimirExtrato();
    }
}
