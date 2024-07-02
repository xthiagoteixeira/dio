package one.dio.junit;

import org.example.Pessoa;
import org.junit.Test;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AssertionsTeste {

    @Test
    public void testeLancamentos() {
        int[] primeiroLancamento = {1,2,3,4,5,6,7,8,9};
        int[] segundoLancamento = {1,2,3,4,5,6,7,8,9};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
        // esperado vs atual
        assertNotEquals(primeiroLancamento, segundoLancamento);
        // esperado vs atual

    }

    @Test
    public void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
        // Verifica se está nula

        pessoa = new Pessoa("thiago", LocalDate.now());
        Assertions.assertNotNull(pessoa);
        // Verifica se não está nulo


    }

    @Test
    public void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outrovalor = 5.0;

        Assertions.assertEquals(valor, outrovalor);

    }

}
