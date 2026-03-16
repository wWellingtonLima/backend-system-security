package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Visitantes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitantesRepository extends JpaRepository<Visitantes, Integer> {

    boolean existsByDocumentoIdentificacao(String documentoIdentificacao);

    Optional<Visitantes> findByDocumentoIdentificacao(String documentoIdentificacao);
}
