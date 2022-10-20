package application;


import javax.swing.*;

public class Program extends JFrame {

    public static void main(String[] args) {

        JFrame janelaPrincipal = new JFrame("Primeiro Jogo");

        JPanel painel = new JPanel();
        janelaPrincipal.add(painel);
        painel.setLayout(null);

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

        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setBounds(150, 35, 232, 300);
        janelaPrincipal.setVisible(true);

    }
}
