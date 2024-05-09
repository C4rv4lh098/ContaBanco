package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {
    public static void main(String[] args) {
        //Desafio 6 - Verificar se a lista contém algum número maior que 10:
        //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> result = numeros.stream()
                .filter(numero -> numero > 10).toList();
        if (!result.isEmpty()){
            System.out.println("A lista contém " + result.size() + " número(s) maior(es) que 10");
            System.out.println(result);
        }else {
            System.out.println("Lista não possui números maiores que 10");
        }
    }
}
