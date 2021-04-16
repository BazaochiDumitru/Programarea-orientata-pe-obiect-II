package exB_individual;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JFrame implements ActionListener{
	JLabel B1,B2, B3;
	JTextField A1,A2;
	double nr1=0,nr2=0;
	private JComboBox<String> operation;
	public Calc (String titlu){
		super(titlu);
		setSize(300,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container x=getContentPane();
		x.setLayout(new FlowLayout());
		B1=new JLabel("Introduce A number");
		x.add(B1);
		A1=new JTextField(25);
		x.add(A1);
		B3 = new JLabel("Select operation");
		x.add(B3);
		JComboBox<String> operation;
		operation = new JComboBox<String>();
		operation.addItem("+");
		operation.addItem("-");
		operation.addItem("*");
		operation.addItem("/");
		operation.setSelectedIndex(0);
        x.add(operation);
		B2=new JLabel("Introduce B number");
		x.add(B2);
		A2=new JTextField(25);
		x.add(A2);
		JButton A=new JButton("Result");
		x.add(A);
		A.addActionListener(this);
		setVisible(true);
		setResizable(false);
}
	
	public void actionPerformed (ActionEvent ae){
		try{
			nr1=Double.parseDouble(A1.getText());
		}
		catch (NumberFormatException ex)
		{
			JOptionPane.showMessageDialog(this, "You entered the wrong number A!");
		}

		try{
			nr2=Double.parseDouble(A2.getText());
		}
		catch (NumberFormatException ex)
		{
			JOptionPane.showMessageDialog(this, "You entered the wrong number B!");
		}
		double result = 0;
		operation = null;
		char operand = (operation.getSelectedItem().toString().charAt(0));
		switch (operand) {
		case '+':
			result = nr1 + nr2;
			break;
		case '-':
			result = nr1 - nr2;
			break;
		case '*':
			result = nr1 * nr2;
			break;
		case '/':
			result = nr1 / nr2;
			break;
		}
		JOptionPane.showMessageDialog(this,"Divide of number is: "+ result);
	}
}