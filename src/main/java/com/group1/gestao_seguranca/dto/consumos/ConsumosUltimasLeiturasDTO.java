package com.group1.gestao_seguranca.dto.consumos;

public class ConsumosUltimasLeiturasDTO {
    private Integer agua;
    private Integer eletricidade;
    private Integer gas;

    public ConsumosUltimasLeiturasDTO(Integer agua, Integer eletricidade, Integer gas) {
        this.agua = agua;
        this.eletricidade = eletricidade;
        this.gas = gas;
    }

    public Integer getAgua() {
        return agua;
    }

    public Integer getEletricidade() {
        return eletricidade;
    }

    public Integer getGas() {
        return gas;
    }
}
