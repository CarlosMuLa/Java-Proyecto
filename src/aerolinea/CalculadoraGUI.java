package aerolinea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame {
    private JTextField pantalla;
    private JButton[] botonesNumeros;
    private JButton[] botonesOperadores;

    private double num1, num2, resultado;
    private String operador;

    public CalculadoraGUI() {
        // Configuración del JFrame
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Crear componentes
        pantalla = new JTextField();
        pantalla.setEditable(false);

        botonesNumeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botonesNumeros[i] = new JButton(Integer.toString(i));
        }

        botonesOperadores = new JButton[4];
        botonesOperadores[0] = new JButton("+");
        botonesOperadores[1] = new JButton("-");
        botonesOperadores[2] = new JButton("*");
        botonesOperadores[3] = new JButton("/");

        JButton igualButton = new JButton("=");

        // Configuración del diseño
        setLayout(new BorderLayout());
        pantalla.setPreferredSize(new Dimension(300, 50));
        pantalla.setFont(new Font("Arial", Font.PLAIN, 20));
        add(pantalla, BorderLayout.NORTH);

        JPanel panelNumeros = new JPanel(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            panelNumeros.add(botonesNumeros[i]);
        }
        panelNumeros.add(botonesNumeros[0]);
        add(panelNumeros, BorderLayout.CENTER);

        JPanel panelOperadores = new JPanel(new GridLayout(5, 1));
        for (JButton boton : botonesOperadores) {
            panelOperadores.add(boton);
        }
        panelOperadores.add(igualButton);
        add(panelOperadores, BorderLayout.EAST);

        // Agregar eventos a los botones
        for (JButton boton : botonesNumeros) {
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pantalla.setText(pantalla.getText() + boton.getText());
                }
            });
        }

        for (JButton boton : botonesOperadores) {
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(pantalla.getText());
                    operador = boton.getText();
                    pantalla.setText("");
                }
            });
        }

        igualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(pantalla.getText());
                switch (operador) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            pantalla.setText("Error");
                            return;
                        }
                        break;
                }
                pantalla.setText(Double.toString(resultado));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }
}
