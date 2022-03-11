package br.com.krod.maven.teste.core;

public class CalculatorImpl implements Calculator {
    @Override
    public float somar(float... values) {
        float co = 0;
        for (Object c : values) {
            co+= (float)c;
        }
        return co;
    }
}
