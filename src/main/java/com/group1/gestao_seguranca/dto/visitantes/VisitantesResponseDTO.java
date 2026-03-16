package com.group1.gestao_seguranca.dto.visitantes;

import com.group1.gestao_seguranca.entities.Visitantes;
import com.group1.gestao_seguranca.enums.TipoVisitanteEnum;

public class VisitantesResponseDTO {

    private int id;
    private String nomeVisitante;
    private String documentoIdentificacao;
    private String empresa;
    private String observacoes;

    public static VisitantesResponseDTO from(Visitantes v) {
        VisitantesResponseDTO dto = new VisitantesResponseDTO();
        dto.id = v.getId();
        dto.nomeVisitante = v.getNomeVisitante();
        dto.documentoIdentificacao = v.getDocumentoIdentificacao();
        dto.empresa = v.getEmpresa();
        dto.observacoes = v.getObservacoes();

        return dto;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getNomeVisitante() {
        return nomeVisitante;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getObservacoes() {
        return observacoes;
    }

}
