/*Desafio 3 - Verifique se todos os números da lista são positivos:
        Com a ajuda da Stream API, verifique se todos os números da lista
        são positivos e exiba o resultado no console.*/

package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioThree {

    public static void main(String[] args) {

//        List<Integer> numeros = Arrays.asList(-1, -4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroPositivo = numeros.stream().allMatch(n -> n > 0);

        if(numeroPositivo){
            System.out.println("Todos os numeros são positivos");
        } else {
            System.out.println("Existem numeros negativos na lista");
        }
    }
}
