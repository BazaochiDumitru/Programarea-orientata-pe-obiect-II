package app1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fereastra extends JFrame implements ActionListener{
	String sir;
	JLabel B1;
	JTextField A1;
	int nr1=0,nr2=0;
	public Fereastra (String titlu){
		super(titlu);
		setSize(300,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container x=getContentPane();
		x.setLayout(new FlowLayout());
		B1=new JLabel("List of numbers");
		x.add(B1);
		A1=new JTextField(25);
		x.add(A1);
		JButton A=new JButton("Result");
		x.add(A);
		A.addActionListener(this);
		setVisible(true);
		setResizable(false);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = new String(A1.getText());
		StringTokenizer st = new StringTokenizer(s);
		int k = 0;
		while(st.hasMoreTokens()){
			try {
				k+=Integer.parseInt(st.nextToken());
				k+=nr2;
			} catch (NumberFormatException e2) {}
		}
		JOptionPane.showMessageDialog(this, "Sum of numbers is: "+k);

	}

}
