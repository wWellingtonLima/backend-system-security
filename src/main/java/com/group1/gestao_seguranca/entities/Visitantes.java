package com.group1.gestao_seguranca.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "visitantes")
public class Visitantes extends Pessoa {
    @Column(name = "nome_visitante", nullable = false, length = 150)
    private String nomeVisitante;

    @Column(name = "empresa", length = 100)
    private String empresa;

    @Column(name = "documento_identificacao", unique = true, nullable = false, length = 30)
    private String documentoIdentificacao;

    private String observacoes;

    @OneToMany(mappedBy = "visitante", fetch = FetchType.LAZY)
    private List<Movimentacoes> movimentacoes;

    @OneToMany(mappedBy = "visitanteComChave", fetch = FetchType.LAZY)
    private List<EntregaChaves> chavesRecebidas;

    public Visitantes() {
    }

    public Visitantes(String nomeVisitante, String documentoIdentificacao) {
        this.nomeVisitante = nomeVisitante;
        this.documentoIdentificacao = documentoIdentificacao;
    }

    public Visitantes(String nomeVisitante, String empresa, String documentoIdentificacao, String setorDestino) {
        this.nomeVisitante = nomeVisitante;
        this.empresa = empresa;
        this.documentoIdentificacao = documentoIdentificacao;
    }

    public List<Movimentacoes> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacoes> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public List<EntregaChaves> getChavesRecebidas() {
        return chavesRecebidas;
    }

    public void setChavesRecebidas(List<EntregaChaves> chavesRecebidas) {
        this.chavesRecebidas = chavesRecebidas;
    }

    public String getNomeVisitante() {
        return nomeVisitante;
    }

    public void setNomeVisitante(String nomeVisitante) {
        this.nomeVisitante = nomeVisitante;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public void setDocumentoIdentificacao(String documentoIdentificacao) {
        this.documentoIdentificacao = documentoIdentificacao;
    }
}