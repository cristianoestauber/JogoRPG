package personagens;

public abstract class Personagem {

    String nome;
    private Racas racas;
    private int vida;
    private int mana;
    private int forca;
    private int velocidade;
    private int defesa;
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

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
