/**
 * Created by Aidan O' B on 28/11/2015.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class FillBlanks extends JPanel{

    int count = 0;
    String gift_code_output;
    String b1 = "";
    String b2 = "";
    String b3 = "";
    String b4 = "";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fill Blanks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new FillBlanks());
        frame.pack();
        frame.setVisible(true);

    }
    public FillBlanks()
    {

        setPreferredSize(new Dimension(700,500));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Fill Blanks"));
        setLayout(new MigLayout("", "[] [] [] ","[] [] [] [] [] [] [] [] []"));

        JLabel quesTitle = new JLabel("Question title:");
        JLabel quesStart = new JLabel("Question start:");
        JLabel blank = new JLabel("Blank(s):");
        JPanel blankPanel = new JPanel();
        JPanel blankPanel1 = new JPanel();
        JPanel blankPanel2 = new JPanel();
        JLabel quesEnd = new JLabel("Question End:");
        JLabel giftOut = new JLabel("       Gift Output:");
        JTextField quesTitleText = new JTextField(20);
        JTextArea quesStartText = new JTextArea(3,20);
        JTextField choice0 = new JTextField(20);
        JTextField choice1 = new JTextField(20);
        JTextField choice2 = new JTextField(20);
        JTextField choice3 = new JTextField(20);
        JRadioButton choice0Correct = new JRadioButton("Correct");
        JRadioButton choice1Correct = new JRadioButton("Correct");
        JRadioButton choice2Correct = new JRadioButton("Correct");
        JRadioButton choice3Correct = new JRadioButton("Correct");
        JButton removeBlank = new JButton("Remove Blank");
        JButton addBlank = new JButton("Add Blank");
        JButton clearQuesText = new JButton("Clear Question");
        JButton createGiftCode = new JButton("Create Gift Code");
        JButton clearGiftList = new JButton("Clear Gift List");
        JTextField quesEndText = new JTextField(20);
        //JTextField giftOutText = new JTextField(20);
        JTextArea giftOutText = new JTextArea(3,20);
        choice0.setVisible(true);
        choice0Correct.setVisible(true);

        add(quesTitle, "right");
        add(quesTitleText, "pushx,growx,span");
        add(quesStart, "right");
        add(quesStartText, "pushx,growx,span");
        add(blank, "right");
        add(blankPanel,"pushx,growx,wrap");
        blankPanel.setPreferredSize(new Dimension(0,100));
        blankPanel.setLayout(new MigLayout("", "[grow] [] ","[] [] [] []"));
        blankPanel.setBorder(BorderFactory.createTitledBorder("Choice"));


        blankPanel1.setLayout(new MigLayout("", "[]","[] [] [] []"));
        blankPanel.add(blankPanel1,"left,pushx,growx,spany");
        blankPanel.add(blankPanel2,"spany");
        blankPanel1.add(choice0, "left,pushx,growx,span");
        blankPanel1.add(choice1, "left,sg 1,pushx,growx,span");
        blankPanel1.add(choice2, "left,sg 1,pushx,growx,span");
        blankPanel1.add(choice3, "left,sg 1,pushx,growx,span");
        blankPanel2.setLayout(new MigLayout("", "[grow]","[] [] [] []"));
        blankPanel2.setBorder(BorderFactory.createTitledBorder("Select"));
        blankPanel2.add(choice0Correct,"span");
        blankPanel2.add(choice1Correct,"sg 1,span");
        blankPanel2.add(choice2Correct,"sg 1,span");
        blankPanel2.add(choice3Correct,"sg 1,span");

        choice1.setVisible(false);
        choice1Correct.setVisible(false);
        choice2.setVisible(false);
        choice2Correct.setVisible(false);
        choice3.setVisible(false);
        choice3Correct.setVisible(false);

        JLabel btn = new JLabel(" ");
        JLabel btn2 = new JLabel(" ");
        JLabel btn3 = new JLabel(" ");
        JLabel btn4 = new JLabel(" ");
        add(btn);
        add(removeBlank, "right,sg 1,split 2");
        add(addBlank,"span,wrap");
        add(quesEnd,"right");
        add(quesEndText, "pushx,growx,pushy,growy,span");
        add(btn2);
        add(clearQuesText,"right,sg 1,span");
        add(btn3);
        add(createGiftCode,"right,sg 1,span");
        add(giftOut, "top");
        add(giftOutText, "pushx,growx,pushy,growy,span");
        add(btn4);
        add(clearGiftList,"split 3, right");

        removeBlank.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(count == 0)
                {
                    choice1.setVisible(false);
                    choice1Correct.setVisible(false);
                    count--;
                    blankPanel.repaint();
                }
                else if(count == 1)
                {
                    choice2.setVisible(false);
                    choice2Correct.setVisible(false);
                    count--;
                    blankPanel.repaint();
                }
                else if(count == 2)
                {
                    choice3.setVisible(false);
                    choice3Correct.setVisible(false);
                    count--;
                    blankPanel.repaint();
                }
            }
        });
        addBlank.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(count == 0)
                {
                    choice1.setVisible(true);
                    choice1Correct.setVisible(true);
                    count++;
                    blankPanel.repaint();
                }
                else if(count == 1)
                {
                    choice2.setVisible(true);
                    choice2Correct.setVisible(true);
                    count++;
                    blankPanel.repaint();
                }
                else if(count == 2)
                {
                    choice3.setVisible(true);
                    choice3Correct.setVisible(true);
                    blankPanel.repaint();
                }
            }
        });

        clearQuesText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quesTitleText.setText("");
                quesStartText.setText("");
                choice0.setText("");
                choice1.setText("");
                choice2.setText("");
                choice3.setText("");
                choice0.setText("");
                choice1.setVisible(false);
                choice2.setVisible(false);
                choice3.setVisible(false);
                choice0Correct.setSelected(false);
                choice1Correct.setSelected(false);
                choice2Correct.setSelected(false);
                choice3Correct.setSelected(false);
                quesEndText.setText("");
            }
        });
        createGiftCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(choice0.isVisible()){
                    if(choice0Correct.isSelected())
                        b1="="+choice0.getText().toString();
                    else
                        b1="~"+choice0.getText().toString();
                }if(choice1.isVisible()){
                    if(choice1Correct.isSelected())
                        b2="="+choice1.getText().toString();
                    else
                        b2="~"+choice1.getText().toString();
                }if(choice2.isVisible()){
                    if(choice2Correct.isSelected())
                        b3="="+choice2.getText().toString();
                    else
                        b3="~"+choice2.getText().toString();
                }if(choice3.isVisible())
                {
                    if(choice3Correct.isSelected())
                        b4="="+choice3.getText().toString();
                    else
                        b4="~"+choice3.getText().toString();
                }
                gift_code_output = "::"+quesTitleText.getText().toString()
                        +"::"+quesStartText.getText().toString()
                        +" {"+b1+b2+b3+b4+" }"+quesEndText.getText().toString();
                giftOutText.setText(gift_code_output);

                quesTitleText.setText("");
                quesStartText.setText("");
                choice0.setText("");
                choice1.setText("");
                choice2.setText("");
                choice3.setText("");
                choice0Correct.setSelected(false);
                choice1Correct.setSelected(false);
                choice2Correct.setSelected(false);
                choice3Correct.setSelected(false);
                quesEndText.setText("");

            }
        });
        clearGiftList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                giftOutText.setText("");
            }
        });
    }
}
