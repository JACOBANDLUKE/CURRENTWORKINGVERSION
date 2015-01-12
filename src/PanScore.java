
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stecj9624
 */
class PanScore extends JPanel {

    public static JLabel lblscore = new JLabel();
    public static JLabel lblretry = new JLabel();
    public static JButton btnretry = new JButton();

    public PanScore() {
        add(lblscore);
        add(lblretry);
        add(btnretry);
        lblscore.setText("Your final score is" + PanResult.nCorrect);
        lblretry.setText("Do you want to play again");
    }
}
