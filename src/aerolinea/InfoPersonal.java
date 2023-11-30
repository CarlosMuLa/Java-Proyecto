package aerolinea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class InfoPersonal extends JFrame {
    private JTextField nombreField;
    private JTextField apellidoPaternoField;
    private JTextField apellidoMaternoField;
    private JTextField curpField;
    private JTextField pasaporteField;
    private JComboBox<String> diaComboBox;
    private JComboBox<String> mesComboBox;
    private JComboBox<String> anioComboBox;
    private JComboBox<String> sexoComboBox;

    public InfoPersonal() {
        setTitle("Información Personal");
        setSize(381, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
                panel.setLayout(null);
        
                JLabel labelNombre = new JLabel("Nombre");
                labelNombre.setBounds(10, 52, 77, 31);
                labelNombre.setFont(new Font("Arial", Font.PLAIN, 12));
                panel.add(labelNombre);
        nombreField = new JTextField();
        nombreField.setBounds(137, 52, 203, 31);
        panel.add(nombreField);

        JLabel labelApellidoPaterno = new JLabel("Apellido Paterno");
        labelApellidoPaterno.setFont(new Font("Arial", Font.PLAIN, 12));
        labelApellidoPaterno.setBounds(10, 93, 106, 31);
        panel.add(labelApellidoPaterno);
        apellidoPaternoField = new JTextField();
        apellidoPaternoField.setBounds(137, 93, 203, 31);
        panel.add(apellidoPaternoField);

        JLabel labelApellidoMaterno = new JLabel("Apellido Materno");
        labelApellidoMaterno.setFont(new Font("Arial", Font.PLAIN, 12));
        labelApellidoMaterno.setBounds(10, 134, 106, 31);
        panel.add(labelApellidoMaterno);
        apellidoMaternoField = new JTextField();
        apellidoMaternoField.setBounds(137, 134, 203, 31);
        panel.add(apellidoMaternoField);

        JLabel labelCurp = new JLabel("CURP");
        labelCurp.setFont(new Font("Arial", Font.PLAIN, 12));
        labelCurp.setBounds(10, 175, 188, 31);
        panel.add(labelCurp);
        curpField = new JTextField();
        curpField.setBounds(137, 175, 203, 31);
        panel.add(curpField);

        JLabel labelFechaNacimiento = new JLabel("Fecha de Nacimiento");
        labelFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 12));
        labelFechaNacimiento.setBounds(10, 216, 188, 31);
        panel.add(labelFechaNacimiento);

        diaComboBox = new JComboBox<>(getDias());
        diaComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        diaComboBox.setModel(new DefaultComboBoxModel(new String[] {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"}));
        diaComboBox.setBounds(234, 255, 106, 31);
        mesComboBox = new JComboBox<>(getMeses());
        mesComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        mesComboBox.setBounds(10, 255, 77, 31);
        anioComboBox = new JComboBox<>(getAnios());
        anioComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        anioComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        anioComboBox.setBounds(111, 255, 96, 31);
        panel.add(diaComboBox);
        panel.add(mesComboBox);
        panel.add(anioComboBox);

        JLabel labelSexo = new JLabel("Sexo");
        labelSexo.setFont(new Font("Arial", Font.PLAIN, 12));
        labelSexo.setBounds(10, 294, 188, 31);
        panel.add(labelSexo);
        String[] opcionesSexo = {"Masculino", "Femenino"};
        sexoComboBox = new JComboBox<>(opcionesSexo);
        sexoComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        sexoComboBox.setBounds(152, 296, 188, 31);
        panel.add(sexoComboBox);

        JLabel labelPasaporte = new JLabel("Número de Pasaporte");
        labelPasaporte.setFont(new Font("Arial", Font.PLAIN, 12));
        labelPasaporte.setBounds(10, 335, 135, 31);
        panel.add(labelPasaporte);
        pasaporteField = new JTextField();
        pasaporteField.setBounds(137, 335, 203, 31);
        panel.add(pasaporteField);

        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.setFont(new Font("Arial", Font.PLAIN, 12));
        botonGuardar.setBounds(187, 379, 153, 31);
        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (camposVacios()) {
                    JOptionPane.showMessageDialog(InfoPersonal.this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    agregarDatos();
                }
            }
        });
        panel.add(botonGuardar);
        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Información Personal");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
        lblNewLabel.setBounds(10, 10, 315, 41);
        panel.add(lblNewLabel);
        
        JButton botonRegresar_1 = new JButton("Regresar");
        botonRegresar_1.setFont(new Font("Arial", Font.PLAIN, 12));
        botonRegresar_1.setBounds(10, 384, 153, 31);
        panel.add(botonRegresar_1);

        setVisible(true);
    }

    private String[] getDias() {
        String[] dias = new String[31];
        for (int i = 1; i <= 31; i++) {
            dias[i - 1] = String.valueOf(i);
        }
        return dias;
    }

    private String[] getMeses() {
        return new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    }

    private String[] getAnios() {
        String[] anios = new String[50];
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < 50; i++) {
            anios[i] = String.valueOf(anioActual - i);
        }
        return anios;
    }
    
    
    private boolean camposVacios() {
        return nombreField.getText().isEmpty() || apellidoPaternoField.getText().isEmpty() ||
                apellidoMaternoField.getText().isEmpty() || curpField.getText().isEmpty() ||
                diaComboBox.getSelectedItem().toString().isEmpty() || mesComboBox.getSelectedItem().toString().isEmpty() ||
                anioComboBox.getSelectedItem().toString().isEmpty() || sexoComboBox.getSelectedItem().toString().isEmpty() ||
                pasaporteField.getText().isEmpty();
    }
    
    
    private void agregarDatos() {
        String nombre = nombreField.getText();
        String apellidoPaterno = apellidoPaternoField.getText();
        String apellidoMaterno = apellidoMaternoField.getText();
        String curp = curpField.getText();
        
        String dia = (String) diaComboBox.getSelectedItem();
        String mes = (String) mesComboBox.getSelectedItem();
        String anio = (String) anioComboBox.getSelectedItem();
        String fechaNacimiento = dia + "/" + mes + "/" + anio;

        String sexo = (String) sexoComboBox.getSelectedItem();
        String pasaporte = pasaporteField.getText();

        if (!nombre.isEmpty() && !apellidoPaterno.isEmpty() && !apellidoMaterno.isEmpty() && !curp.isEmpty() && !fechaNacimiento.isEmpty() && !sexo.isEmpty() && !pasaporte.isEmpty()) {
            try {
                try (Connection conexion = Conexion.establecerConexion();
                     PreparedStatement ps = conexion.prepareStatement("INSERT INTO InfoBuena (nombre, apellidoPaterno, apellidoMaterno, curp, dia, mes, anio, sexo, pasaporte) VALUES (?,?,?,?,?,?,?,?,?)")) {

                    ps.setString(1, nombre);
                    ps.setString(2, apellidoPaterno);
                    ps.setString(3, apellidoMaterno);
                    ps.setString(4, curp);
                    ps.setString(5, dia);
                    ps.setString(6, mes);
                    ps.setString(7, anio);
                    ps.setString(8, sexo);
                    ps.setString(9, pasaporte);

                    int filasAfectadas = ps.executeUpdate();

                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(InfoPersonal.this, "Datos agregados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(InfoPersonal.this, "Error al insertar datos en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(InfoPersonal.this, "Error al ejecutar la inserción en la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(InfoPersonal.this, "Por favor, ingresa un valor numérico válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(InfoPersonal.this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InfoPersonal());
    }
}
