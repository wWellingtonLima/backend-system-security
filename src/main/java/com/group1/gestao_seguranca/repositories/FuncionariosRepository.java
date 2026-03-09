package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Funcionarios;
import com.group1.gestao_seguranca.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository extends JpaRepository<Funcionarios, Integer> {
}
