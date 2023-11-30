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
        setTitle("Bienvenido");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel bienvenidaLabel = new JLabel("¡Bienvenido a TuAerolinea!");
        bienvenidaLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        bienvenidaLabel.setBounds(112, 53, 151, 28);
        panel.add(bienvenidaLabel);

        JButton usuarioButton = new JButton("Usuario");
        usuarioButton.setBounds(84, 81, 100, 30);  
        usuarioButton.setFont(new Font("Arial", Font.PLAIN, 12));  
        panel.add(usuarioButton);

        usuarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AerolineaInterface aerolineaInterface = new AerolineaInterface();
                aerolineaInterface.setVisible(true);
                dispose();
            }
        });

        JButton adminButton = new JButton("Admin");
        adminButton.setBounds(195, 81, 100, 30);  
        adminButton.setFont(new Font("Arial", Font.PLAIN, 12));  
        panel.add(adminButton);

        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VistaAdmin vistaAdmin = new VistaAdmin();
                vistaAdmin.setVisible(true);
                dispose();
            }
        });

        getContentPane().add(panel);


        setVisible(true);
    }

    public static void main(String[] args) {
        AdminOUser adminOUser = new AdminOUser();
    }
}
