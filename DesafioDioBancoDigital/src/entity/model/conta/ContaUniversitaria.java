package entity.model.conta;

import entity.model.user.Cliente;

public class ContaUniversitaria extends Conta{
    private static int SEQUENCIAL = 1;

    public ContaUniversitaria(Cliente cliente) {
        super(cliente);
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("   ==== Extrato Conta Universitária ====   ");
        super.imprimirExtrato();
    }
}
