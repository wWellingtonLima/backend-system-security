package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Chaves;
import com.group1.gestao_seguranca.entities.Visitas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitasRepository extends JpaRepository<Visitas, Integer> {
}
