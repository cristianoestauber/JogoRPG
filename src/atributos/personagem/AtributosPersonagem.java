package atributos.personagem;

import atributos.AtributosGerais;

public abstract class AtributosPersonagem extends AtributosGerais {

    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
