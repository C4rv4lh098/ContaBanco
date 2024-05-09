package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Desafio07 {
    public static void main(String[] args) {
        //Desafio 7 - Encontrar o segundo número maior da lista:
        //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNaoRepetidos = numeros.stream().distinct().toList();
        Integer maiorNumero = numerosNaoRepetidos.stream().mapToInt(v -> v).max().orElseThrow();
        List<Integer> numerosNaoRepetidosSemOMaior = numerosNaoRepetidos.stream().filter(n -> n != maiorNumero).toList();

        Integer segundoMaiorNumero = numerosNaoRepetidosSemOMaior.stream().mapToInt(v -> v).max().orElseThrow();

        System.out.println(segundoMaiorNumero);
    }
}
