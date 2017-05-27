package w3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by MichaĹ‚ on 2016-10-24.
 */
public class GUI {

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalcFrame frame = new CalcFrame();
                frame.setTitle("Kalkulator");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}

