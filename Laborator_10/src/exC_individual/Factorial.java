package exC_individual;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Factorial extends JFrame implements ActionListener{
	JLabel B1;
	JTextField A1;
	int nr1;
	public Factorial (String titlu){
		super(titlu);
		setSize(300,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container x=getContentPane();
		x.setLayout(new FlowLayout());
		B1=new JLabel("Introduce A number");
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
		int er = 0, factorial = 0;
		try{
			nr1=Integer.parseInt(A1.getText());
		}
		catch (NumberFormatException e)
		{
			er = 1;
			JOptionPane.showMessageDialog(this, "You entered the wrong number A!");
		}
		if(er == 0) {
			factorial = nr1;
			for (int i = nr1; i > 1; i--) {
				factorial = factorial * (i - 1);
			}
			JOptionPane.showMessageDialog(this,"Factorial number is: "+factorial);

		}
	}
}
