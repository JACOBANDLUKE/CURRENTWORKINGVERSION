
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
public class PanOut extends JPanel{
      int nCount;
    String sCount;
    private JLabel lblCount;

    public PanOut() {
        lblCount = new JLabel("30");
        add(lblCount);

    }

    void UpdateLabel(int _nCount) {
        nCount = _nCount;
        sCount = Integer.toString(nCount);
        lblCount.setText(sCount);
    }
}
    
