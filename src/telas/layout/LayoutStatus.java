package telas.layout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;


public class LayoutStatus extends JPanel {
    private  JLabel status;
    private JLabel vida;
    private JLabel mana;
    private JLabel xp;
    private JLabel level;
    private JLabel valorVida;
    private JLabel valorMana;
    private JLabel valorXp;
    private JLabel valorLevel;


    public LayoutStatus() {

        this.setLayout(null);

        status = new JLabel("STATUS");
        status.setBounds(75, 1, 50, 14);
        this.add(status);

        vida = new JLabel("VIDA: ");
        vida.setBounds(5, 15, 50, 18);
        this.add(vida);

        mana = new JLabel("MANA: ");
        mana.setBounds(5, 30, 50, 18);
        this.add(mana);

        xp = new JLabel("EXP: ");
        xp.setBounds(115, 15, 50, 18);
        this.add(xp);

        level = new JLabel("LEVEL: ");
        level.setBounds(115, 30, 50, 18);
        this.add(level);
    }

    public JLabel getValorVida() {
        return valorVida;
    }
    public void setValorVida(JLabel valorVida) {
        this.valorVida = valorVida;
    }
    public JLabel getValorMana() {
        return valorMana;
    }
    public void setValorMana(JLabel valorMana) {
        this.valorMana = valorMana;
    }
    public JLabel getValorXp() {
        return valorXp;
    }
    public void setValorXp(JLabel valorXp) {
        this.valorXp = valorXp;
    }
    public JLabel getValorLevel() {
        return valorLevel;
    }
    public void setValorLevel(JLabel valorLevel) {
        this.valorLevel = valorLevel;
    }

}
