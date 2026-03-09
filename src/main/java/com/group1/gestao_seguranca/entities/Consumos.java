package com.group1.gestao_seguranca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "consumos")
public class Consumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chave")
    private int id;

    private int valorLeitura;

}
