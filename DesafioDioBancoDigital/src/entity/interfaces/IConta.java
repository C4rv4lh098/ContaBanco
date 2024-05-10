package entity.interfaces;

public interface IConta {
    void depositar(double valor);

    void sacar(double valor);

    void transferir(double value, IConta contaDestino);

    void imprimirExtrato();
}
