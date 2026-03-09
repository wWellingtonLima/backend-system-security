package com.group1.gestao_seguranca.controllers;

import com.group1.gestao_seguranca.entities.Visitantes;
import com.group1.gestao_seguranca.repositories.VisitantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/visitantes/")
public class VisitantesController {

    @Autowired
    VisitantesRepository visitantesRepo;

    public List<Visitantes> getVisitantes() {
        return visitantesRepo.findAll();
    }
}
