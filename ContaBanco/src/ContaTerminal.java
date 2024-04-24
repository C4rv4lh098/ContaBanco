import model.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static Conta solicitarDados(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Usuário: "+ numero+'\n');

        System.out.println("Por favor, digite sua Agência!");
        String agencia = scanner.nextLine();
        System.out.println("Usuário: "+ agencia+'\n');

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.nextLine().toUpperCase();
        System.out.println("Usuário: "+ nomeCliente+'\n');

        System.out.println("Por favor, digite o saldo!");
        float saldo = scanner.nextFloat();
        System.out.println("Usuário: "+ saldo+'\n');

        return new Conta(numero, agencia, nomeCliente, saldo);
    }

    public static void main(String[] args) throws Exception {
        Conta dados = solicitarDados();
        /*System.out.println("Olá " + dados.nomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + dados.agencia() + ", conta " + dados.numero() + " e seu saldo de " + dados.saldo() + " já está disponível para saque!");

         */

        System.out.printf("Olá "+ dados.nomeCliente()+ ", obrigado por criar sua conta em nosso banco!\n" +
                "Agência: "+ dados.agencia()+ " | Conta: "+ dados.numero()+ "\n" +
                "Saldo: "+ dados.saldo()+ " já está disponível para saque!");

    }
}
