package com.financeiro.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {
    private String banco;   // Ex: Santander, Itaú, Pix
    private String categoria;   // Ex: Lazer, Alimentação
    private BigDecimal valor;   // O valor em R$
    private String tipo;    // "RECEITA" ou "DESPESA"
    private String observacao;   // Lembrete do gasto
    private LocalDate data;   // Data da compra
}
