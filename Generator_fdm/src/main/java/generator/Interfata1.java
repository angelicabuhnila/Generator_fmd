package generator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

/**
 * Codul din aceasta clasa implementeaza GUI-ul pentru prima pagina a interfetei.
 * In TextField-urile corespunzatoare vor fi introduse path-urile corespunzatoare pentru Document, Sali de clasa, Profesori, Studenti.
 * tip: application window
 * @author Ana-Maria Pricop
 *
 */

/**
 * Variabile de instanta:
 * frame: obiectul JFrame care reprezinta fereastra principala a interfetei.
 * textField, textField_1, textField_2, textField_3: obiecte JTextField care reprezinta campurile de text pentru introducerea path-urilor corespunzatoare.
 * lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3: obiecte JLabel care reprezinta etichetele asociate campurilor de text.
 * btnNewButton: obiect JButton care reprezinta butonul "Start".
 */
public class Interfata1 {
	
	String[] array = new String[4];

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Metode:
	 * main(String[] args): metoda statica principala care initializeaza o instanta a clasei Interfata1 si afiseaza fereastra interfetei.
	 * Interfata1(): constructorul clasei care initializeaza componentele interfetei si seteaza aspectul ferestrei principale.
	 * initialize(): metoda privata care configureaza si plaseaza componentele in cadrul ferestrei principale.
	 */
	
	/**
	 * 
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfata1 window = new Interfata1();
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
	public Interfata1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Document");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 416, 13);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 416, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Profesori");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 62, 416, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 91, 416, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sali de curs");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 120, 416, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 149, 416, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Studenti");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 178, 416, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 201, 416, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(341, 230, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
