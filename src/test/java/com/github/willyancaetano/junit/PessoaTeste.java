package com.github.willyancaetano.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa eliane = new Pessoa("Eliane Coutinho", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(24, eliane.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa eliane = new Pessoa("Eliane Coutinho", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(eliane.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

   @Test
    void validaIgualdade() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
        Assertions.assertSame(pessoa, pessoa);
    }
}
