package telas;

import telas.layout.LayoutStatus;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal(){
        super("Primeiro Jogo");

        JPanel painel = new JPanel();
        this.add(painel);
        painel.setLayout(null);

        LayoutStatus status = new LayoutStatus();
        painel.add(status);


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
