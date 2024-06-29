import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    public static void main(String[] args) {
        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar a Function com expressão lambda para dobrar todos os numeros
        //Function<Integer, Integer> dobrar = ;

        // Usar a função para dobrar todos os números no Stream a armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(numero -> numero * 2)
                .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
