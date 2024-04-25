import java.util.Scanner;
import Exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            sistema();
            System.out.println("Tentar novamente?\nDigite:\n [1] para Sim\n [2] para Não\n");
            opcao = scanner.nextInt();
        }while(opcao != 2);
        System.out.println("OK!\nDesligando...");
    }

    static void sistema(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            System.out.println("==================================================\n");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        if (contagem<=0){
            throw new ParametrosInvalidosException();
        }
        else{
            for (int i=0;i<contagem;i++){
                System.out.println("Imprimindo o número "+ (i+1));
            }
            System.out.println("==================================================\n");
        }
    }
}
