/**
 * Created by Aidan O' B on 26/11/2015.
 */
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

public class essay extends JPanel
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Essays");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new essay());
        frame.pack();
        frame.setVisible(true);
    }
    public essay()
    {
        setPreferredSize(new Dimension(700,500));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Essay"));

        setLayout(new MigLayout("","[]10[] ","[] [] [] []"));

        //create components
        JLabel quesTitle = new JLabel("Question title:");
        JLabel question = new JLabel("Question:");
        JLabel giftOut = new JLabel("Gift Output:");
        JTextArea quesTitleText = new JTextArea(2,50);
        JTextArea quesText = new JTextArea(5,20);
        JTextArea giftOutText = new JTextArea(5,20);
        JButton clearQuesText = new JButton("Clear Question Text");
        JButton createGiftCode = new JButton("Create Gift Code");
        JButton clearOutList = new JButton("Clear Output List");

        //add components to panel
        add(quesTitle, "left, sg 1,split 2");
        add(quesTitleText, "pushx,growx,wrap");
        add(question, "top, sg 1,split 2");
        add(quesText, "pushx,growx,pushy,growy,wrap");
        add(clearQuesText, "right,sg 2,wrap ");
        add(createGiftCode, "right,sg 2,wrap ");
        add(giftOut, "top,sg 1,split 2");
        add(giftOutText, "pushx,growx,growy,pushy,wrap");
        add(clearOutList, "right,sg 2, wrap ");

        clearQuesText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                quesText.setText("");
                quesTitleText.setText("");

            }
        });
        createGiftCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = quesTitleText.getText();
                String question = quesText.getText();
                String gift = "::"+title+"::"+question+"{}\n";
                giftOutText.append(gift);
            }
        });

        clearOutList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                giftOutText.setText("");

            }
        });
    }
}
