package com.group1.gestao_seguranca.services;

import com.group1.gestao_seguranca.dto.visitantes.VisitantesRequestDTO;
import com.group1.gestao_seguranca.dto.visitantes.VisitantesResponseDTO;
import com.group1.gestao_seguranca.entities.Funcionarios;
import com.group1.gestao_seguranca.entities.Visitantes;
import com.group1.gestao_seguranca.repositories.FuncionariosRepository;
import com.group1.gestao_seguranca.repositories.VisitantesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VisitantesService {

    private final VisitantesRepository visitantesRepo;
    private final FuncionariosRepository funcionariosRepo;

    public VisitantesService(VisitantesRepository visitantesRepo, FuncionariosRepository funcionariosRepo) {
        this.visitantesRepo = visitantesRepo;
        this.funcionariosRepo = funcionariosRepo;
    }

    @Transactional
    public VisitantesResponseDTO criar(VisitantesRequestDTO dto) {
        if (visitantesRepo.existsByDocumentoIdentificacao(dto.getDocumentoIdentificacao())) {
            throw new IllegalStateException(
                    "Já existe um visitante com o documento: " + dto.getDocumentoIdentificacao());
        }

        Visitantes visitante = new Visitantes();
        visitante.setNomeVisitante(dto.getNomeVisitante());
        visitante.setDocumentoIdentificacao(dto.getDocumentoIdentificacao());
        visitante.setEmpresa(dto.getEmpresa());
        visitante.setObservacoes(dto.getObservacoes());

        return VisitantesResponseDTO.from(visitantesRepo.save(visitante));
    }

    public List<VisitantesResponseDTO> listarTodos() {
        return visitantesRepo.findAll()
                .stream()
                .map(VisitantesResponseDTO::from)
                .toList();
    }

    public VisitantesResponseDTO buscarPorId(int id) {
        return visitantesRepo.findById(id)
                .map(VisitantesResponseDTO::from)
                .orElseThrow(() -> new EntityNotFoundException("Visitante não encontrado: id=" + id));
    }

    public VisitantesResponseDTO buscarPorDocumento(String documento) {
        return visitantesRepo.findByDocumentoIdentificacao(documento)
                .map(VisitantesResponseDTO::from)
                .orElseThrow(() -> new EntityNotFoundException("Visitante não encontrado: doc=" + documento));
    }
}