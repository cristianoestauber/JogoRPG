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

        this.setBounds(8, 10, 200, 50);
        this.setLayout(null);
        this.setBackground(Color.ORANGE);

        status = new JLabel("STATUS");
        this.add(status);
        status.setBounds(75, 1, 50, 14);

        vida = new JLabel("VIDA: ");
        this.add(vida);
        vida.setBounds(5, 15, 50, 18);

        this.add(vida);
        mana = new JLabel("MANA: ");
        this.add(mana);
        mana.setBounds(5, 30, 50, 18);

        this.add(mana);

        xp = new JLabel("EXP: ");
        this.add(xp);
        xp.setBounds(115, 15, 50, 18);

        this.add(xp);

        level = new JLabel("LEVEL: ");
        this.add(level);
        level.setBounds(115, 30, 50, 18);

        this.add(level);






    }


}
