import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

// Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T
// É usada para realizar operações de redução em pares de elementos , como somar números ou combinar
// objetos...

public class BinaryOperatorExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        //BinaryOperator<Integer> somar = ;
        int resultado = numeros.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Resultado: " + resultado);
    }

}
