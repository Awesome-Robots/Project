/**
 * Created by Aidan O' B on 28/11/2015.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class FillBlanks extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fill Blanks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new FillBlanks());
        frame.pack();
        frame.setVisible(true);


    }
}
