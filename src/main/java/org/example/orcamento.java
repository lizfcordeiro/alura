package org.example;

import java.math.BigDecimal;

public class orcamento {
    public BigDecimal valor;
    public orcamento(BigDecimal valor){
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
