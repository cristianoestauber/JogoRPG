package personagens;

import atributos.AtributosGerais;
import personagens.inimigos.Racas;

public abstract class Personagem {

    private String nome;
    private Racas racas;
    private int vida;
    private int nivel;


    public Personagem(){

    }

    public abstract void atacar();
    public abstract void defender();
    public abstract void usarMagia();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Racas getRacas() {
        return racas;
    }

    public void setRacas(Racas racas) {
        this.racas = racas;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
