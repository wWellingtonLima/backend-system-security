package com.group1.gestao_seguranca.dto.funcionarios;

import com.group1.gestao_seguranca.entities.Funcionarios;

public record FuncionarioBuscaDTO(
        Integer id,
        String nomeFuncionario,
        String setor
) {
    public static FuncionarioBuscaDTO from(Funcionarios f) {
        return new FuncionarioBuscaDTO(f.getId(), f.getNomeFuncionario(), f.getSetor());
    }
}
