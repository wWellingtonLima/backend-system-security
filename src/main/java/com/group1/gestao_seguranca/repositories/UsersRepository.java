package com.group1.gestao_seguranca.repositories;

import com.group1.gestao_seguranca.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
