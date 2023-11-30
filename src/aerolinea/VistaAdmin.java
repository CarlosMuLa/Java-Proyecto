package aerolinea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class VistaAdmin extends JFrame {
    private JFrame frame;
    private JTable table;
    private JTable table_1;
    private JButton btnRegresar;
    private JButton btnImportarDatos;
    private JButton btnImportarDatos_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VistaAdmin window = new VistaAdmin();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VistaAdmin() {
        initialize();
    }

    private void initialize() {
        setTitle("Vista de Admin");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Vista de Admin");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
        lblNewLabel.setBounds(10, 11, 275, 40);
        getContentPane().add(lblNewLabel);

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[] { "Nombre(s)", "Apellido paterno", "Apellido Materno", "CURP", "Dia", "Mes", "Año", "Sexo", "Pasaporte" });

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 62, 750, 150);
        getContentPane().add(scrollPane);

        table = new JTable(tableModel);
        table.setFont(new Font("Arial", Font.PLAIN, 12));
        scrollPane.setViewportView(table);

        btnImportarDatos = new JButton("Importar Datos");
        btnImportarDatos.setBounds(10, 220, 130, 23);
        getContentPane().add(btnImportarDatos);

        btnImportarDatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                importarDatosTabla1();
            }
        });

        DefaultTableModel tableModel_1 = new DefaultTableModel();
        tableModel_1.setColumnIdentifiers(new String[] { "Nombre", "Tarjeta", "Mes", "Año", "CVV" });

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 270, 750, 150);
        getContentPane().add(scrollPane_1);

        table_1 = new JTable(tableModel_1);
        table_1.setFont(new Font("Arial", Font.PLAIN, 12));
        scrollPane_1.setViewportView(table_1);

        btnImportarDatos_1 = new JButton("Importar Datos");
        btnImportarDatos_1.setBounds(10, 430, 130, 23);
        getContentPane().add(btnImportarDatos_1);

        // Agregar ActionListener al botón de importar datos 1
        btnImportarDatos_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                importarDatosTabla2();
            }
        });

        btnRegresar = new JButton("Regresar");
        btnRegresar.setBounds(10, 470, 89, 23);
        getContentPane().add(btnRegresar);

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminOUser adminOUser = new AdminOUser();
                adminOUser.setVisible(true);
                dispose();
            }
        });
    }

    private void importarDatosTabla2() {
        try {
            Connection con = Conexion.establecerConexion();
            PreparedStatement ps = con.prepareStatement("SELECT nombre, tarjeta, mes, anio, StrCVV FROM Pagos_Buena");
            ResultSet rs = ps.executeQuery();

            DefaultTableModel tableModel_1 = (DefaultTableModel) table_1.getModel();
            tableModel_1.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getString("nombre"),
                    rs.getString("tarjeta"),
                    rs.getString("mes"),
                    rs.getString("anio"),
                    rs.getString("StrCVV")
                };
                tableModel_1.addRow(row);
            }

            con.close();

        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, e1.toString());
        }
    }

    private void importarDatosTabla1() {
        try {
            Connection con = Conexion.establecerConexion();
            PreparedStatement ps = con.prepareStatement("SELECT nombre, apellidoPaterno, apellidoMaterno, curp, dia, mes, anio, sexo, pasaporte FROM InfoBuena");
            ResultSet rs = ps.executeQuery();

            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getString("nombre"),
                    rs.getString("apellidoPaterno"),
                    rs.getString("apellidoMaterno"),
                    rs.getString("curp"),
                    rs.getString("dia"),
                    rs.getString("mes"),
                    rs.getString("anio"),
                    rs.getString("sexo"),
                    rs.getString("pasaporte")
                };
                tableModel.addRow(row);
            }

            con.close();

        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, e1.toString());
        }
    }
}
