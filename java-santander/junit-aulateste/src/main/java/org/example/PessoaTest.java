package org.example;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class PessoaTest {

    @Test
    public void testMethod() {
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2020,1,1));
        assertEquals(4, pessoa.getIdade());
    }

}
