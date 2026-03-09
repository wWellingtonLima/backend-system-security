package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Chaves;
import com.group1.gestao_seguranca.entities.TipoChave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiposChavesRepository extends JpaRepository<TipoChave, Integer> {
}
