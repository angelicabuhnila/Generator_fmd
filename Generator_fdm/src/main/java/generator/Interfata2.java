package generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.spire.ms.System.Collections.ArrayList;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class Interfata2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String[] array = new String[15];
	Vector<String> array_prof= new Vector<String>(); 
	Vector<String>array_sali=new Vector<String>();
     Vector<String>array_materii=new Vector<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfata2 frame = new Interfata2();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfata2()
	{
		this.array=initializare();
	}
	public Interfata2( Vector<String> array_prof,Vector<String> array_sali,Vector<String> array_materii) {
		this.array_prof=array_prof;
		this.array_sali=array_sali;
		this.array_materii=array_materii;
		this.array = initializare();
		
	};

	private String[] initializare() {
		final String[] array = new String[15];
		class ActionBtn2 implements ActionListener {

			ActionBtn2() {
			};

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (e.getActionCommand() == "Back") {
					array[0] = "Interfata1";
				}
			}

		}

		ActionBtn2 a = new ActionBtn2();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Profesor 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 29, 75, 31);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Profesor 2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 99, 86, 24);
		contentPane.add(lblNewLabel_2);

		Button button = new Button("Finish");
		button.setBounds(528, 434, 66, 21);
		contentPane.add(button);

		Button button_1 = new Button("Back");
		button_1.setBounds(447, 434, 66, 21);
		contentPane.add(button_1);
		button_1.addActionListener(a);

		JLabel lblNewLabel_3 = new JLabel("Data");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 224, 45, 21);
		contentPane.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(131, 227, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Materia");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 168, 75, 24);
		contentPane.add(lblNewLabel_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("1301A");
		rdbtnNewRadioButton.setBounds(10, 329, 103, 21);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("1301B");
		rdbtnNewRadioButton_1.setBounds(10, 350, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("1302A");
		rdbtnNewRadioButton_2.setBounds(143, 329, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("1302B");
		rdbtnNewRadioButton_3.setBounds(143, 350, 103, 21);
		contentPane.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("1303A");
		rdbtnNewRadioButton_4.setBounds(279, 329, 103, 21);
		contentPane.add(rdbtnNewRadioButton_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("1303B");
		rdbtnNewRadioButton_5.setBounds(279, 350, 103, 21);
		contentPane.add(rdbtnNewRadioButton_5);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("1304A");
		rdbtnNewRadioButton_6.setBounds(419, 329, 103, 21);
		contentPane.add(rdbtnNewRadioButton_6);

		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("1304B");
		rdbtnNewRadioButton_7.setBounds(419, 350, 103, 21);
		contentPane.add(rdbtnNewRadioButton_7);

		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("1305A");
		rdbtnNewRadioButton_8.setBounds(528, 329, 76, 21);
		contentPane.add(rdbtnNewRadioButton_8);

		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("1305B");
		rdbtnNewRadioButton_9.setBounds(528, 350, 76, 21);
		contentPane.add(rdbtnNewRadioButton_9);

		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("SELECT ALL");
		rdbtnNewRadioButton_10.setBounds(260, 384, 103, 21);
		contentPane.add(rdbtnNewRadioButton_10);

		JLabel lblNewLabel_4 = new JLabel("Sala");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 286, 45, 13);
		contentPane.add(lblNewLabel_4);
		
	
		

   
		JComboBox comboBox = new JComboBox<String>(this.array_prof);
		comboBox.setBounds(130, 36, 252, 21);
		contentPane.add(comboBox);
		
	


		
		JComboBox comboBox_1 = new JComboBox<String>(this.array_prof);
		comboBox_1.setBounds(130, 103, 252, 21);
		contentPane.add(comboBox_1);
		
		
		
		JComboBox comboBox_2 = new JComboBox<String>(this.array_materii);
		comboBox_2.setBounds(130, 172, 252, 21);
		contentPane.add(comboBox_2);
	
		JComboBox comboBox_3 = new JComboBox<String>(this.array_sali);
		comboBox_3.setBounds(130, 284, 252, 21);
		contentPane.add(comboBox_3);
		return array;
		
	}

	
	
}
