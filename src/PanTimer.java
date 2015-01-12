
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stecj9624
 */
public class PanTimer extends JPanel {

    PanOut panOut;
    int nCount;
    Timer timer;
    
    public PanTimer(PanOut _panOut) {
        panOut = _panOut;
        timer = new Timer(1000, updateTask);
        nCount = 30;
        timer.start();
        
    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount--;
            panOut.UpdateLabel(nCount);
            if (nCount == 0){
                timer.stop();
              
            }
        }
    };
}