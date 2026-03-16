package com.group1.gestao_seguranca.dto.movimentacoes;

public class EntregaPendenteDTO {

    private int idEntrega;
    private String descricao;   // ex: "CHV-101-P" ou "Molho TI"
    private String tipo;        // "CHAVE" ou "MOLHO"
    private String observacoes;

    public EntregaPendenteDTO(int idEntrega, String descricao, String tipo, String observacoes) {
        this.idEntrega = idEntrega;
        this.descricao = descricao;
        this.tipo = tipo;
        this.observacoes = observacoes;
    }

    // getters e setters
    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
