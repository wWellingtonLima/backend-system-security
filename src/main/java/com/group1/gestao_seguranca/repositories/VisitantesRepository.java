package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Visitantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface VisitantesRepository extends JpaRepository<Visitantes, Integer> {

    boolean existsByDocumentoIdentificacao(String documentoIdentificacao);

    Optional<Visitantes> findByDocumentoIdentificacao(String documentoIdentificacao);

    @Query("""
                SELECT v FROM Visitantes v
                WHERE LOWER(v.nomeVisitante) LIKE LOWER(CONCAT('%', :t1, '%'))
                  AND LOWER(v.nomeVisitante) LIKE LOWER(CONCAT('%', :t2, '%'))
                  AND LOWER(v.nomeVisitante) LIKE LOWER(CONCAT('%', :t3, '%'))
                ORDER BY v.nomeVisitante
            """)
    List<Visitantes> procurarNomeVisitante(
            @Param("t1") String t1,
            @Param("t2") String t2,
            @Param("t3") String t3
    );
}
