package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {
    public static void main(String[] args) {
        //Desafio 5 - Calcule a média dos números maiores que 5:
        //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> result = numeros.stream()
                .filter(numero -> numero > 5).toList();

        Integer soma = result.stream().reduce(0, Integer::sum);

        //System.out.println(result);
        //System.out.println(soma);
        System.out.println(soma/result.size());
    }
}
