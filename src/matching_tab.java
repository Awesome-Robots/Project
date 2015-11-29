import net.miginfocom.swing.MigLayout;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class matching_tab  extends JPanel
{
    String output;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Matching");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new matching_tab());
        frame.pack();
        frame.setVisible(true);
    }

    public matching_tab()
    {
        setPreferredSize(new Dimension(700,500));
        setBorder(BorderFactory.createTitledBorder("Matching"));
        setLayout(new MigLayout());
        
        JTextArea QuestionTextArea = new JTextArea(2,20);
        JTextArea Q1 = new JTextArea();
        JTextArea Q2 = new JTextArea();
        JTextArea Q3 = new JTextArea();
        JTextArea Q4 = new JTextArea();
        JTextArea Ans1 = new JTextArea();
        JTextArea Ans2 = new JTextArea();       
        JTextArea Ans3 = new JTextArea();       
        JTextArea Ans4 = new JTextArea();
        JTextArea OutputText = new JTextArea(); 
        
        JLabel QuestionTitleLab = new JLabel("Queston title:");
        JLabel GiftOutput = new JLabel("Gift Output:"); 
        JLabel Question = new JLabel("Question");
        JLabel Answer = new JLabel("Answer");
        JLabel Lab1 = new JLabel(" ");
        JLabel Lab2 = new JLabel(" "); 
        JLabel Lab3 = new JLabel(" ");
        JLabel btn = new JLabel(" "); 
        JLabel btn2 = new JLabel(" ");
        JLabel btn3 = new JLabel(" ");
        JLabel btn4 = new JLabel(" ");
        
        JButton Remove = new JButton("Remove"); 
        JButton Add = new JButton("Add Q&A");
        JButton Clear = new JButton("Clear Question");
		JButton CreateCode = new JButton("Create Gift Code");
		JButton ClearGift = new JButton("Clear Gift List");
        
        JCheckBox Del1 = new JCheckBox("Delete");
        JCheckBox Del2 = new JCheckBox("Delete"); 
        JCheckBox Del3 = new JCheckBox("Delete");
        JCheckBox Del4 = new JCheckBox("Delete");
        
        JPanel Panel = new JPanel(); 
        JPanel Panel2 = new JPanel();  
        JPanel Panel3 = new JPanel();
        
     
        add(QuestionTitleLab,"right,sg 2,split 2,span");
        add(QuestionTextArea, "pushx,growx,wrap");
        add(Lab1,"right,sg 2,split 2,span");
        add(Panel,"pushx,growx,span");
        Panel.setPreferredSize(new Dimension(0,200));
        Panel.setBorder(BorderFactory.createTitledBorder(""));
        Panel.setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
        Panel.add(btn2);
        Panel.add(Question,"left");
        Panel.add(Answer,"left,span");
        Panel.add(Add,"left");
        Panel.add(Q1, "left,pushx,growx");
        Panel.add(Ans1, "left,sg 1,pushx,growx");
        Panel.add(Del1,"wrap");
        Panel.add(btn);
        Panel.add(Q2, "left,sg 1,pushx,growx");
        Panel.add(Ans2, "left,sg 1,pushx,growx");
        Panel.add(Del2,"wrap");
        Panel.add(btn3);
        Panel.add(Q3,"left,sg 1,pushx,growx");
        Panel.add(Ans3,"left,sg 1,pushx,growx");
        Panel.add(Del3,"wrap");
        Panel.add(btn4);
        Panel.add(Q4,"left,sg 1,pushx,growx");
        Panel.add(Ans4,"left,sg 1,pushx,growx");
        Panel.add(Del4,"wrap");

        Panel2.setLayout(new MigLayout("", "[]","[]"));
        Panel2.setBorder(BorderFactory.createTitledBorder("Remove Selected"));
        Panel3.setLayout(new MigLayout("","[] []"));
        add(Lab2,"left,sg 2,split 2");
        add(Panel2,"left,sg 1");
        add(Panel3,"right,sg 1,span");
        Q1.setVisible(true);
        Del1.setVisible(true);
        Q2.setVisible(false);
        Ans2.setVisible(false);
        Del2.setVisible(false);
        Q3.setVisible(false);
        Ans3.setVisible(false);
        Del3.setVisible(false);
        Q4.setVisible(false);
        Ans4.setVisible(false);  
        Del4.setVisible(false);

        Panel2.add(Remove,"left,sg 1");
        Panel3.add(Clear,"right,sg 1,wrap");
        Panel3.add(CreateCode,"right,sg 1,wrap");
        add(GiftOutput,"right,sg 2,split 2,span");
        add(OutputText, "push,grow,wrap");
        add(Lab3,"right,sg 2,split 2,span");
        add(ClearGift,"right,sg 2,wrap");

        Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Del1.isSelected())
                {
                    Ans1.setVisible(false);
                    Q1.setVisible(false);
                    Del1.setVisible(false);
                    Del1.setSelected(false);
                }

                else if(Del2.isSelected())
                {
                    Ans2.setVisible(false);
                    Q2.setVisible(false);
                    Del2.setVisible(false);
                    Del2.setSelected(false);
                }
                else if(Del3.isSelected())
                {
                    Q3.setVisible(false);
                    Ans3.setVisible(false);
                    Del3.setVisible(false);
                    Del3.setSelected(false);
                }
                else if(Del4.isSelected())
                {
                    Q4.setVisible(false);
                    Ans4.setVisible(false);
                    Del4.setVisible(false);
                    Del4.setSelected(false);
                }
            }
        });
        Add.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Q1.isVisible() == false)
                {
                    Ans1.setVisible(true);
                    Q1.setVisible(true);
                    Del1.setVisible(true);
                }
                else if(Q2.isVisible() == false)
                {
                    Ans2.setVisible(true);
                    Q2.setVisible(true);
                    Del2.setVisible(true);
                }
                else if(Q3.isVisible() == false)
                {
                    Q3.setVisible(true);
                    Ans3.setVisible(true);
                    Del3.setVisible(true);
                }
                else if(Q4.isVisible() == false)
                {
                    Q4.setVisible(true);
                    Ans4.setVisible(true);
                    Del4.setVisible(true);

                }
            }
        });

       
        CreateCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
            	String answer1 = "",answer2 = "",answer3 = "",answer4 = "",
            			answer5 = "",answer6 = "",answer7 = "",answer8 = "";  
                if(Q1.isVisible())
                {
                    answer1="="+Q1.getText().toString();
                    answer2="->"+Ans1.getText().toString();
                }
                if(Q2.isVisible())
                {
                    answer3="="+Q2.getText().toString();
                    answer4="->"+Ans2.getText().toString();
                }
                if(Q3.isVisible())
                {
                    answer5="="+Q3.getText().toString();
                    answer6="->"+Ans3.getText().toString();
                }
                if(Q4.isVisible()) 
                {
                    answer7="="+Q4.getText().toString();
                    answer8="->"+Ans4.getText().toString();
                }
                output = "::"+QuestionTextArea.getText().toString()
                        +"::{ "+"\n"+answer1+answer2+"\n"
                		+answer3+answer4+"\n"+answer5+answer6+"\n"
                        +answer7+answer8+"}";
                OutputText.append(output);

                QuestionTextArea.setText("");
                Q1.setText("");
                Ans1.setText("");
                Q2.setText("");
                Ans2.setText("");
                Q3.setText("");
                Ans3.setText("");
                Q4.setText("");
                Ans4.setText("");
            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QuestionTextArea.setText("");
                Q1.setText("");
                Ans1.setText("");
                Q2.setText("");
                Ans2.setText("");
                Q3.setText("");
                Ans3.setText("");
                Q4.setText("");
                Ans4.setText("");
                Q2.setVisible(false);
                Ans2.setVisible(false);
                Del2.setVisible(false);
                Q3.setVisible(false);
                Ans3.setVisible(false);
                Del3.setVisible(false);
                Q4.setVisible(false);
                Ans4.setVisible(false);
                Del4.setVisible(false);
                Del1.setSelected(false);
                Del2.setSelected(false);
                Del3.setSelected(false);
                Del4.setSelected(false);
            }
        });
        ClearGift.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OutputText.setText("");
            }
        });

    }
}