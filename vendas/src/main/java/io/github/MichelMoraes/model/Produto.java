package io.github.MichelMoraes.model;

import java.math.BigDecimal;

public class Produto {

    private Integer id;
    private String descricao;
    private BigDecimal preco_Unitario;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco_Unitario() {
        return preco_Unitario;
    }

    public void setPreco_Unitario(BigDecimal preco_Unitario) {
        this.preco_Unitario = preco_Unitario;
    }
}
