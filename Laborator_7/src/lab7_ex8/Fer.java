package lab7_ex8;

import java.awt.*;
import javax.swing.*;

public class Fer extends JFrame{
	public Fer(String titlu){
		super(titlu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit ec = Toolkit.getDefaultToolkit();
		Dimension dim=ec.getScreenSize();
		int i = dim.height; 
		int l=dim.width;
		setSize(dim.width, dim.height); 
		setVisible(true);
	}
}
