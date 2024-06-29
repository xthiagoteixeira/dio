import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SuplierExample {

    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada...
        //Supplier<String> saudacao = ;

        // Usar o Supplier para fornecer uma lista de 5 saudações personalizada...
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo ao programa")
                .limit(5)
                .collect(Collectors.toList());

        // Imprimir as saudações geradas...
        listaSaudacoes.forEach(System.out::println);

    }

}
