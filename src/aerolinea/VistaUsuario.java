package aerolinea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;

public class VistaUsuario {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaUsuario window = new VistaUsuario();
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
	public VistaUsuario() {
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
		
		JLabel lblNewLabel = new JLabel("Vuelos reservados");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 11, 247, 32);
		frame.getContentPane().add(lblNewLabel);
		
		Object[][] data = {
        		{"Destino","Asiento", "Fecha", "Precio"},
                {".", 1, 5, 25}
        };
        String[] columnNames = {"Destino","Asiento", "Fecha", "Precio"};
		
		table = new JTable(data, columnNames);
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setBounds(68, 86, 260, 32);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setBounds(22, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
