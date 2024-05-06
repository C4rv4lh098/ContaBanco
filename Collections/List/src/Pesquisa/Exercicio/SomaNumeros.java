package Pesquisa.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listInteiros;

    public SomaNumeros() {
        this.listInteiros = new ArrayList<>();
    }

    public List<Integer> getListInteiros() {
        return listInteiros;
    }

    public void adicionarNumero(int numero){
        listInteiros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer i : listInteiros){
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorInteiro = Integer.MIN_VALUE;
        if(!listInteiros.isEmpty()){
            for(Integer i : listInteiros){
                if (i >= maiorInteiro){
                    maiorInteiro = i;
                }
            }
            return maiorInteiro;
        }else {
            throw new RuntimeException("A Lista está Vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorInteiro = Integer.MAX_VALUE;
        if(!listInteiros.isEmpty()){
            for(Integer i : listInteiros){
                if (i <= menorInteiro){
                    menorInteiro = i;
                }
            }
            return menorInteiro;
        }else {
            throw new RuntimeException("A Lista está Vazia!");
        }
    }

    public void exibirNumeros(){
        if(!listInteiros.isEmpty()){
            System.out.println(this.listInteiros);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
