package br.com.krod.maven.teste.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorImplTest {

    CalculatorImpl calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    void deveraRetornarASomaDe1Mais1() {
        float result = calculator.somar(1.0F,1.0F);
        Assertions.assertEquals(2.0F, result);
    }
}