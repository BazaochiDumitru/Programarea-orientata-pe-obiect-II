package app2;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame implements ActionListener{
	String sir;
	JLabel B1;
	JTextField A1;
	int nr1=0,nr2=0;
	public Window (String titlu){
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
	public void actionPerformed(ActionEvent ae) {
		String s = new String(A1.getText());
		StringTokenizer st = new StringTokenizer(s);
		String sr = new String();
		boolean logic;
		Set<Integer> sti = new HashSet();
		while(st.hasMoreTokens()){
			try{
				nr2=Integer.parseInt(st.nextToken());
				logic=sti.add(nr2);
				if (logic)
					sr+=nr2+" ";
			}
			catch(NumberFormatException e) {}
		}
		JOptionPane.showMessageDialog(this, sti.size()+" numbers: "+sr);
	}

}