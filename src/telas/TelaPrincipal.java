package telas;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal(){
        super("Primeiro Jogo");

        JPanel painel = new JPanel();
        this.add(painel);
        painel.setLayout(null);

        JPanel personagem = new JPanel();
        painel.add(personagem);
        personagem.setLayout(null);
        personagem.setBackground(Color.LIGHT_GRAY);
        personagem.setBounds(8, 10, 200, 50);

        JLabel status = new JLabel("STATUS");
        personagem.add(status);
        status.setBackground(Color.WHITE);
        status.setBounds(75, 1, 50, 14);

        JLabel vida = new JLabel("VIDA: ");
        personagem.add(vida);
        vida.setBounds(5, 15, 50, 18);

        JLabel mana = new JLabel("MANA: ");
        personagem.add(mana);
        mana.setBounds(5, 30, 50, 18);

        JLabel xp = new JLabel("EXP: ");
        personagem.add(xp);
        xp.setBounds(115, 15, 50, 18);

        JLabel level = new JLabel("LEVEL: ");
        personagem.add(level);
        level.setBounds(115, 30, 50, 18);

        JButton botaoAtacar = new JButton("Atacar");
        painel.add(botaoAtacar);
        botaoAtacar.setBounds(15, 192, 90, 25);

        JButton botaoDefender = new JButton("Defender");
        painel.add(botaoDefender);
        botaoDefender.setBounds(110, 192, 90, 25);

        JButton botaoMagia = new JButton("Magias");
        painel.add(botaoMagia);
        botaoMagia.setBounds(15, 220, 90, 25);

        JButton botaoItens = new JButton("Itens");
        painel.add(botaoItens);
        botaoItens.setBounds(110, 220, 90, 25);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(150, 35, 232, 300);
        this.setVisible(true);
    }
}
