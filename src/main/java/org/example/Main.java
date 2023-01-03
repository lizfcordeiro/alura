package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        orcamento orcamento = new orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento,TipoImposto.ISS));
    }
}