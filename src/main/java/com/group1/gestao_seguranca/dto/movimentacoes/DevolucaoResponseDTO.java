package com.group1.gestao_seguranca.dto.movimentacoes;

import com.group1.gestao_seguranca.entities.EntregaChaves;

import java.time.LocalDateTime;

public class DevolucaoResponseDTO {

    private int idEntrega;
    private String codigoChave;   // null se for molho
    private String nomeMolho;     // null se for chave
    private String tipo;          // "CHAVE" ou "MOLHO"
    private LocalDateTime horaEntrega;
    private LocalDateTime horaDevolucao;
    private String devolvidaPor;
    private String observacoes;

    public static DevolucaoResponseDTO from(EntregaChaves entrega) {
        DevolucaoResponseDTO dto = new DevolucaoResponseDTO();
        dto.idEntrega = entrega.getId();
        dto.horaEntrega = entrega.getHoraEntrega();
        dto.horaDevolucao = entrega.getHoraDevolucao();
        dto.devolvidaPor = entrega.getDevolvidaPor();
        dto.observacoes = entrega.getObservacoes();

        if (entrega.getChave() != null) {
            dto.tipo = "CHAVE";
            dto.codigoChave = entrega.getChave().getCodigoChave();
        } else if (entrega.getMolho() != null) {
            dto.tipo = "MOLHO";
            dto.nomeMolho = entrega.getMolho().getNomeMolho();
        }

        return dto;
    }

    // getters
    public int getIdEntrega() {
        return idEntrega;
    }

    public String getCodigoChave() {
        return codigoChave;
    }

    public String getNomeMolho() {
        return nomeMolho;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getHoraEntrega() {
        return horaEntrega;
    }

    public LocalDateTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public String getDevolvidaPor() {
        return devolvidaPor;
    }

    public String getObservacoes() {
        return observacoes;
    }
}