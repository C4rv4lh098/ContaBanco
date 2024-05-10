package entity.model.conta;

import entity.model.user.Banco;
import entity.model.user.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContaCorrente extends Conta{
    private static int SEQUENCIAL = 1;

    public ContaPoupanca poupanca;

    public ContaCorrente(Pessoa pessoa, ContaPoupanca poupanca) {
        super(pessoa);
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

    public void adicionarPoupancaABanco(Banco banco){
        banco.adicionarConta(this.poupanca);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("     ==== Extrato Conta Corrente ====    ");
        super.imprimirExtrato();
        this.poupanca.imprimirExtrato();
    }
}
