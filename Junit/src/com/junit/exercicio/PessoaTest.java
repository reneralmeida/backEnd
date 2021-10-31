package com.junit.exercicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa0;
    Pessoa pessoa1;
    Pessoa pessoa2;

    @BeforeEach
    void doBefore() {
        pessoa0 = new Pessoa("Whatever", "Whenever");
        pessoa0.setIdade(LocalDate.of(1990, 6, 23));
        pessoa1 = new Pessoa("Wherever", "Whoever");
        pessoa1.setIdade(LocalDate.of(1990, 10, 3));
        pessoa2 = new Pessoa("Whichever", "Whatever");
        pessoa2.setIdade(LocalDate.of(1990, 8, 10));
    }

    @Test
    void getNomeCompleto() {
        assertEquals("Whatever, Whenever", pessoa0.calcNome());
        assertEquals("Wherever, Whoever", pessoa1.calcNome());
        assertEquals("Whichever, Whatever", pessoa2.calcNome());
    }

    @Test
    void getMajority() {
        assertEquals(pessoa0.majority(), true);
        assertEquals(pessoa1.majority(), true);
        assertEquals(pessoa2.majority(), true);
    }
}