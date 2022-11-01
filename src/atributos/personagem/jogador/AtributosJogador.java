package atributos.personagem.jogador;


import atributos.personagem.AtributosPersonagem;

public class AtributosJogador extends AtributosPersonagem {



    private int pontosMana;
    private int nivel;
    private int xpAtual;
    private int xpProximo;



    public int getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(int pontosMana) {
        this.pontosMana = pontosMana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getXpAtual() {
        return xpAtual;
    }

    public void setXpAtual(int xpAtual) {
        this.xpAtual = xpAtual;
    }

    public int getXpProximo() {
        return xpProximo;
    }

    public void setXpProximo(int xpProximo) {
        this.xpProximo = xpProximo;
    }
}
