package com.group1.gestao_seguranca.dto.visitantes;

import com.group1.gestao_seguranca.entities.Visitantes;
import com.group1.gestao_seguranca.enums.TipoVisitanteEnum;

public class VisitantesResponseDTO {

    private int id;
    private String nomeVisitante;
    private String documentoIdentificacao;
    private String empresa;
    private String setorDestino;
    private TipoVisitanteEnum tipoVisitante;
    private String observacoes;
    private String nomeFuncionarioResponsavel; //So o nome

    public static VisitantesResponseDTO from(Visitantes v) {
        VisitantesResponseDTO dto = new VisitantesResponseDTO();
        dto.id = v.getId();
        dto.nomeVisitante = v.getNomeVisitante();
        dto.documentoIdentificacao = v.getDocumentoIdentificacao();
        dto.empresa = v.getEmpresa();
        dto.setorDestino = v.getSetorDestino();
        dto.tipoVisitante = v.getTipoVisitante();
        dto.observacoes = v.getObservacoes();

        if (v.getFuncionarioResponsavel() != null) {
            dto.nomeFuncionarioResponsavel = v.getFuncionarioResponsavel().getNomeFuncionario();
        }

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

    public String getSetorDestino() {
        return setorDestino;
    }

    public TipoVisitanteEnum getTipoVisita() {
        return tipoVisitante;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public String getNomeFuncionarioResponsavel() {
        return nomeFuncionarioResponsavel;
    }
}
