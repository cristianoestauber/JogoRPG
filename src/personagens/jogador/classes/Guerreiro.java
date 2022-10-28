package personagens.jogador.classes;

import main.itens.equipamentos.armas.Escudo;
import main.itens.equipamentos.armas.Espada;
import main.itens.equipamentos.armas.Machado;
import personagens.jogador.Jogador;

public class Guerreiro extends Jogador {
    private Machado machado;
    private Espada espada;
    private Escudo escudo;

    public Guerreiro(){
        super(TiposClasses.GUERREIRO);
    }

}
