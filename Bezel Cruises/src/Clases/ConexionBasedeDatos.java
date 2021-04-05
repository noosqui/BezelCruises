
package Clases;

import java.sql.*;
<<<<<<< HEAD
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
=======
import javax.swing.JOptionPane;
>>>>>>> AndresCopia

public class ConexionBasedeDatos {
    
    static Connection conn = null;
    
    //Metodo
    
    public static Connection obtenerConexion()
<<<<<<< HEAD
    {  
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://A2QDHTTYFF:1433;databaseName=Cruceros; user = usuarioSQL; password = 54321");
=======
    {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Cruceros [sa on dbo]";
        
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
            conn = DriverManager.getConnection(url, "sa", "123");
>>>>>>> AndresCopia
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + ex);
        }
        
        return conn;
    }
<<<<<<< HEAD
  
=======
    
>>>>>>> AndresCopia
}
