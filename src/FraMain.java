
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FraMain extends JFrame {

    JPanel panMaster;
    CardLayout cardLayout;

    public FraMain() throws IOException {

        PanResult panResult = new PanResult();
        PanText panText = new PanText();
        PanOut panout = new PanOut();
        PanTimer pantimer = new PanTimer(panout);
        PanScore panscore = new PanScore();
        setLayout(new BorderLayout());
        setTitle("Type Check");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panResult, BorderLayout.SOUTH);
        add(panText, BorderLayout.NORTH);
        add(panout, BorderLayout.EAST);
        }
}
