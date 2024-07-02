package one.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void testMethod() {
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2020,1,1));
        Assertions.assertEquals(2, pessoa.getIdade());
    }


}
