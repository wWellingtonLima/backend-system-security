package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.EntregaChaves;
import com.group1.gestao_seguranca.entities.Movimentacoes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntregaChavesRepository extends JpaRepository<EntregaChaves, Integer> {
    List<EntregaChaves> findByMovimentacaoAndHoraDevolucaoIsNull(Movimentacoes movimentacoes);
}
