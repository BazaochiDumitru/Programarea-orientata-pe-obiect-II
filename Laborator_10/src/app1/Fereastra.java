package app1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Fereastra extends JFrame implements ActionListener,
FocusListener {
	String sir;
	JLabel B1,B2;
	JTextField A1,A2;
	int nr1=0,nr2=0;
	public Fereastra (String titlu){
		super(titlu);
		setSize(300,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container x=getContentPane();
		x.setLayout(new FlowLayout());
		B1=new JLabel("Introduce A number");
		x.add(B1);
		A1=new JTextField(25);
		x.add(A1);A1.addFocusListener(this);
		B2=new JLabel("Introduce B number");
		x.add(B2);
		A2=new JTextField(25);
		x.add(A2);A2.addFocusListener(this);
		JButton A=new JButton("Result");
		x.add(A);
		A.addActionListener(this);
		setVisible(true);
		setResizable(false);
	}
	public void focusGained(FocusEvent e) {}
	public void focusLost(FocusEvent e)
	{
		if (e.getSource()==A1) {
			try{
				nr1=Integer.parseInt(A1.getText());
			}
			catch (NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(this, "You entered the wrong number A!");
				A1.requestFocus();
			}
		}
		if (e.getSource()==A2)
		{
			try{
				nr2=Integer.parseInt(A2.getText());
			}
			catch (NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(this, "You entered the wrong number B!");
				A2.requestFocus();
			}
		}
	}
	
	public void actionPerformed (ActionEvent ae){
		nr2+=nr1;
		JOptionPane.showMessageDialog(this,"Sum of number is: "+nr2);
	}
}
