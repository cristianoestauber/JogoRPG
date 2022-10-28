package personagens.jogador.classes;

import main.itens.equipamentos.armas.Cajado;
import personagens.jogador.Jogador;

public class Mago extends Jogador {
    private Cajado cajado;

    public Mago(){
        super(TiposClasses.MAGO);
    }
}
