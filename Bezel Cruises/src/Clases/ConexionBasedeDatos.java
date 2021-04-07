/*
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

/*
public class ConexionBasedeDatos {

    static Connection conn = null;

    public static boolean status = false;

    public static Connection obtenerConexion()

    {
        String url = "jdbc:sqlserver://DESKTOP-7ENJGBO:1433;databaseName=Crucero";

        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establece la conexion... revisar Driver" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }


        try
        {
            conn = DriverManager.getConnection(url, "sa", "Dios");

            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }
          catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error de Conexion");
        }
        return conn;
    }




    public static boolean getstatus(){
        return  status;
    }

    public static ResultSet Consulta(String consulta){
        Connection con = obtenerConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }


}*/


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
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }
        catch(Exception ex)
            
        {conn = null;
            System.out.println(" "+ex);
        }
        
      
        
        return conn;
    }
    
}