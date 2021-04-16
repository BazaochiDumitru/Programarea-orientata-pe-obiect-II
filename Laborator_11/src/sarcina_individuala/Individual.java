package sarcina_individuala;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Individual extends JFrame implements ActionListener{
	String sir;
	JLabel B1;
	JTextField A1;
	int nr1 = 0,nr2 = 0, nr3 = 0;
	public Individual (String titlu){
		super(titlu);
		setSize(400,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container x = getContentPane();
		x.setLayout(new FlowLayout());
		B1=new JLabel("List of numbers");
		x.add(B1);
		A1=new JTextField(30);
		x.add(A1);
		JButton A=new JButton("Result");
		x.add(A);
		A.addActionListener(this);
		setVisible(true);
		setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s = new String(A1.getText());
		StringTokenizer st = new StringTokenizer(s);
		String sr = new String();
		boolean logic;
		Set<Integer> sti = new HashSet();
		int k = 0;
		while(st.hasMoreTokens()){
			try {
				k += Integer.parseInt(st.nextToken());
				k += nr2;
			} catch (NumberFormatException e2) {}
			try{
				nr3 = Integer.parseInt(st.nextToken());
				logic = sti.add(nr3);
				if (logic)
					sr += nr3+" ";
			}
			catch(NumberFormatException e) {}
		}
		JOptionPane.showMessageDialog(this, "Sum of numbers is: " + k + "\nTotal numbers: " + sti.size());
		
//		int er = 0;
//		try {
//			nr1 = Integer.parseInt(sir); 
//		} catch (NumberFormatException e2) {
//			er=1;
//			JOptionPane.showMessageDialog(this, "ERROR, Please enter some numbers!");
//		}
//		if(er == 0) JOptionPane.showMessageDialog(this, "Sum of numbers is: "+ k);
//		String s = new String(A1.getText());
//		StringTokenizer st = new StringTokenizer(s);
//		int k = 0;
//		String sr = new String();
//		boolean logic;
//		Set<Integer> sti = new HashSet();
//		while(st.hasMoreTokens()){
//			try {
//				k+=Integer.parseInt(st.nextToken());
//				k+=nr2;
//			} catch (NumberFormatException e2) {}
//			try{
//				nr2=Integer.parseInt(st.nextToken());
//				logic=sti.add(nr2);
////				if (logic)
////					sr+=nr2+" ";
//			}
//			catch(NumberFormatException e2) {}
//		}
//		JOptionPane.showMessageDialog(this, "Sum of numbers is: "+ k + " " + "\nTotal numbers: " + sti.size());
		
		
	}

}
