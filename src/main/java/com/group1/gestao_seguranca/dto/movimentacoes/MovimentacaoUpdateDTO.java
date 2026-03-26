package com.group1.gestao_seguranca.dto.movimentacoes;


import com.group1.gestao_seguranca.enums.TipoVisitanteEnum;

public class MovimentacaoUpdateDTO {

    private String observacoes;
    private String setorDestino;
    private TipoVisitanteEnum tipoVisita;
    private Integer idFuncionarioResponsavel;

    // getters
    public String getObservacoes() {
        return observacoes;
    }

    public String getSetorDestino() {
        return setorDestino;
    }

    public TipoVisitanteEnum getTipoVisita() {
        return tipoVisita;
    }

    public Integer getIdFuncionarioResponsavel() {
        return idFuncionarioResponsavel;
    }
}

