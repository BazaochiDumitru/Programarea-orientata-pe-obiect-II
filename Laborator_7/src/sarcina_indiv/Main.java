package sarcina_indiv;

import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		JFrame x = new JFrame("Calculator");
		JTextField n1 = new JTextField(); x.add(n1);
		JTextField n2 = new JTextField(); x.add(n2);
		JTextField result = new JTextField(); x.add(result);
		JComboBox<String> operation;
		operation = new JComboBox<String>();
		operation.addItem("+");
		operation.addItem("-");
		operation.addItem("*");
		operation.addItem("/");
		operation.setSelectedIndex(0);
        x.add(operation);
		JButton A = new JButton("Calculate"); x.add(A);

		n1.setBounds(10, 10, 100, 30);
		operation.setBounds(115, 10, 100, 30);
		n2.setBounds(220, 10, 100, 30);
		result.setBounds(330, 10, 210, 30);
		A.setBounds(150, 60, 210, 30);

		A.addActionListener(cl -> {
			double num1 = Double.parseDouble(n1.getText());
			double num2 = Double.parseDouble(n2.getText());
			char operand = (operation.getSelectedItem().toString().charAt(0));
			switch (operand) {
			case '+':
				result.setText(num1 + num2 + "");
				break;
			case '-':
				result.setText(num1 - num2 + "");
				break;
			case '*':
				result.setText(num1 * num2 + "");
				break;
			case '/':
				result.setText(num1 / num2 + "");
				break;
			}
		});

		x.setSize(600, 150);
		x.setLayout(null);
		x.setVisible(true);
	}
}
