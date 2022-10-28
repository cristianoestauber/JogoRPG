package main.itens.equipamentos;

import main.itens.equipamentos.armas.TipoArmas;

public abstract class Equipamento {

    private TipoArmas tipoEquipamento;
    private int mana;
    private int forca;
    private int velocidade;
    private int defesa;


    public TipoArmas getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(TipoArmas tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
