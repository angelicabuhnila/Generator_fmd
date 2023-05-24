package generator;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.util.Scanner;
import com.spire.doc.Document;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;

public class Interfata {
	
	
	

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfata window = new Interfata();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfata() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400,400, 443, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_49646790304500");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce\u0163i datele fi\u015Fei");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(119, 36, 180, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nume Profesor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(38, 104, 100, 13);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(135, 102, 202, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Func\u0163ia");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(38, 134, 45, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Profesor2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(38, 164, 72, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(38, 199, 45, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Numar Studenti");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(38, 228, 100, 13);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Materie");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(38, 262, 45, 13);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sala");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(38, 293, 45, 13);
		panel.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 131, 202, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 164, 202, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(135, 196, 202, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(135, 225, 202, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(135, 260, 202, 19);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(135, 291, 202, 19);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Grupa");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(38, 327, 45, 13);
		panel.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(135, 325, 202, 19);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btn = new JButton("Generare");
		btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn.setBounds(135, 404, 115, 21);
		panel.add(btn);
		
		//Partea de care avem nevoie pt completaare word
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String nume=textField.getText();
				 String functia=textField_1.getText();
				 String profesor_asistat=textField_2.getText();
				 String data=textField_3.getText();
				 String nr_studenti=textField_4.getText();
				 String materie=textField_5.getText();
				 String sala=textField_6.getText();
				 String grupa=textField_7.getText();
				 
				 
				 //Create a Document class instance
				Document document = new Document();

				 //Load a Word document
				 
				 document.loadFromFile("D:\\an3\\ProiectPIP\\fisa.docx");
				 
				  
		  //Replace all the matches of text “deer” in the document with new text “buffalo”
				 
				 document.replace("#nume",nume, false, true);
				 document.replace("#functia",functia, false, true);
				 document.replace("#asistat",profesor_asistat, false, true);
				 document.replace("#data",data, false, true);
				 document.replace("#nr",nr_studenti, false, true);
				 document.replace("#materie",materie, false, true);
				 document.replace("#sala",sala, false, true);
				 document.replace("#grupa",grupa, false, true);
				  //Save the result document
				 
			 document.saveToFile("FisaGenerata.docx");

				
				
			}
		});
	
		
		
	}
	}

