package generator;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Interfata2 extends JFrame {
private JPanel contentPane;
	private JTextField textField;
	String[] array = new String[15];
	Vector<String> grupe_selectate = new Vector<String>();

	Vector<String> array_prof = new Vector<String>();
	Vector<String> array_sali = new Vector<String>();
	Vector<String> array_materii = new Vector<String>();
	

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
	 * Create the frame. ??
	 */
	public Interfata2() {
		
	}

	/**
	 * folosesc acesti parametrii pentru creearea interfetei
	 * @param array_prof folosit pentru inserarea in interfata a datelor despre profesori
	 * @param array_sali folosit pentru inseararea in interfata a salilor 
	 * @param array_materii folosit pentru inserarea in interfata a materiilor 
	 *  */
	public Interfata2(Vector<String> array_prof, Vector<String> array_sali, Vector<String> array_materii) {
		this.array_prof = array_prof;
		this.array_sali = array_sali;
		this.array_materii = array_materii;
		this.array = initializare();

	};
	

	private String[] initializare() {
		final String[] array = new String[15];
		@SuppressWarnings("unused")
		final
		Interfata2 pag2 = new Interfata2();
		class ActionBtn2 implements ActionListener {

			/**
			 * clasa actiune butoane
			 */
			ActionBtn2() {
			};

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				switch (e.getActionCommand()) {
				case "Back":
					array[0] = "Interfata1";
					break;
				case "Profesor1":
					array[1] = setParametrii(e);
					break;
				case "Profesor2":
					array[2] = setParametrii(e);
					break;
				case "Materie":
					array[3] = setParametrii(e);
					break;
				case "Sala":
					array[4] = setParametrii(e);
					break;
				case "Functia":
					array[5] = setParametrii(e);
					break;
				case "Finish":

					array[7] = "Finish";
					Collections.sort(pag2.grupe_selectate);
					System.out.println(pag2.grupe_selectate.size());
					break;
				case "Grupa Selectata":
					setGrupa(e, pag2.grupe_selectate);
					break;
				}

			}

		}
		
		this.grupe_selectate=pag2.grupe_selectate;

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
		button.addActionListener(a);

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

		String jradio = "Grupa Selectata";
		
		rdbtnNewRadioButton.setActionCommand(jradio);
		rdbtnNewRadioButton_1.setActionCommand(jradio);
		rdbtnNewRadioButton_2.setActionCommand(jradio);
		rdbtnNewRadioButton_3.setActionCommand(jradio);
		rdbtnNewRadioButton_4.setActionCommand(jradio);
		rdbtnNewRadioButton_5.setActionCommand(jradio);
		rdbtnNewRadioButton_6.setActionCommand(jradio);
		rdbtnNewRadioButton_7.setActionCommand(jradio);
		rdbtnNewRadioButton_8.setActionCommand(jradio);
		rdbtnNewRadioButton_9.setActionCommand(jradio);
		

		rdbtnNewRadioButton.addActionListener(a);
		rdbtnNewRadioButton_1.addActionListener(a);
		rdbtnNewRadioButton_2.addActionListener(a);
		rdbtnNewRadioButton_3.addActionListener(a);
		rdbtnNewRadioButton_4.addActionListener(a);
		rdbtnNewRadioButton_5.addActionListener(a);
		rdbtnNewRadioButton_6.addActionListener(a);
		rdbtnNewRadioButton_7.addActionListener(a);
		rdbtnNewRadioButton_8.addActionListener(a);
		rdbtnNewRadioButton_9.addActionListener(a);
		
		JLabel lblNewLabel_4 = new JLabel("Sala");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 286, 45, 13);
		contentPane.add(lblNewLabel_4);

		JComboBox<String> comboBox = new JComboBox<String>(this.array_prof);
		comboBox.setBounds(130, 36, 252, 21);
		contentPane.add(comboBox);
		comboBox.setActionCommand("Profesor1");

		JComboBox<String> comboBox_1 = new JComboBox<String>(this.array_prof);
		comboBox_1.setBounds(130, 103, 252, 21);
		contentPane.add(comboBox_1);
		comboBox_1.setActionCommand("Profesor2");

		JComboBox<String> comboBox_2 = new JComboBox<String>(this.array_materii);
		comboBox_2.setBounds(130, 172, 252, 21);
		contentPane.add(comboBox_2);
		comboBox_2.setActionCommand("Materie");

		JComboBox<String> comboBox_3 = new JComboBox<String>(this.array_sali);
		comboBox_3.setBounds(130, 284, 252, 21);
		contentPane.add(comboBox_3);
		comboBox_3.setActionCommand("Sala");

		comboBox.addActionListener(a);
		comboBox_1.addActionListener(a);
		comboBox_2.addActionListener(a);
		comboBox_3.addActionListener(a);

		return array;

	}

	@SuppressWarnings("unchecked")
	/**
	 * 
	 * @param e actiunea butonului
	 * @return returneaza textul selectat
	 */
	public String setParametrii(ActionEvent e) {
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox = (JComboBox<String>) e.getSource();
		return comboBox.getSelectedItem().toString();

	}

	/**
	 * 
	 * @param e actiunea butonului 
	 * @param grupe adauga grupele selectate
	 */
	public void setGrupa(ActionEvent e, Vector<String> grupe) {
		JRadioButton jradio = new JRadioButton();
		jradio = (JRadioButton) e.getSource();
		if (jradio.isSelected()) {
			grupe.add(jradio.getText());

		} else {
			grupe.remove(jradio.getText());
		}

	}

}
