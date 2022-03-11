package br.com.krod.maven.teste.app;

import br.com.krod.maven.teste.core.Calculator;
import br.com.krod.maven.teste.core.CalculatorImpl;

public class Main {

    public static void main(String[] args) {
        Calculator c = new CalculatorImpl();
        var result = c.somar(12, 13, 1, 4, 5, 0.25F);
        System.out.println(result);
    }
}
