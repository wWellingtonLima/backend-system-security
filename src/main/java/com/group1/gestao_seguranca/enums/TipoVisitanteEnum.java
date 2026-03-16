package com.group1.gestao_seguranca.enums;

public enum TipoVisitanteEnum implements LabeledEnum {
    VISITANTE("Visitante"),
    ENTREGA("Entrega"),
    MANUTENCAO("Manutenção"),
    REUNIAO("Reunião"),
    SERVICO("Serviço"),
    OUTRO("Outro");

    private final String label;

    TipoVisitanteEnum(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}

