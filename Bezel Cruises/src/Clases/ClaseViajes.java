/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.awt.TextArea;
import javax.swing.JComboBox;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author Isis Zapata
 */
public class ClaseViajes {
    
    
     
     //sobrecarga
     public void combobox (JComboBox cmb)
     {
         java.sql.Connection conectar = null;
         
         String query = "SELECT Nombre_Buque FROM Buques ORDER BY Id_Buque asc";
         
         try
         {
             conectar = ConexionBasedeDatos.obtenerConexion();
             PreparedStatement pst = conectar.prepareStatement(query);
             ResultSet resultado = pst.executeQuery();
             cmb.addItem("Seleccione un Buque");
             
             while(resultado.next())
             {
                 cmb.addItem(resultado.getString("Nombre_Buque"));
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
     //
     }
     
      public void combobox (JComboBox cmb, String query)
     {
         java.sql.Connection conectar = null;
         
         
         try
         {
             conectar = ConexionBasedeDatos.obtenerConexion();
             PreparedStatement pst = conectar.prepareStatement(query);
             ResultSet resultado = pst.executeQuery();
             cmb.addItem("Seleccione un Destino");
             
             while(resultado.next())
             {
                 cmb.addItem(resultado.getString("Descripcion"));
                 
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
     //
     }

    public void combobox (JComboBox cmb, String query,String campo)
     {
         java.sql.Connection conectar = null;
         
         
         
         try
         {
             conectar = ConexionBasedeDatos.obtenerConexion();
             PreparedStatement pst = conectar.prepareStatement(query);
             ResultSet resultado = pst.executeQuery();
             cmb.addItem("Seleccione un Puerto de salida");
             
             while(resultado.next())
             {
                 cmb.addItem(resultado.getString(""+campo+""));
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
     //
     }
        //sobrecarga
      public void Ubicacion (String Lugar, int Codigo, JTextArea t)
     {
         t.setText(" ");
         java.sql.Connection conectar = null;
         String query = "execute [UbicacionViaje] "+Codigo+",'"+Lugar+"'";
         
         try
         {
             conectar = ConexionBasedeDatos.obtenerConexion();
             PreparedStatement pst = conectar.prepareStatement(query);
             ResultSet resultado = pst.executeQuery();
             
             
             while(resultado.next())
             {
                 
                 t.append("\n"+resultado.getString(1)+"\n"+resultado.getString(2)+"\n"+resultado.getString(3)+"\n"+resultado.getString(4));
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
     //
     }
      
       public void  PuertoSalida (String Lugar, int Codigo, JTextArea t)
     {
         t.setText(" ");
         java.sql.Connection conectar = null;
         String query = "execute [UbicacionPuertoSalida] "+Codigo+",'"+Lugar+"'";
         
         try
         {
             conectar = ConexionBasedeDatos.obtenerConexion();
             PreparedStatement pst = conectar.prepareStatement(query);
             ResultSet resultado = pst.executeQuery();
             
             
             while(resultado.next())
             {
                 
                 t.append("\n"+resultado.getString(4)+"\n"+resultado.getString(1)+"\n"+resultado.getString(2)+"\n"+resultado.getString(3));
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
//

       //polimorfismo
  public void comboboxDestino (JComboBox cmb)
  {}

}


