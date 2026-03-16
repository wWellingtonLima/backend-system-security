package com.group1.gestao_seguranca.dto.movimentacoes;

public class EntregaChaveDTO {
    private Integer idChave;
    private String codigoChave;
    private Integer idMolho;
    private String observacoes;

    public Integer getIdChave() {
        return idChave;
    }

    public String getCodigoChave() {
        return codigoChave;
    }

    public void setCodigoChave(String codigoChave) {
        this.codigoChave = codigoChave;
    }

    public void setIdChave(Integer idChave) {
        this.idChave = idChave;
    }

    public Integer getIdMolho() {
        return idMolho;
    }

    public void setIdMolho(Integer idMolho) {
        this.idMolho = idMolho;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
