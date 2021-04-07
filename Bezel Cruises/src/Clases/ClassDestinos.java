
package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

//herencia
public class ClassDestinos extends ClaseViajes {
    //polimorfismo
    @Override
    public void comboboxDestino (JComboBox cmb)
  {
        java.sql.Connection conectar = null;
         
         String query = "SELECT Nombre_Pais FROM Paises Order by Codigo_Pais asc";
         
         try
         {
             conectar = ConexionBasedeDatos.obtenerConexion();
             PreparedStatement pst = conectar.prepareStatement(query);
             ResultSet resultado = pst.executeQuery();
             cmb.addItem("Seleccione un Pais");
             
             while(resultado.next())
             {
                 cmb.addItem(resultado.getString("Nombre_Pais"));
             }
         }
         catch (Exception ex)
         {
             JOptionPane.showMessageDialog(null, ex);
         }
         finally
         {
             if(conectar!=null)
             {
                 try
                 {
                     conectar.close();
                 }
                 catch(Exception e)
                         {
                             JOptionPane.showMessageDialog(null, e);
                         }
             }
         }
  }
    
    
    public void comboboxDestino (JComboBox cmb, String query)
  {
        java.sql.Connection conectar = null;
         
        
         
         try
         {
             conectar = ConexionBasedeDatos.obtenerConexion();
             PreparedStatement pst = conectar.prepareStatement(query);
             ResultSet resultado = pst.executeQuery();
             cmb.addItem("Seleccione una Ciudad");
             
             while(resultado.next())
             {
                 cmb.addItem(resultado.getString("Nombre_Ciudad"));
             }
         }
         catch (Exception ex)
         {
             JOptionPane.showMessageDialog(null, ex);
         }
         finally
         {
             if(conectar!=null)
             {
                 try
                 {
                     conectar.close();
                 }
                 catch(Exception e)
                         {
                             JOptionPane.showMessageDialog(null, e);
                         }
             }
         }
  }
}
