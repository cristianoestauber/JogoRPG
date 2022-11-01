package main.itens.equipamentos.armas;

import main.itens.equipamentos.Equipamento;

public abstract class Armas extends Equipamento {

    private TipoArmas tipoArmas;

    public Armas(TipoArmas tipoArmas){
        this.tipoArmas = tipoArmas;
    }

    public TipoArmas getTipoArmas() {
        return tipoArmas;
    }

    public void setTipoArmas(TipoArmas tipoArmas) {
        this.tipoArmas = tipoArmas;
    }
}
