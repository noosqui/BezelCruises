
package Clases;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author andrea
 */

public class ConexionBasedeDatos {
    
    static Connection conn = null;
    
    //Metodo
    
    public static Connection obtenerConexion()
    {
        String url = "jdbc:sqlserver://A2QDHTTYFF:1433;databaseName=Cruceros";
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error de Conexion");
        }
        
        try
        {
            conn = DriverManager.getConnection(url, "usuarioSQL", "54321");
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + ex);
        }
        
        return conn;
    }
}
