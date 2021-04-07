/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author F_Machine
 */
public class Facturacion {
    /*
    Tipo de objeto camarote
    Tipo de objeto de persona
   
    */
    
    
     protected static int codigoFactura; 

     //encapsulamiento
    public int getCodigoFactura() {
        return codigoFactura;
    }

    public  void setCodigoFactura(int codigoFactura) {
        Facturacion.codigoFactura = codigoFactura;
    }
     
      
       public void  Itinerario(JTextArea t)
     {
         t.setText(" ");
         java.sql.Connection conectar = null;
         String query = "execute [InformacionItinerario]";
         
         try
         {
             conectar = ConexionBasedeDatos.obtenerConexion();
             PreparedStatement pst = conectar.prepareStatement(query);
             ResultSet resultado = pst.executeQuery();
             
             
             while(resultado.next())
             {
                 
                 t.append("\n"+resultado.getString(1)+"\n"+resultado.getString(2)+"\n"+resultado.getString(3)+"\nFecha de Entrega del Itinerario: "+resultado.getString(4)+"\nFecha del Viaje: "+resultado.getString(5)+"\n"+resultado.getString(6)+"\n"+resultado.getString(7)+"\n"+resultado.getString(8)+"\n"+resultado.getString(9)+"\nCodigo de factura: "+resultado.getString(10));
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
