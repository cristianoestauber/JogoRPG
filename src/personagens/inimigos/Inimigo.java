package personagens.inimigos;

import atributos.personagem.inimigo.AtributosInimigo;
import personagens.Personagem;

//falta lista de loot (NAO ESQUECER)
public abstract class Inimigo extends Personagem {

    public Inimigo(Racas racas){
        this.racas = racas;
    }

    Racas racas;
    AtributosInimigo atributosInimigo;






}
