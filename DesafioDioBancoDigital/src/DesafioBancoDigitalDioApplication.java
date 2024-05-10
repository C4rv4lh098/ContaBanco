import entity.model.conta.Conta;
import entity.model.conta.ContaCorrente;
import entity.model.conta.ContaPoupanca;
import entity.model.conta.ContaUniversitaria;
import entity.model.user.Banco;
import entity.model.user.Cliente;

import java.util.List;

public class DesafioBancoDigitalDioApplication {

    public static void main(String[] args) {
        Banco dioBank = new Banco();
        dioBank.setNome("DIO Bank");

        Cliente rodrigo = new Cliente("123.456.789-11", "Rodrigo", "rodrigo.1998@gmail.com");
        Cliente teste = new Cliente("123.456.789-11", "Teste 2", "teste.rodrigo@gmail.com");

        ContaCorrente corrente = new ContaCorrente(rodrigo, new ContaPoupanca(rodrigo));
        corrente.depositar(200);
        dioBank.adicionarConta(corrente);

        //Métodos exclusivos da classe ContaConrrente
        corrente.guardarPoupanca(50);
        corrente.retirarPoupanca(25.50);

        Conta poupanca = new ContaPoupanca(teste);
        poupanca.depositar(100);

        Conta universitaria = new ContaUniversitaria(rodrigo);
        universitaria.depositar(50);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        universitaria.imprimirExtrato();

        dioBank.exibirContas();
    }

}
