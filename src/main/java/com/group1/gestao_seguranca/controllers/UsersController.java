package com.group1.gestao_seguranca.controllers;

import com.group1.gestao_seguranca.entities.Users;
import com.group1.gestao_seguranca.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    UsersRepository usersRepo;

    @PostMapping
    public Boolean createUser(@RequestBody Users user) {
        usersRepo.save(user);

        return true;
    }
}
