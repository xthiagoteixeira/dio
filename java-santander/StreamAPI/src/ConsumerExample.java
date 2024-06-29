import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // Criar uma lista de numeros Inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar o Consumer com expressão Lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir numeros pares no Stream
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
        );
    }
}
