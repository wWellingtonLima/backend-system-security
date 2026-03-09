package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Chaves;
import com.group1.gestao_seguranca.entities.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChavesRepository extends JpaRepository<Chaves, Integer> {
}
