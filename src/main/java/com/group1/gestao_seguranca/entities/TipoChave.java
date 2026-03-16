package com.group1.gestao_seguranca.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.group1.gestao_seguranca.enums.TipoChaveEnum;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipo_chave")
public class TipoChave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_chave")
    private int id;

    @Column(nullable = false, name = "tipo_chave")
    @Enumerated(EnumType.STRING)
    private TipoChaveEnum tipoChave;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoChave", fetch = FetchType.LAZY)
    private List<Chaves> chaves;

    public TipoChave() {
    }

    public TipoChave(TipoChaveEnum tipoChave) {
        this.tipoChave = tipoChave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoChaveEnum getTipoChave() {
        return tipoChave;
    }

    public void setTipoChave(TipoChaveEnum tipoChave) {
        this.tipoChave = tipoChave;
    }

    public List<Chaves> getChaves() {
        return chaves;
    }

    public void setChaves(List<Chaves> chaves) {
        this.chaves = chaves;
    }
}

