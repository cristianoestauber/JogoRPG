package personagens.inimigos;

import personagens.Racas;

public final class FabricaInimigos {
    public static Inimigo retornarInimigo(Racas racas) {
        Inimigo retorno = null;

            switch (racas) {
                case ZUMBI:
                    retorno = new Zumbi();
                    break;
                case HUMANO:
                    retorno = new Humano();
                    break;
                case ELFO:
                    retorno = new Elfo();
                    break;
                case GOBLIN:
                    retorno = new Goblin();
                    break;
                default:
                    System.out.println("Escolha um Inimigo");
                    break;
            }
            return retorno;
        }
    }

