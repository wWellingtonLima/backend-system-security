package com.group1.gestao_seguranca.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "visitantes")
public class Visitantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visitante")
    private int id;

    @Column(nullable = false, length = 150)
    private String nomeVisitante;

    @Column(length = 100)
    private String empresa;

    @Column(nullable = false, length = 30)
    private String documentoIdentificacao;

    @Column(length = 100)
    private String setorDestino;

    @OneToMany(mappedBy = "visitante", fetch = FetchType.LAZY)
    private List<Visitas> visitas;

    private String createUser;
    private LocalDateTime createDate;
    private String modifyUser;
    private LocalDateTime modifyDate;

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
        this.setorDestino = setorDestino;
    }

    public List<Visitas> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<Visitas> visitas) {
        this.visitas = visitas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeVisitante() {
        return nomeVisitante;
    }

    public void setNomeVisitante(String nomeVisitante) {
        this.nomeVisitante = nomeVisitante;
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

    public String getSetorDestino() {
        return setorDestino;
    }

    public void setSetorDestino(String setorDestino) {
        this.setorDestino = setorDestino;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }
}
