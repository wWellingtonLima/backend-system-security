package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Chaves;
import com.group1.gestao_seguranca.entities.TipoConsumo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoConsumoRepository extends JpaRepository<TipoConsumo, Integer> {
}
