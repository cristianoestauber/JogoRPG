package main.itens.equipamentos.armaduras;

import main.itens.equipamentos.Equipamento;

public abstract class Armadura extends Equipamento {
    private TipoArmaduras tipoArmaduras;

    public Armadura(TipoArmaduras tipoArmaduras){
        this.tipoArmaduras = tipoArmaduras;
    }

    public TipoArmaduras getTipoArmaduras() {
        return tipoArmaduras;
    }

    public void setTipoArmaduras(TipoArmaduras tipoArmaduras) {
        this.tipoArmaduras = tipoArmaduras;
    }
}
