package Ordenacao.Exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listInteiro;

    public OrdenacaoNumeros() {
        this.listInteiro = new ArrayList<>();
    }

    public List<Integer> getListInteiro() {
        return listInteiro;
    }

    public void adicionarNumero(int numero){
        listInteiro.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(this.listInteiro);
        if(!listInteiro.isEmpty()){
            Collections.sort(listaAscendente);
            return listaAscendente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer>ordenarDescendente(){
        List<Integer> listaDescendente = new ArrayList<>(this.listInteiro);
        if(!listInteiro.isEmpty()){
            listaDescendente.sort(Collections.reverseOrder());
            return listaDescendente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listInteiro.isEmpty()) {
            System.out.println(this.listInteiro);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}

