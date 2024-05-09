package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio02 {
    public static void main(String[] args) {
        //Desafio 2 - Imprima a soma dos números pares da lista:
        //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer result = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}

