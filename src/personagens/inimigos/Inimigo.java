package personagens.inimigos;

import personagens.Personagem;

public abstract class Inimigo extends Personagem {

    private int xpGanho;
    public Inimigo() {

    }

    //falta lista de loot (NAO ESQUECER)

    public Inimigo(Racas racas){
        switch (racas){
            case ZUMBI:
                System.out.println("Zumbi");
                break;
            case HUMANO:
                System.out.println("Humano");
                break;
            case ELFO:
                System.out.println("Elfo");
                break;
            case GOBLIN:
                System.out.println("Goblin");
                break;
            default:
                System.out.println("Escolha um Inimigo");
                break;
        }
    }



}
