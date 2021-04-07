package Clases;

import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Maykin Perdomo
 */
public class ProcedimientoBuquesandCamarotes {
//inserts //

    public static void insertBuque(String NombreBuque, String Tamanio_Buque, String Niveles, String Numero_Camarotes, String Id_TipoBuque) throws SQLException {
        CallableStatement datos = ConexionBasedeDatos.obtenerConexion().prepareCall("{call insertBuque(?,?,?,?,?)}");
        datos.setString(1, NombreBuque);
        datos.setString(2, Tamanio_Buque);
        datos.setString(3, Niveles);
        datos.setString(4, Numero_Camarotes);
        datos.setString(5, Id_TipoBuque);
        datos.execute();
    }

    public static void insertCamarotes(String Cantidad_Camas, String Descripcion_Camarote, String Precio_Camarote, String Id_Buque) throws SQLException {
        CallableStatement datos = ConexionBasedeDatos.obtenerConexion().prepareCall("{call insertCamarote(?,?,?,?)}");
        datos.setString(1, Cantidad_Camas);
        datos.setString(2, Descripcion_Camarote);
        datos.setString(3, Precio_Camarote);
        datos.setString(4, Id_Buque);
        datos.execute();
    }
    public static void insertTipoBuque(String DescripcionBuque, String Marca, String Modelo) throws SQLException {
        CallableStatement datos = ConexionBasedeDatos.obtenerConexion().prepareCall("{call insertTipoBuque(?,?,?)}");
        datos.setString(1, DescripcionBuque);
        datos.setString(2, Marca);
        datos.setString(3, Modelo); 
        datos.execute();
    }
    //eliminar //

    public static void deletbuque(int id) throws SQLException {
        CallableStatement dato = ConexionBasedeDatos.obtenerConexion().prepareCall("{call DeletBuques(?)}");
        dato.setInt(1, id);
        dato.execute();
    }
     public static void DelettipoBuque(int id) throws SQLException {
        CallableStatement dato = ConexionBasedeDatos.obtenerConexion().prepareCall("{call DelettipoBuque(?)}");
        dato.setInt(1, id);
        dato.execute();
    } 
     
     public static void deletCamarotes(int id) throws SQLException {
        CallableStatement dato = ConexionBasedeDatos.obtenerConexion().prepareCall("{call deletCamarote(?)}");
        dato.setInt(1, id);
        dato.execute();
    }

    //Actualizar //
    public static void Updatetbuque(int id, String NombreBuque, String Tamanio_Buque, String Niveles, String Numero_Camarotes, String Id_TipoBuque) throws SQLException {
        CallableStatement datos = ConexionBasedeDatos.obtenerConexion().prepareCall("{call Updatetbuque(?,?,?,?,?,?)}");
        datos.setInt(1, id);
        datos.setString(2, NombreBuque);
        datos.setString(3, Tamanio_Buque);
        datos.setString(4, Niveles);
        datos.setString(5, Numero_Camarotes);
        datos.setString(6, Id_TipoBuque);
        datos.execute();
    }

    public static void UpdateCamarotes(int id, String Cantidad_Camas, String Descripcion_Camarote, String Precio_Camarote, String Id_Buque) throws SQLException {
        CallableStatement datos = ConexionBasedeDatos.obtenerConexion().prepareCall("{call UpdateCamarote(?,?,?,?,?)}");
        datos.setInt(1, id);
        datos.setString(2, Cantidad_Camas);
        datos.setString(3, Descripcion_Camarote);
        datos.setString(4, Precio_Camarote);
        datos.setString(5, Id_Buque);
        datos.execute();
    }
    public static void Updatetipobuque(int id,String DescripcionBuque, String Marca, String Modelo) throws SQLException {
        CallableStatement datos = ConexionBasedeDatos.obtenerConexion().prepareCall("{call Updatetipobuque(?,?,?,?)}");
        datos.setInt(1, id);
        datos.setString(2, DescripcionBuque);
        datos.setString(3, Marca);
        datos.setString(4, Modelo); 
        datos.execute();
    }
    
    
///busquedas///////////
    public static void busquedaBuque(int id) throws SQLException {
        CallableStatement dato = ConexionBasedeDatos.obtenerConexion().prepareCall("{call busquedaBuque(?)}");
        dato.setInt(1, id);
        dato.execute();
    }
    public static void busquedatipoBuque(int id) throws SQLException {
        CallableStatement dato = ConexionBasedeDatos.obtenerConexion().prepareCall("{call busquedaBuque(?)}");
        dato.setInt(1, id);
        dato.execute();
    }
}
