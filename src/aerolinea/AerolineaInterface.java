package aerolinea;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
    private List<Rutas> rutas;
    int indexselecionado;

    

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
    	rutas = new ArrayList<>();
        initialize();
    }

    private void initialize() {
    	Aeropuerto aeropuerto1 = new Aeropuerto("JFK", "Aeropuerto John F. Kennedy", "Estados Unidos");
        Aeropuerto aeropuerto2 = new Aeropuerto("LHR", "Aeropuerto de Heathrow", "Reino Unido");
        Aeropuerto aeropuerto3 = new Aeropuerto("CDG", "Aeropuerto Charles de Gaulle", "Francia");
        Aeropuerto aeropuerto4 = new Aeropuerto("HND", "Aeropuerto de Haneda", "Japón");
        Aeropuerto aeropuerto5 = new Aeropuerto("SYD", "Aeropuerto Kingsford Smith", "Australia");
        Aeropuerto aeropuerto6 = new Aeropuerto("PEK", "Aeropuerto Internacional de Pekín", "China");
        Aeropuerto aeropuerto7 = new Aeropuerto("DXB", "Aeropuerto Internacional de Dubái", "Emiratos Árabes Unidos");
        Aeropuerto aeropuerto8 = new Aeropuerto("SIN", "Aeropuerto de Singapur Changi", "Singapur");
        Aeropuerto aeropuerto9 = new Aeropuerto("FRA", "Aeropuerto de Fráncfort", "Alemania");
        Aeropuerto aeropuerto10 = new Aeropuerto("AMS", "Aeropuerto de Ámsterdam Schiphol", "Países Bajos");
        Aeropuerto aeropuerto11 = new Aeropuerto("IST", "Aeropuerto de Estambul", "Turquía");
        Aeropuerto aeropuerto12 = new Aeropuerto("CAN", "Aeropuerto Internacional de Cantón-Baiyun", "China");
        Aeropuerto aeropuerto13 = new Aeropuerto("ICN", "Aeropuerto Internacional de Incheon", "Corea del Sur");
        Aeropuerto aeropuerto14 = new Aeropuerto("ATL", "Aeropuerto Internacional Hartsfield-Jackson", "Estados Unidos");
        Aeropuerto aeropuerto15 = new Aeropuerto("MEX", "Aeropuerto Internacional de la Ciudad de México", "México");
        Aeropuerto aeropuerto16 = new Aeropuerto("YYZ", "Aeropuerto Internacional Toronto Pearson", "Canadá");
        Aeropuerto aeropuerto17 = new Aeropuerto("LAX", "Aeropuerto Internacional de Los Ángeles", "Estados Unidos");
        Aeropuerto aeropuerto18 = new Aeropuerto("BKK", "Aeropuerto Suvarnabhumi", "Tailandia");
        Aeropuerto aeropuerto19 = new Aeropuerto("JNB", "Aeropuerto Internacional O. R. Tambo", "Sudáfrica");
        Aeropuerto aeropuerto20 = new Aeropuerto("MUC", "Aeropuerto de Múnich", "Alemania");
        Aeropuerto aeropuerto21 = new Aeropuerto("DEL", "Aeropuerto Indira Gandhi", "India");
        Aeropuerto aeropuerto22 = new Aeropuerto("SYX", "Aeropuerto Internacional de Sanya Phoenix", "China");
        Aeropuerto aeropuerto23 = new Aeropuerto("PTY", "Aeropuerto Internacional de Tocumen", "Panamá");
        Aeropuerto aeropuerto24 = new Aeropuerto("HEL", "Aeropuerto de Helsinki-Vantaa", "Finlandia");
        Aeropuerto aeropuerto25 = new Aeropuerto("KIX", "Aeropuerto Internacional de Kansai", "Japón");
        Aeropuerto aeropuerto26 = new Aeropuerto("GIG", "Aeropuerto Internacional de Río de Janeiro-Galeão", "Brasil");
        Aeropuerto aeropuerto27 = new Aeropuerto("GRU", "Aeropuerto Internacional de São Paulo-Guarulhos", "Brasil");
        Aeropuerto aeropuerto28 = new Aeropuerto("EZE", "Aeropuerto Internacional de Ezeiza", "Argentina");
        Aeropuerto aeropuerto29 = new Aeropuerto("SCL", "Aeropuerto Internacional Arturo Merino Benítez", "Chile");
        Aeropuerto aeropuerto30 = new Aeropuerto("LIM", "Aeropuerto Internacional Jorge Chávez", "Perú");
        
        ArrayList<Rutas> rutasdisponibles = new ArrayList<>();
//public Rutas(Aeropuerto origin, Aeropuerto destiny, long duracion, int price, int distancia)
        Rutas ruta1 = new Rutas(aeropuerto1, aeropuerto2, 480, 5000, 5500,120);
        Rutas ruta2 = new Rutas(aeropuerto21, aeropuerto3, 180, 1300, 12100,240);
        Rutas ruta3 = new Rutas(aeropuerto30, aeropuerto4, 240, 4000, 25200,360);
        Rutas ruta4 = new Rutas(aeropuerto4, aeropuerto5, 300, 600, 30007,120);
        Rutas ruta5 = new Rutas(aeropuerto29, aeropuerto22, 240, 400, 25500,95);
        Rutas ruta6 = new Rutas(aeropuerto22, aeropuerto3, 300, 600, 30080,82);
        Rutas ruta7 = new Rutas(aeropuerto28, aeropuerto26, 480, 550, 55300,100);
        Rutas ruta8 = new Rutas(aeropuerto21, aeropuerto30, 180, 300, 11200,70);
        Rutas ruta9 = new Rutas(aeropuerto23, aeropuerto10, 240, 400, 20500,20);
        Rutas ruta10 = new Rutas(aeropuerto18, aeropuerto5, 300, 700, 30070,78);
        Rutas ruta11= new Rutas(aeropuerto27, aeropuerto14, 240, 940, 25600,120);
        Rutas ruta12 = new Rutas(aeropuerto14, aeropuerto5, 300, 1600, 37000,240);
        Rutas ruta13 = new Rutas(aeropuerto16, aeropuerto24, 480, 2500, 55800,90);
        Rutas ruta14 = new Rutas(aeropuerto21, aeropuerto25, 180, 3300, 12100,125);
        Rutas ruta15 = new Rutas(aeropuerto6, aeropuerto11, 240, 560, 2500,87);
        Rutas ruta16 = new Rutas(aeropuerto11, aeropuerto12, 300, 670, 3000,100);
        Rutas ruta17 = new Rutas(aeropuerto7, aeropuerto17, 240, 490, 2500,90);
        Rutas ruta18 = new Rutas(aeropuerto8, aeropuerto15, 300, 6010, 3000,87);
        Rutas ruta19 = new Rutas(aeropuerto9, aeropuerto20, 480, 5500, 55100,100);
        Rutas ruta20 = new Rutas(aeropuerto21, aeropuerto6, 180, 3700, 12600,100);
        Rutas ruta21 = new Rutas(aeropuerto3, aeropuerto4, 240, 4800, 25800,87);
        Rutas ruta22 = new Rutas(aeropuerto8, aeropuerto23, 300, 6500, 37000,65);
        Rutas ruta23= new Rutas(aeropuerto10, aeropuerto4, 240, 200, 25060,74);
        Rutas ruta24 = new Rutas(aeropuerto5, aeropuerto1, 300, 6600, 30500,90);
        Rutas ruta25 = new Rutas(aeropuerto1, aeropuerto10, 480, 8900, 550,360);
        Rutas ruta26 = new Rutas(aeropuerto21, aeropuerto20, 180, 1100, 123,80);
        Rutas ruta27 = new Rutas(aeropuerto3, aeropuerto13, 240, 4400, 2550,77);
        Rutas ruta28 = new Rutas(aeropuerto4, aeropuerto19, 300, 6000, 3000,86);
        Rutas ruta29 = new Rutas(aeropuerto19, aeropuerto26, 240, 4100, 2500,120);
        Rutas ruta30 = new Rutas(aeropuerto4, aeropuerto25, 300, 6700, 3000,360);
        Rutas ruta31 = new Rutas(aeropuerto11, aeropuerto2, 480, 5200, 5500,87);
        Rutas ruta32 = new Rutas(aeropuerto21, aeropuerto13, 180, 3300, 5200,90);
        Rutas ruta33 = new Rutas(aeropuerto2, aeropuerto23, 240, 4300, 2500,120);
        Rutas ruta34 = new Rutas(aeropuerto14, aeropuerto10, 300, 3600, 3000,90);
        Rutas ruta35= new Rutas(aeropuerto30, aeropuerto16, 240, 4050, 2500,60);
        Rutas ruta36 = new Rutas(aeropuerto25, aeropuerto5, 300, 6050, 3000,480);
        Rutas ruta37 = new Rutas(aeropuerto20, aeropuerto27, 240, 4070, 2500,400);
        Rutas ruta38 = new Rutas(aeropuerto19, aeropuerto18, 300, 6060, 3000,350);
        Rutas ruta39= new Rutas(aeropuerto3, aeropuerto19, 240, 4090, 2500,99);
        Rutas ruta41= new Rutas(aeropuerto19, aeropuerto7, 240, 4090, 2500,99);
        Rutas ruta42= new Rutas(aeropuerto1, aeropuerto9, 240, 4090, 2500,99);
        Rutas ruta43= new Rutas(aeropuerto26, aeropuerto18, 240, 4090, 2500,99);
        Rutas ruta44= new Rutas(aeropuerto20, aeropuerto12, 240, 4090, 2500,99);
        Rutas ruta45= new Rutas(aeropuerto30, aeropuerto28, 240, 4090, 2500,99);
        Rutas ruta40 = new Rutas(aeropuerto5, aeropuerto4, 300, 6600, 3000,320);
        Rutas ruta46= new Rutas(aeropuerto24, aeropuerto17, 240, 4090, 2500,99);
        Rutas ruta47= new Rutas(aeropuerto17, aeropuerto24, 240, 4090, 2500,99);
        Rutas ruta48= new Rutas(aeropuerto24, aeropuerto8, 240, 4090, 2500,99);
        Rutas ruta49= new Rutas(aeropuerto12, aeropuerto19, 240, 4090, 2500,99);
        Rutas ruta50= new Rutas(aeropuerto13, aeropuerto14, 240, 4090, 2500,99);
        Rutas ruta51= new Rutas(aeropuerto15, aeropuerto21, 240, 4090, 2500,99);
        Rutas ruta52= new Rutas(aeropuerto2, aeropuerto29, 240, 4090, 2500,99);
        Rutas ruta53= new Rutas(aeropuerto2, aeropuerto30, 240, 4090, 2500,99);
        


        //public void comprarBoleto(int index, Stringnombre,boolean sexo,int edad, String pasaporte, int asiento)
	  // public Vuelo(Rutas ruta,Avion plane, LocalDateTime horasalida,LocalDateTime each) 
	 
	 rutasdisponibles.add(ruta1);
	 rutasdisponibles.add(ruta2);
	 rutasdisponibles.add(ruta5);
	 rutasdisponibles.add(ruta6);
	 rutasdisponibles.add(ruta7);
	 rutasdisponibles.add(ruta8);
	 rutasdisponibles.add(ruta9);
	 rutasdisponibles.add(ruta10);
	 rutasdisponibles.add(ruta11);
	 rutasdisponibles.add(ruta12);
	 rutasdisponibles.add(ruta13);
	 rutasdisponibles.add(ruta14);
	 rutasdisponibles.add(ruta15);
	 rutasdisponibles.add(ruta16);
	 rutasdisponibles.add(ruta17);
	 rutasdisponibles.add(ruta18);
	 rutasdisponibles.add(ruta19);
	 rutasdisponibles.add(ruta21);
	 rutasdisponibles.add(ruta20);
	 rutasdisponibles.add(ruta22);
	 rutasdisponibles.add(ruta23);
	 rutasdisponibles.add(ruta24);
	 rutasdisponibles.add(ruta25);
	 rutasdisponibles.add(ruta26);
	 rutasdisponibles.add(ruta27);
	 rutasdisponibles.add(ruta28);
	 rutasdisponibles.add(ruta29);
	 rutasdisponibles.add(ruta3);
	 rutasdisponibles.add(ruta30);
	 rutasdisponibles.add(ruta31);
	 rutasdisponibles.add(ruta32);
	 rutasdisponibles.add(ruta33);
	 rutasdisponibles.add(ruta33);
	 rutasdisponibles.add(ruta34);
	 rutasdisponibles.add(ruta35);
	 rutasdisponibles.add(ruta36);
	 rutasdisponibles.add(ruta37);
	 rutasdisponibles.add(ruta38);
	 rutasdisponibles.add(ruta39);
	 rutasdisponibles.add(ruta4);
	 rutasdisponibles.add(ruta40);
	 rutasdisponibles.add(ruta41);
	 rutasdisponibles.add(ruta42);
	 rutasdisponibles.add(ruta43);
	 rutasdisponibles.add(ruta44);
	 rutasdisponibles.add(ruta45);
	 rutasdisponibles.add(ruta46);
	 rutasdisponibles.add(ruta47);
	 rutasdisponibles.add(ruta48);
	 rutasdisponibles.add(ruta49);
	 rutasdisponibles.add(ruta50);
	 rutasdisponibles.add(ruta51);
	 rutasdisponibles.add(ruta52);
	 rutasdisponibles.add(ruta53);
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
        JLabel nombresCompletosLabel= new JLabel();
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
        lblNewLabel.setBounds(15, 15, 250, 44);
        
        panel.add(nombresCompletosLabel);

        

        JButton btnNewButton = new JButton("Pagar");
        btnNewButton.setEnabled(false);
        btnNewButton.setBounds(302, 214, 110, 23);
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
        lblNewLabel_6.setBounds(312, 161, 100, 14);
        panel.add(lblNewLabel_6);

        textField = new JTextField();
        textField.setEditable(true);
        textField.setBounds(302, 183, 110, 20);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Destino");
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(15, 59, 46, 14);
        panel.add(lblNewLabel_2);

        JComboBox<Rutas> comboBox = new JComboBox<>(new DefaultComboBoxModel<>(rutasdisponibles.toArray(new Rutas[0])));
        comboBox.setToolTipText("Ruta seleccionada");
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acceder al elemento seleccionado en el JComboBox
                Rutas rutaSeleccionada = (Rutas) comboBox.getSelectedItem();
                indexselecionado =comboBox.getSelectedIndex(); 
                // Verificar si se seleccionó una ruta
                if (rutaSeleccionada != null) {
                    // Obtener y mostrar los nombres completos
                    String nombresCompletos = rutaSeleccionada.obtenerNombresCompletos();
                    System.out.println(nombresCompletos);
                    nombresCompletosLabel.setText(nombresCompletos);
                } else {
                    // Manejar el caso en que no se haya seleccionado ninguna ruta
                    nombresCompletosLabel.setText("No se ha seleccionado ninguna ruta");
                }
            }
        });
        comboBox.setBounds(15, 75, 120, 22);
        panel.add(comboBox);

        JLabel lblNewLabel_3 = new JLabel("Asiento");
        lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_3.setBounds(15, 108, 46, 14);
        panel.add(lblNewLabel_3);

        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
        comboBox_1.setBounds(15, 128, 60, 22);
        panel.add(comboBox_1);

        JLabel lblNewLabel_4 = new JLabel("Dia (Diciembre 2023)");
        lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_4.setBounds(15, 161, 180, 14);
        panel.add(lblNewLabel_4);

        JComboBox<String> comboBox_3 = new JComboBox<String>();
        comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        comboBox_3.setBounds(15, 181, 60, 22);
        panel.add(comboBox_3);

        JButton btnNewButton_1 = new JButton("Calcular precio");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton.setEnabled(true);
                
               textField.setText(String.valueOf(rutasdisponibles.get(indexselecionado).getPrecio()));
                
                
            }
        });
        btnNewButton_1.setBounds(15, 214, 125, 23);
        panel.add(btnNewButton_1);
    }
}
