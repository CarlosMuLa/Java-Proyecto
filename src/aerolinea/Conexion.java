package aerolinea;
import javax.swing.*;
import java.sql.*;

public class Conexion {

    private static final String URL = "jdbc:sqlserver://localhost:1433;database=Java;user=user;password=user;encrypt=false";
    public static Connection establecerConexion() {
        try {
            Connection connection = DriverManager.getConnection(URL);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
            return connection;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + e.getMessage());
            return null;
        }
    }
}