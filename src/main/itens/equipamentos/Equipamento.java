package main.itens.equipamentos;

import atributos.equipamentos.AtributosEquipamento;

public abstract class Equipamento {

    AtributosEquipamento atributosEquipamento;

    public AtributosEquipamento getAtributosEquipamento() {
        return atributosEquipamento;
    }

    public void setAtributosEquipamento(AtributosEquipamento atributosEquipamento) {
        this.atributosEquipamento = atributosEquipamento;
    }
}
