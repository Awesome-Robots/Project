
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends JPanel {

    private static String essay = "essay";
    private static String truefalse = "True/False";
    private static String matching = "Matching";
    private static String fillblanks = "Fill Blanks";


    private JMenuBar Menu; 
    public static void main (String[] args) {
        
        JFrame frame = new JFrame ("MyPanel");
        frame.setLayout(new MigLayout("", "[] "));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Gui(), "push,grow ");
        frame.pack();
        frame.setVisible (true);
    }

    public Gui() {
    	
        JTabbedPane tab = new JTabbedPane();
        setLayout(new MigLayout());

        
        JMenu fileMenu = new JMenu ("File");
        JMenuItem q1 = new JMenuItem (essay);
        JMenuItem q2 = new JMenuItem (truefalse);
        JMenuItem q3 = new JMenuItem (matching);
        JMenuItem q4 = new JMenuItem (fillblanks);
        
       q1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               tab.setSelectedIndex(0);
           }
       });
        q2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tab.setSelectedIndex(1);
            }
        });
        
        q3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tab.setSelectedIndex(2);
            }
        });
        
        q4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tab.setSelectedIndex(3);
            }
        });

        fileMenu.add (q1);
        fileMenu.add (q2);
        fileMenu.add (q3);
        fileMenu.add (q4);
      
        tab.addTab(essay, new essay());
        tab.addTab(matching, new matching_tab());
        tab.addTab(truefalse, new TrueOrFalse());
        tab.addTab(fillblanks, new FillBlanks());
        Menu = new JMenuBar();
        Menu.add(fileMenu);
        add(Menu," growx,wrap,top");
        add(tab,"grow,push");
    }


    
}