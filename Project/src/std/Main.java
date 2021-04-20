package std;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.NonReadableChannelException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Main {

	public static void main(String[] args) {
		// creaza JFrame si JTable
        JFrame frame = new JFrame();
        JTable table = new JTable();
        
        // creaza un model de tabel si seteaza un identificator de coloana la acest model
        Object[] columns = {"ID","First Name","Last Name","Curs", "Nr.Credite"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        // Schimba JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);
        
        // creaza JTextFields
        JTextField textId = new JTextField();
        JTextField textFname = new JTextField();
        JTextField textLname = new JTextField();
        JTextField textCurs = new JTextField();
        JTextField textCredits = new JTextField();
        
        // creaza JLabel
        JLabel labelID = new JLabel("ID: ");
        JLabel labelName = new JLabel("Name: ");
        JLabel labelLName = new JLabel("Last Name: ");
        JLabel labelCurs = new JLabel("Curs: ");
        JLabel labelCredits = new JLabel("Nr.Credite: ");
        
        // creaza JButtons
        JButton btnImport = new JButton("Import Data");
        JButton btnAdd = new JButton("Add new Data");
        JButton btnDelete = new JButton("Delete Data");
        JButton btnUpdate = new JButton("Update Data");
        JButton btnExport = new JButton("Export Data");
        
        labelID.setBounds(20, 220, 100, 25);
        labelName.setBounds(20, 250, 100, 25);
        labelLName.setBounds(20, 280, 100, 25);
        labelCurs.setBounds(20, 310, 100, 25);
        labelCredits.setBounds(20, 340, 100, 25);
        
        textId.setBounds(120, 220, 100, 25);
        textFname.setBounds(120, 250, 100, 25);
        textLname.setBounds(120, 280, 100, 25);
        textCurs.setBounds(120, 310, 100, 25);
        textCredits.setBounds(120, 340, 100, 25);
        
        btnImport.setBounds(250, 220, 120, 25);
        btnAdd.setBounds(250, 255, 120, 25);
        btnUpdate.setBounds(250, 290, 120, 25);
        btnDelete.setBounds(250, 325, 120, 25);
        btnExport.setBounds(380, 220, 120, 25);
        
        // creaza JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        frame.add(labelID);
        frame.add(labelName);
        frame.add(labelLName);
        frame.add(labelCurs);
        frame.add(labelCredits);
        
        frame.add(textId);
        frame.add(textFname);
        frame.add(textLname);
        frame.add(textCurs);
        frame.add(textCredits);
        
        frame.add(btnImport);
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnExport);
        
        // creaza o matrice de obiecte pentru a seta datele randului
        Object[] row = new Object[5];
        
     // button Importare, impotez datele dintr-un txt file
        btnImport.addActionListener(new ActionListener(){
        	
        	String filePath = "C:\\Users\\user\\Desktop\\data.txt";
            File file = new File(filePath);
        	
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    // primeste pimul rand
                    // primeste numele coloanelor din prima linie
                    // seteaza numele coloanelor in jtable
//                    String firstLine = br.readLine().trim();
//                    String[] columnsName = firstLine.split(",");
//                    DefaultTableModel model = (DefaultTableModel)table.getModel();
//                    model.setColumnIdentifiers(columnsName);
                    
                    // primeste liniile din txt file
                    Object[] tableLines = br.lines().toArray();
                    
                    // extratct informatia din linii
                    // seteaza informatia in jtable model
                    for(int i = 0; i < tableLines.length; i++)
                    {
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split("/");
                        model.addRow(dataRow);
                    }
                    
                    
                } catch (Exception ex) {
                    //Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        // button Export, export datele din tabel in alt txt file
        btnExport.addActionListener(new ActionListener(){
        	
        	String filePath = "C:\\Users\\user\\Desktop\\data2.txt";
            File file = new File(filePath);
        	
            @Override
            public void actionPerformed(ActionEvent ae) {
            	try{
            		FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    TableModel model = table.getModel();
                    
                    for(int i = 0; i < model.getRowCount(); i++){//rows
                        for(int j = 0; j < model.getColumnCount(); j++){//columns
                            bw.write(model.getValueAt(i, j).toString()+"/");
                        }
                        bw.newLine();
                    }
                    
                    bw.close();
                    fw.close();

                }catch(IOException ex){  }
                
            }
        });
        
        // button adaugare rand
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = textId.getText();
                row[1] = textFname.getText();
                row[2] = textLname.getText();
                row[3] = textCurs.getText();
                row[4] = textCredits.getText();
                
                // adauga randul la model
                model.addRow(row);
            }
        });
        
        // button stergere rand
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = index randul selectat
                int i = table.getSelectedRow();
                if(i >= 0){
                    // sterge un rand din jtable
                    model.removeRow(i);
                }
                else{
                    JOptionPane.showMessageDialog(pane, "Delete Error. Please enter some information");
                }
            }
        });
        
        // obtine datele randului selectat de la tabel la campurile de text
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = index randul selectat
            int i = table.getSelectedRow();
            
            textId.setText(model.getValueAt(i, 0).toString());
            textFname.setText(model.getValueAt(i, 1).toString());
            textLname.setText(model.getValueAt(i, 2).toString());
            textCurs.setText(model.getValueAt(i, 3).toString());
            textCredits.setText(model.getValueAt(i, 4).toString());
        }
        });
        
     // button update 
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = index randul selectat
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textId.getText(), i, 0);
                   model.setValueAt(textFname.getText(), i, 1);
                   model.setValueAt(textLname.getText(), i, 2);
                   model.setValueAt(textCurs.getText(), i, 3);
                   model.setValueAt(textCredits.getText(), i, 4);
                }
                else{
                	JOptionPane.showMessageDialog(pane, "Update Error. Please enter some information");
                }
            }
        });
        
        frame.setSize(900,450);
        frame.setTitle("Student Information");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}
