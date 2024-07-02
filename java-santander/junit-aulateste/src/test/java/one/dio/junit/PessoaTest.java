package one.dio.junit;

import org.example.Pessoa;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void testeIdade() {
        Pessoa julia = new Pessoa("julia", LocalDate.of(2020,1,1));
        assertEquals(4, julia.getIdade());

        Pessoa thiago = new Pessoa("julia", LocalDate.of(1982,10,4));
        assertEquals(41, thiago.getIdade());
        // Espero que seja 41, quando chamar a classe

    }

    @Test
    public void testeMaiorDeIdade() {
        Pessoa julia = new Pessoa("julia", LocalDate.of(1949,1,1));
        assertTrue(julia.ehMaiorDeIdade());
        // Se é verdadeiro ou não

        Pessoa thiago = new Pessoa("thiago", LocalDate.of(2023,10,4));
        assertFalse(thiago.ehMaiorDeIdade());
        // Se é falso ou não

    }

}
