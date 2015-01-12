
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FraMain extends JFrame {

    public JPanel panMaster;
    public CardLayout cardLayout;

    public FraMain() throws IOException {
        setLayout(new BorderLayout());
        setTitle("Type Check");
        setSize(600, 400);
        setVisible(true);
          setResizable(false);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PanResult panResult = new PanResult();
        PanText panText = new PanText();
        PanOut panout = new PanOut();
        PanTimer pantimer = new PanTimer(panout);
        PanScore panscore = new PanScore();
        panMaster = new JPanel(new CardLayout());
        
        add(panResult, BorderLayout.SOUTH);
        add(panText, BorderLayout.NORTH);
        add(panout, BorderLayout.EAST);
        
        panMaster.add(panscore);
        getContentPane().add(panMaster);
        setVisible(true); //Make JFrame visible
        cardLayout = (CardLayout) panMaster.getLayout();
        if (pantimer.nCount == 0) {
            pantimer.timer.stop();
           
            cardLayout.next(panMaster);
        }

    }
}
