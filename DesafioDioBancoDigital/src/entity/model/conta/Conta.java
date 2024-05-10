package entity.model.conta;

import entity.interfaces.IConta;
import entity.model.user.Banco;
import entity.model.user.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;

    protected Pessoa pessoa;

    protected int agencia;

    protected int numero;

    protected double saldo;

    public Conta(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.agencia = AGENCIA_PADRAO;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Cliente: " + this.pessoa.getNome());
        System.out.println("Agência: " + this.agencia + " | Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =\n");
    }
}
