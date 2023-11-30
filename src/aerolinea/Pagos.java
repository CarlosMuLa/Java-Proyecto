package aerolinea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pagos extends JFrame {
    private JTextField nombreTitular;
    private JTextField numeroTarjeta;
    private JTextField cvv;
    private JComboBox<String> comboMes;
    private JComboBox<String> comboAnio;

    public Pagos() {
    	
        setTitle("Pagos");
        setSize(365, 422);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel labelTitulo = new JLabel("Pagos");
        labelTitulo.setBounds(20, 12, 188, 32);
        labelTitulo.setFont(new Font("Arial Black", Font.PLAIN, 22));
        panel.add(labelTitulo);

        JLabel labelMetodoPago = new JLabel("Método de Pago");
        labelMetodoPago.setFont(new Font("Arial", Font.PLAIN, 12));
        labelMetodoPago.setBounds(20, 54, 188, 32);
        panel.add(labelMetodoPago);

        JRadioButton radioCredito = new JRadioButton("Tarjeta de Crédito");
        radioCredito.setFont(new Font("Arial", Font.PLAIN, 12));
        radioCredito.setBounds(20, 83, 148, 32);
        JRadioButton radioDebito = new JRadioButton("Tarjeta de Débito");
        radioDebito.setFont(new Font("Arial", Font.PLAIN, 12));
        radioDebito.setBounds(170, 83, 162, 32);
        ButtonGroup grupoMetodoPago = new ButtonGroup();
        grupoMetodoPago.add(radioCredito);
        grupoMetodoPago.add(radioDebito);
        panel.add(radioCredito);
        panel.add(radioDebito);

        JLabel labelNombreTitular = new JLabel("Nombre del Titular");
        labelNombreTitular.setFont(new Font("Arial", Font.PLAIN, 12));
        labelNombreTitular.setBounds(20, 130, 109, 32);
        panel.add(labelNombreTitular);
        nombreTitular = new JTextField();
        nombreTitular.setBounds(132, 131, 200, 32);
        panel.add(nombreTitular);

        JLabel labelNumeroTarjeta = new JLabel("Número de Tarjeta");
        labelNumeroTarjeta.setFont(new Font("Arial", Font.PLAIN, 12));
        labelNumeroTarjeta.setBounds(20, 172, 109, 32);
        panel.add(labelNumeroTarjeta);
        numeroTarjeta = new JTextField();
        numeroTarjeta.setBounds(132, 173, 200, 32);
        panel.add(numeroTarjeta);

        JLabel labelFechaVencimiento = new JLabel("Fecha de Vencimiento");
        labelFechaVencimiento.setFont(new Font("Arial", Font.PLAIN, 12));
        labelFechaVencimiento.setBounds(20, 214, 129, 32);
        panel.add(labelFechaVencimiento);

        comboMes = new JComboBox<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"});
        comboMes.setFont(new Font("Arial", Font.PLAIN, 12));
        comboMes.setBounds(159, 214, 49, 32);
        panel.add(comboMes);

        comboAnio = new JComboBox<>(new String[]{"2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033"});
        comboAnio.setFont(new Font("Arial", Font.PLAIN, 12));
        comboAnio.setBounds(223, 214, 110, 32);
        panel.add(comboAnio);

        JLabel labelCVV = new JLabel("CVV");
        labelCVV.setFont(new Font("Arial", Font.PLAIN, 12));
        labelCVV.setBounds(20, 256, 51, 32);
        panel.add(labelCVV);
        cvv = new JTextField();
        cvv.setBounds(68, 257, 264, 32);
        panel.add(cvv);

        JButton botonPagar = new JButton("Pagar");
        botonPagar.setBounds(184, 319, 148, 32);
        botonPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (camposVacios()) {
                    JOptionPane.showMessageDialog(Pagos.this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    agregarDatos();
                }
            }
        });
        
        panel.add(botonPagar);

        JButton botonRegresar = new JButton("Regresar");
        botonRegresar.setBounds(20, 319, 140, 32);
        botonRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	AerolineaInterface a = new AerolineaInterface();
            	a.setVisible(true);
            	dispose();
                System.out.println("Regresando...");
            }
        });
        panel.add(botonRegresar);

        getContentPane().add(panel);

        setVisible(true);
    }
    
    
    private void agregarDatos() {
        String nombre = nombreTitular.getText();
        String tarjeta = numeroTarjeta.getText();
        String mes = (String) comboMes.getSelectedItem();
        String anio = (String) comboAnio.getSelectedItem();
        String StrCVV = cvv.getText();

        if (!nombre.isEmpty() && !tarjeta.isEmpty() && !mes.isEmpty() && !anio.isEmpty() && !StrCVV.isEmpty()) {
            try {
                try (Connection conexion = Conexion.establecerConexion();
                     PreparedStatement ps = conexion.prepareStatement("INSERT INTO Pagos_Buena (nombre, tarjeta, mes, anio, StrCVV) VALUES (?,?,?,?,?)")) {

                    ps.setString(1, nombre);
                    ps.setString(2, tarjeta);
                    ps.setString(3, mes);
                    ps.setString(4, anio);
                    ps.setString(5, StrCVV);

                    int filasAfectadas = ps.executeUpdate();

                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Datos agregados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al insertar datos en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al ejecutar la inserción en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un valor numérico válido para el celular y la edad", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Pagos());
    }
    
    private boolean camposVacios() {
        return nombreTitular.getText().isEmpty() || numeroTarjeta.getText().isEmpty() ||
                comboMes.getSelectedItem().toString().isEmpty() || comboAnio.getSelectedItem().toString().isEmpty() ||
                cvv.getText().isEmpty();
    }
    
}
