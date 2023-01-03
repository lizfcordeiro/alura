package org.example;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(orcamento orcamento, TipoImposto tipoImposto) {
        switch (tipoImposto){
            case ICMS -> {
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            } case ISS -> {
                return orcamento.getValor().multiply(new BigDecimal("0.06"));
            }default -> {
                return BigDecimal.ZERO;
            }
        }
    }
}
