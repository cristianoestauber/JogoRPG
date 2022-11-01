package personagens.jogador;

import atributos.personagem.jogador.AtributosJogador;
import main.itens.equipamentos.armaduras.Peito;
import main.itens.equipamentos.armaduras.Bota;
import main.itens.equipamentos.armaduras.Elmo;
import main.itens.equipamentos.armaduras.Luva;
import personagens.Personagem;
import personagens.jogador.classes.TiposClasses;

public abstract class Jogador extends Personagem {

    private AtributosJogador atributosJogador;

    private TiposClasses classes;

    private Elmo elmo;
    private Peito peito;
    private Luva luva;
    private Bota bota;


    public Jogador(){

    }

    public Jogador (TiposClasses classes){
        this.classes = classes;
    }

    @Override
    public void atacar(){

    };

    @Override
    public void defender(){

    };

    @Override
    public void usarMagia(){

    };

    public AtributosJogador getAtributosJogador() {
        return atributosJogador;
    }

    public void setAtributosJogador(AtributosJogador atributosJogador) {
        this.atributosJogador = atributosJogador;
    }

    public TiposClasses getClasses() {
        return classes;
    }

    public void setClasses(TiposClasses classes) {
        this.classes = classes;
    }

    public Elmo getElmo() {
        return elmo;
    }

    public void setElmo(Elmo elmo) {
        this.elmo = elmo;
    }

    public Peito getPeito() {
        return peito;
    }

    public void setPeito(Peito peito) {
        this.peito = peito;
    }

    public Luva getLuva() {
        return luva;
    }

    public void setLuva(Luva luva) {
        this.luva = luva;
    }

    public Bota getBota() {
        return bota;
    }

    public void setBota(Bota bota) {
        this.bota = bota;
    }
}
