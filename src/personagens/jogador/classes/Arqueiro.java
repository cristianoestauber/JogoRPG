package personagens.jogador.classes;

import main.itens.equipamentos.armas.Arco;
import personagens.jogador.Jogador;

public class Arqueiro extends Jogador {
    private Arco arco;

    public Arqueiro(){
        super(TiposClasses.ARQUEIRO);
    }
}
