package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Users;
import com.group1.gestao_seguranca.entities.Visitantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitantesRepository extends JpaRepository<Visitantes, Integer> {
}
