package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FuncionariosRepository extends JpaRepository<Funcionarios, Integer> {
    Optional<Funcionarios> findByNumeroFuncionario(String numeroFuncionario);

    boolean existsByNumeroFuncionario(String numeroFuncionario);

    List<Funcionarios> findBySetorIgnoreCase(String setor);

    // Busca por múltiplos tokens (case-insensitive)
    @Query("""
                SELECT f FROM Funcionarios f
                WHERE LOWER(f.nomeFuncionario) LIKE LOWER(CONCAT('%', :t1, '%'))
                  AND LOWER(f.nomeFuncionario) LIKE LOWER(CONCAT('%', :t2, '%'))
                  AND LOWER(f.nomeFuncionario) LIKE LOWER(CONCAT('%', :t3, '%'))
                ORDER BY f.nomeFuncionario
            """)
    List<Funcionarios> procurarNomeFuncionario(
            @Param("t1") String t1,
            @Param("t2") String t2,
            @Param("t3") String t3
    );
}
