package jframe_ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example extends JFrame implements ActionListener{
    JLabel label, label1, name, date, varsta, mail, phone, school, faculty, year,
            pozition, knowledge, comments;
    JTextField input, input1, input2, input3, input5, input6, input7, input8;
    JComboBox<String> tip, tip1, procent, mouth;
    JTextArea text;

    public Example(){
        super("Forma de trimitere a datelor");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(15, 2));
        label = new JLabel("Forma de trimitere a datelor pentru aplicare la un JOB", JLabel.CENTER);
        container.add(label);
        label1 = new JLabel("");
        container.add(label1);
        name = new JLabel("     " + "* Nume Prenume");
        container.add(name);
        input = new JTextField();
        container.add(input);
        date = new JLabel("     " + "* Data nasterii");
        container.add(date);
        input1 = new JTextField("");
        container.add(input1);
        varsta = new JLabel("     " + "* Varsta la momentul actual");
        container.add(varsta);
        input7 = new JTextField("");
        container.add(input7);
        mail = new JLabel("     " + "* Adresa de e-mail");
        container.add(mail);
        input2 = new JTextField("");
        container.add(input2);
        phone = new JLabel("     " + "* Telefon");
        container.add(phone);
        input3 = new JTextField("");
        container.add(input3);
        school = new JLabel("     " + "* Institutia de invatamant");
        container.add(school);
        tip = new JComboBox<String>();
        tip.addItem("Universitatea de stat Alecu Russo din municipiul Balti");
        tip.addItem("Universitatea de stat a Moldovei");
        tip.addItem("Universitatea tehnica a Moldovei");
        tip.addItem("Academia de Stiinte Economice din Republica Moldova");
        tip.setSelectedIndex(0);
        container.add(tip);
        faculty = new JLabel("     " + "  Facultatea sau Specialitatea");
        container.add(faculty);
        tip1 = new JComboBox<String>();
        tip1.addItem("SREM, Informatica(programatori)");
        tip1.addItem("Limba si literatura romana si limba engleza");
        tip1.addItem("Administratie publica si drept judiciar");
        tip1.addItem("Bussiness si administrare");
        tip1.setSelectedIndex(0);
        container.add(tip1);
        year = new JLabel("     " + "  Anul de studii (in cazul daca sunteti student)");
        container.add(year);
        input5 = new JTextField("");
        container.add(input5);
        pozition = new JLabel("     " + "* Pozitia pentru care aplicati");
        container.add(pozition);
        input6 = new JTextField("");
        container.add(input6);
        knowledge = new JLabel("     " + "  Cunostinte in domeniu");
        container.add(knowledge);
        input8 = new JTextField("");
        container.add(input8);
        comments = new JLabel("     " + "  Comentarii");
        container.add(comments);
        text = new JTextArea();
        container.add(text);


        ButtonGroup group = new ButtonGroup();
        JCheckBox checkBox = new JCheckBox("Sunt de acord cu politica de confidentialitate", false);
        container.add(checkBox);
        JButton B = new JButton("TRANSMITE DATELE");
        container.add(B);
        B.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "Date transmise cu succes.\n";
        message += "Curand veti fi telefonat :)\n";
        message += "\n";
        message += "Nume Prenume: " + input.getText() + "\n";
        message += "Data nasterii: " + input1.getText() + "\n";
        message += "Varsta la moment: " + input7.getText() + "\n";
        message += "Adresa de e-mail: " + input2.getText() + "\n";
        message += "Telefon: " + input3.getText() + "\n";
        message += "Institutia de invatamant: " + tip.getSelectedItem().toString() +  "\n";
        message += "Facultatea sau Specialitatea: "  + tip1.getSelectedItem().toString() + "\n";
        message += "An de studiu: " + input5.getText() + "\n";
        message += "Pozitia: " + input6.getText() + "\n";
        message += "Cunostinte: " + input8.getText() + "\n";
        message += "Comentarii: " + text.getText() + "\n";


        JOptionPane.showMessageDialog(null, message, "Date trimise", JOptionPane.PLAIN_MESSAGE);
    }
}
