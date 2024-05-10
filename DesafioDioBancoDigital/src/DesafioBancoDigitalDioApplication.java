import entity.model.conta.Conta;
import entity.model.conta.ContaCorrente;
import entity.model.conta.ContaPoupanca;
import entity.model.conta.ContaUniversitaria;
import entity.model.user.Banco;
import entity.model.user.Pessoa;

public class DesafioBancoDigitalDioApplication {

    public static ContaCorrente criarContaCorrente(Pessoa cliente, Banco banco) {
        ContaCorrente contaCorrente = new ContaCorrente(cliente, new ContaPoupanca(cliente));
        banco.adicionarConta(contaCorrente);
        contaCorrente.adicionarPoupancaABanco(banco);
        return contaCorrente;
    }

    public static ContaPoupanca criarContaPoupanca(Pessoa cliente, Banco banco) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
        banco.adicionarConta(contaPoupanca);
        return contaPoupanca;
    }

    public static ContaUniversitaria criarContaUniverditaria(Pessoa cliente, Banco banco) {
        ContaUniversitaria contaUniversitaria = new ContaUniversitaria(cliente);
        banco.adicionarConta(contaUniversitaria);
        return contaUniversitaria;
    }

    public static void main(String[] args) {
        //Criando um banco
        Banco dioBank = new Banco();
        dioBank.setNome("DIO Bank");

        //Criando Pessoas
        Pessoa rodrigo = new Pessoa("123.456.789-11", "Rodrigo", "rodrigo.1998@gmail.com");
        Pessoa teste = new Pessoa();
        teste.setCpf("123.456.789-11");
        teste.setNome("Teste 2");
        teste.setEmail("teste.rodrigo@gmail.com");

        //Criando Conta Corrente
        ContaCorrente corrente = criarContaCorrente(rodrigo, dioBank);

        //Criando Conta Poupança
        ContaPoupanca poupanca = criarContaPoupanca(teste, dioBank);

        //Criando Conta Universitária
        ContaUniversitaria universitaria = criarContaUniverditaria(rodrigo, dioBank);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        universitaria.imprimirExtrato();

        //Oprações Comuns a todas as Contas
        System.out.println("Realizando Operações");

        corrente.depositar(200);
        poupanca.depositar(100);
        universitaria.depositar(50);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        universitaria.imprimirExtrato();


        /*
        Operações Conta Corrrente
        Métodos exclusivos da classe ContaConrrente
        */
        corrente.guardarPoupanca(50);
        corrente.retirarPoupanca(25.50);
        corrente.imprimirExtrato();

        System.out.println("Operações entre Contas");

        /*
        Operações Conta Poupança
        Sem Mudanças
        */
        corrente.transferir(50, poupanca);

        /*
        Operações Conta Universitária
        Sem Mudanças
        */
        corrente.transferir(35, universitaria);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        universitaria.imprimirExtrato();

        /*
        Operações Banco
        Exibi todas as Contas do Banco
        */
        dioBank.exibirContas();
    }

}
