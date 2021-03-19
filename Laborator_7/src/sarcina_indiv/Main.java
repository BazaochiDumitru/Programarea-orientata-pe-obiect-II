package sarcina_indiv;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Suma");
        JTextField label1 =  new JTextField(16);
        JTextField label2 = new JTextField(16);
        JTextField label3 = new JTextField(16);
        JButton b = new JButton("Calculeaza");

        label1.setBounds(10, 0, 200, 40);
        label2.setBounds(10, 50, 200, 40);
        label3.setBounds(10, 100, 200, 40);
        b.setBounds(10, 150, 200, 40);

        f.add(b);
        f.add(label1);
        f.add(label2);
        f.add(label3);

        b.addActionListener(ae -> {
            int first = Integer.parseInt(label1.getText());
            int second = Integer.parseInt(label2.getText());
           label3.setText(first + second + "");
        });

        f.setSize(235, 240);
        f.setLayout(null);
        f.setVisible(true);
	}

}
