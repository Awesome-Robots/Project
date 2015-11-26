
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

    private static String essay = "Essay";
    private static String truefalse = "True/False";
    private static String mcb = "Multple Choice Basic";
    private static String mca = "Multple Choice Advance";
    private static String numerical = "Numerical";
    private static String matching = "Matching";
    private static String fillblanks = "Fill Blanks";


    private JMenuBar jcomp1;

    public Gui() {
        //construct components
        JTabbedPane tabs = new JTabbedPane();
        //Setting layout to Mig Layout
        setLayout(new MigLayout("", "[]","[] []"));

        //construct preComponents of File menu
        JMenu fileMenu = new JMenu ("File");
        JMenuItem q1 = new JMenuItem (essay);
        JMenuItem q2 = new JMenuItem (truefalse);
        JMenuItem q3 = new JMenuItem (mcb);
        JMenuItem q4 = new JMenuItem (mca);
        JMenuItem q5 = new JMenuItem (numerical);
        JMenuItem q6 = new JMenuItem (matching);
        JMenuItem q7 = new JMenuItem (fillblanks);

        //Action listiner for each menu bar
       q1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               tabs.setSelectedIndex(0);
           }
       });
        q2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabs.setSelectedIndex(1);
            }
        });
        q3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabs.setSelectedIndex(2);
            }
        });
        q4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabs.setSelectedIndex(3);
            }
        });
        q5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabs.setSelectedIndex(4);
            }
        });
        q6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabs.setSelectedIndex(5);
            }
        });
        q7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabs.setSelectedIndex(6);
            }
        });



        //Adding components into File Menu
        fileMenu.add (q1);
        fileMenu.add (q2);
        fileMenu.add (q3);
        fileMenu.add(q4);
        fileMenu.add(q5);
        fileMenu.add(q6);
        fileMenu.add(q7);

        //tabs.addTab(essay, new fill_Blanks_Tab());
        //tabs.addTab(essay,new Essays());
        //tabs.addTab(truefalse, new true_false());
        tabs.addTab(mcb, new multiple_choice_basic());
    
        
        
       // tabs.addTab(fillblanks, new fill_Blanks_Tab());

        //construct components
        jcomp1 = new JMenuBar();
        jcomp1.add(fileMenu);
        //Adding components to panel
        add(jcomp1," growx,wrap,top");
        add(tabs,"grow,push");
    }


    public static void main (String[] args) {
      
        JFrame frame = new JFrame ("MyPanel");
        frame.setLayout(new MigLayout("", "[] "));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Gui(), "push,grow ");
        frame.pack();
        frame.setVisible (true);
    }
}