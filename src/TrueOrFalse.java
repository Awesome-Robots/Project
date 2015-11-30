
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TrueOrFalse  extends JPanel
{
	String output;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("True/False");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrueOrFalse());
		frame.pack();
		frame.setVisible(true);
	}

	public TrueOrFalse()
	{
		setPreferredSize(new Dimension(700,500));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder("True/False"));
		setLayout(new MigLayout());

		//panel component creation
		JTextArea QuestionTextArea = new JTextArea(2,20);
		JTextArea QText = new JTextArea(8,20);
		JTextArea OutputText = new JTextArea();
		JLabel lab1 = new JLabel(" ");
		JLabel lab2 = new JLabel(" ");
		//radio buttons
		JRadioButton trueBtn = new JRadioButton("True");
		JRadioButton falseBtn = new JRadioButton("False");
		JButton Clear = new JButton("Clear Question");
		JButton CreateCode = new JButton("Create Gift Code");
		JButton ClearGift = new JButton("Clear Output List");

		JLabel QuestionTitleLab = new JLabel("Queston title:");
		JLabel Lab = new JLabel("Question");
		JLabel GiftOutput = new JLabel("Gift Output:");
		JPanel Panel = new JPanel();
		JPanel Panel2 = new JPanel();


		add(QuestionTitleLab,"right,sg 2,split 2,span");
		add(QuestionTextArea, "pushx,growx,wrap");
		add(Lab,"right,sg 2,split 2,span");
		add(QText,"pushx,growx,wrap");

		Panel.setLayout(new MigLayout());
		Panel.setBorder(BorderFactory.createTitledBorder("Select"));
		Panel.add(trueBtn,"left,sg 1,split 2");
		Panel.add(falseBtn,"left,sg 1,wrap");
		Panel2.setLayout(new MigLayout());
		Panel2.add(Clear,"right,sg 1,wrap");
		Panel2.add(CreateCode,"right,sg 1,span");
		
		add(lab1,"left,sg 2,split 2");
		add(Panel,"left,sg 1");
		add(Panel2,"right,sg 1,span");
		add(GiftOutput,"right,sg 2,split 2,span");
		add(OutputText, "pushx,growx,pushy,growy,wrap");
		add(lab2,"right,sg 2,split 2,span");
		add(ClearGift,"right,wrap");


		
		CreateCode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ans = "";
				if(trueBtn.isSelected())
				{
					ans="T";
				}
				if(falseBtn.isSelected()) 
				{
					ans="F";
				}
				output = "::"+QuestionTextArea.getText().toString()
						+":: "+QText.getText().toString()+" ("+ans+")";
				OutputText.setText(output);

				QuestionTextArea.setText("");
				QText.setText("");
				trueBtn.setSelected(false);
				falseBtn.setSelected(false);
			}
		});
		Clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				QuestionTextArea.setText("");
				QText.setText("");
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