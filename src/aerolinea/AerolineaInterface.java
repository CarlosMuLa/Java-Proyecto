package aerolinea;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class AerolineaInterface extends JFrame {

    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AerolineaInterface window = new AerolineaInterface();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AerolineaInterface() {
        initialize();
    }

    private void initialize() {
        setTitle("Agencia de Viajes");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel, null);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Agencia de Viajes");
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
        lblNewLabel.setBounds(15, 15, 250, 44);
        panel.add(lblNewLabel);

        

        JButton btnNewButton = new JButton("Pagar");
        btnNewButton.setEnabled(false);
        btnNewButton.setBounds(309, 227, 110, 23);
        panel.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                Pagos pagosFrame = new Pagos();
                pagosFrame.setVisible(true);
              
                setVisible(false);
            }
        });
        
        

        JLabel lblNewLabel_6 = new JLabel("Precio del vuelo");
        lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_6.setBounds(319, 174, 100, 14);
        panel.add(lblNewLabel_6);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(309, 196, 110, 20);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Destino");
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(15, 72, 46, 14);
        panel.add(lblNewLabel_2);

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Brazil", "Canada", "Mexico", "China" }));
        comboBox.setToolTipText("");
        comboBox.setBounds(15, 88, 110, 22);
        panel.add(comboBox);

        JLabel lblNewLabel_3 = new JLabel("Asiento");
        lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_3.setBounds(15, 121, 46, 14);
        panel.add(lblNewLabel_3);

        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] { "", "01", "02", "03", "04", "05", "06", "07",
                "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
                "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        comboBox_1.setBounds(15, 141, 60, 22);
        panel.add(comboBox_1);

        JLabel lblNewLabel_4 = new JLabel("Dia (Diciembre 2023)");
        lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_4.setBounds(15, 174, 180, 14);
        panel.add(lblNewLabel_4);

        JComboBox<String> comboBox_3 = new JComboBox<String>();
        comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] { "", "01", "02", "03", "04", "05", "06", "07",
                "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
                "25", "26", "27", "28", "29", "30", "31" }));
        comboBox_3.setBounds(15, 194, 60, 22);
        panel.add(comboBox_3);

        JButton btnNewButton_1 = new JButton("Calcular precio");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton.setEnabled(true);
            }
        });
        btnNewButton_1.setBounds(15, 227, 125, 23);
        panel.add(btnNewButton_1);
    }
}
