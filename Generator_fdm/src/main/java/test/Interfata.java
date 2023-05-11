package test;

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

public class Interfata {
	
	
	

	private JFrame frame;

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
		frame.setBounds(400,400, 631, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_49646790304500");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Completare date 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(45, 42, 346, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(45, 114, 306, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(45, 193, 346, 21);
		panel.add(btnNewButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(69, 291, 5, 22);
		panel.add(textArea);
		
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Facultatea: ");
		        String var0 = scanner.nextLine();
		        System.out.print("Departament: ");
		        String var1 = scanner.nextLine();
		        scanner.close();
		        
		        Document document = new Document();
		        document.loadFromFile("D:\\an3\\ProiectPIP\\fisa11.docx");
		        document.setReplaceFirst(true);
		        document.replace("_____________________", var0, false, true);
		        document.replace("___________________", var1, false, true);
		        document.saveToFile("Find&Replace2.docx");

		        
		        
				
				
					
					}
				});
	}
	}

