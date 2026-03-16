package com.group1.gestao_seguranca.dto.visitantes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class VisitantesRequestDTO {

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 150)
    private String nomeVisitante;

    @NotBlank(message = "Documento de identificação é obrigatório")
    @Size(max = 30)
    private String documentoIdentificacao;

    @Size(max = 100)
    private String empresa;

    private String observacoes;

    public String getNomeVisitante() {
        return nomeVisitante;
    }

    public void setNomeVisitante(String nomeVisitante) {
        this.nomeVisitante = nomeVisitante;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public void setDocumentoIdentificacao(String documentoIdentificacao) {
        this.documentoIdentificacao = documentoIdentificacao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
