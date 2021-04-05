package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBasedeDatos {
    
    static Connection conn ;
    
    //Metodo
    
    public static Connection obtenerConexion()
    {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Cruceros";
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             conn = DriverManager.getConnection(url,"sa","Dios");
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }
        catch(Exception ex)
            
        {conn = null;
            System.out.println(" "+ex);
        }
        
      
        
        return conn;
    }
    
}