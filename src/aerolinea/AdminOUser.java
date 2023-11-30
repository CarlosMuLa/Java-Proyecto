package aerolinea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminOUser extends JFrame {
    public AdminOUser() {
        // Configurar el JFrame
        setTitle("Bienvenido");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel para agregar componentes
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Crear un JLabel de bienvenida
        JLabel bienvenidaLabel = new JLabel("¡Bienvenido a TuAerolinea!");
        bienvenidaLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        bienvenidaLabel.setBounds(112, 53, 151, 28);
        panel.add(bienvenidaLabel);

        // Crear botón de usuario
        JButton usuarioButton = new JButton("Usuario");
        usuarioButton.setBounds(84, 81, 100, 30);  // Ajusta el tamaño
        usuarioButton.setFont(new Font("Arial", Font.PLAIN, 12));  // Cambia la fuente
        panel.add(usuarioButton);

        // Agregar ActionListener al botón de usuario
        usuarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir el JFrame "AerolineaInterface" para usuarios
                AerolineaInterface aerolineaInterface = new AerolineaInterface();
                aerolineaInterface.setVisible(true);
                // Cerrar el frame actual si es necesario
                dispose();
            }
        });

        // Crear botón de admin
        JButton adminButton = new JButton("Admin");
        adminButton.setBounds(195, 81, 100, 30);  // Ajusta el tamaño
        adminButton.setFont(new Font("Arial", Font.PLAIN, 12));  // Cambia la fuente
        panel.add(adminButton);

        // Agregar ActionListener al botón de admin
        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir el JFrame "VistaAdmin" para administradores
                VistaAdmin vistaAdmin = new VistaAdmin();
                vistaAdmin.setVisible(true);
                // Cerrar el frame actual si es necesario
                dispose();
            }
        });

        // Agregar el panel al JFrame
        getContentPane().add(panel);

        // Hacer visible el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de AdminOUser
        AdminOUser adminOUser = new AdminOUser();
    }
}
