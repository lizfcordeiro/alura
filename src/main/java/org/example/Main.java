package org.example;

import org.example.imposto.CalculadoraDeImpostos;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.imposto.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));

    }
}