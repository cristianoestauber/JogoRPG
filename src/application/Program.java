package application;


import javax.swing.*;

public class Program extends JFrame {

    public static void main(String[] args) {

        JFrame janela = new JFrame();

        JPanel painel = new JPanel();
        janela.add(painel);

        JButton botao = new JButton("Button 1");
        painel.add(botao);
        JButton botao2 = new JButton("Button 2");
        painel.add(botao2);
        JButton botao3 = new JButton("Button 3");
        painel.add(botao3);
        JButton botao4 = new JButton("Button 4");
        painel.add(botao4);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(150, 35, 250, 350);
        janela.setVisible(true);

    }
}
