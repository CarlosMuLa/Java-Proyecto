package aerolinea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;

public class VistaAdmin {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAdmin window = new VistaAdmin();
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
	public VistaAdmin() {
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
		
		JLabel lblNewLabel = new JLabel("Vista de Admin");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 11, 275, 40);
		frame.getContentPane().add(lblNewLabel);
		
        Object[][] data = {
        		{"Usuario", "Nombre(s)","Apellido paterno", "Apellido Materno"},
                {1, "Juan", "Perez", "Lopez"}
        };
        String[] columnNames = {"Usuario","Nombre(s)","Apellido paterno", "Apellido Materno"};
		
		table = new JTable(data, columnNames);
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setBounds(52, 62, 331, 32);
		frame.getContentPane().add(table);
		
		Object[][] data_1 = {
        		{"Usuario", "Destino","Asiento", "Fecha", "Precio"},
                {1, ".", 1, 5, 25}
        };
        String[] columnNames_1 = {"Usuario","Destino","Asiento", "Fecha", "Precio"};
        
		table_1 = new JTable(data_1, columnNames_1);
		table_1.setFont(new Font("Arial", Font.PLAIN, 12));
		table_1.setBounds(52, 130, 331, 32);
		frame.getContentPane().add(table_1);
		
		btnNewButton = new JButton("Regresar");
		btnNewButton.setBounds(22, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
