package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Salas;
import com.group1.gestao_seguranca.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalasRepository extends JpaRepository<Salas, Integer> {
}
