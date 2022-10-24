package personagens;

public class Inimigos extends Personagem{

    private int xpGanho;

    //falta lista de loot (NAO ESQUECER)

    public Inimigos(Racas racas){
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

    @Override
    public void atacar(){

    };

    @Override
    public void defender(){

    };

    @Override
    public void usarMagia(){

    };

}
