package entity.model.conta;

import entity.model.user.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContaCorrente extends Conta{
    private static int SEQUENCIAL = 1;

    public ContaPoupanca poupanca;

    public ContaCorrente(Cliente cliente, ContaPoupanca poupanca) {
        super(cliente);
        this.poupanca = poupanca;
        super.numero = SEQUENCIAL++;
    }

    public void guardarPoupanca(double valor){
        sacar(valor);
        this.poupanca.depositar(valor);
    }

    public void retirarPoupanca(double valor){
        this.poupanca.sacar(valor);
        depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("     ==== Extrato Conta Corrente ====    ");
        super.imprimirExtrato();
        this.poupanca.imprimirExtrato();
    }
}
