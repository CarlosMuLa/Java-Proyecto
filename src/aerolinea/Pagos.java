package aerolinea;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Pagos extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Pagos frame = new Pagos();
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
	public Pagos() {
		setBounds(100, 100, 361, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Pagos");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 10, 180, 32);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Método de Pago");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 43, 114, 22);
		getContentPane().add(lblNewLabel_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tarjeta de Crédito");
		rdbtnNewRadioButton.setBounds(10, 65, 133, 21);
		getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tarjeta de Débito");
		rdbtnNewRadioButton_1.setBounds(10, 87, 133, 21);
		getContentPane().add(rdbtnNewRadioButton_1);

		textField = new JTextField();
		textField.setBounds(10, 173, 114, 19);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Número de Tarjeta");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 157, 133, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Fecha de Vencimiento");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(9, 206, 134, 13);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Nombre del Titular");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 114, 114, 13);
		getContentPane().add(lblNewLabel_4);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 128, 114, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox.setBounds(10, 229, 43, 21);
		getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35" }));
		comboBox_1.setBounds(65, 229, 43, 21);
		getContentPane().add(comboBox_1);

		JLabel lblNewLabel_5 = new JLabel("CVV");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(170, 176, 45, 13);
		getContentPane().add(lblNewLabel_5);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(170, 192, 60, 19);
		getContentPane().add(textField_2);

		JButton btnNewButton = new JButton("Pagar");
		btnNewButton.setBounds(166, 229, 85, 21);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\rober\\OneDrive\\Desktop\\fotobuena.jpg"));
		lblNewLabel_6.setBounds(170, 24, 149, 147);
		getContentPane().add(lblNewLabel_6);
	}
}
