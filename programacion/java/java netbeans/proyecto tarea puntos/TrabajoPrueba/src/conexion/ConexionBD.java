
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pojo.Neumatico;

/**
 *
 * @author SantoTomas
 */
public class ConexionBD
{
    private String cadenaConexion = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    //thin, cliente liviano
    private static Connection conexion;
    public ConexionBD()
    {
        try 
        {
            conexion = null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection(cadenaConexion, "alumno2", "alumno2");
            System.out.println("conexión exitosa");
        }
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Clase  driver oracle no encontrada");
        }
        catch (SQLException ex) 
        {
            System.out.println("Eror de conexión, verifique usario y/o contraseña");
        }
    }
    
//    public Object[] correosRecibidos()
//    {
//        Object[]resultado = new Object[numeroDeCorreos()];
//        int indice = 0;
//        try 
//        {
//            String consulta = "Select REMITENTE from MENSAJE";
//            
//            Statement instruccionBaseDatos = conexion.createStatement();//instruccion de BD
//            ResultSet datos = instruccionBaseDatos.executeQuery(consulta);
//            while(datos.next())//Boolean
//            {
//            Object dato = datos.getString("REMITENTE");
//            //System.out.println(dato);
//            resultado [indice++] = dato;
//            }
//        } 
//        catch (SQLException ex) 
//        {
//            System.out.println("Error al crear la instruccion de BASE de DATOS");
//        }
//        return resultado;
//    }
    
//    private int numeroDeCorreos()
//    {
//        int numero = 0;
//        try 
//        {
//            String consulta = "SELECT COUNT(*) AS numero_correos FROM mensaje";
//            Statement instruccionBaseDatos = conexion.createStatement();
//            ResultSet datos = instruccionBaseDatos.executeQuery(consulta);
//            if(datos.next()) //Pregunto si trajo datos
//                numero = datos.getInt("numero_correos");
//        } 
//        catch (SQLException ex) 
//        {
//            
//        }
//        return numero;
//    }
    
//    public String contenidoCorreo(String cuentaCorreo)
//    {
//        String contenido = "No se encontraron datos";
//        try 
//        {
//            String consulta = "SELECT contenido FROM mensaje WHERE remitente='"+cuentaCorreo+"'";
//            Statement instruccionBaseDatos = conexion.createStatement();
//            ResultSet datos = instruccionBaseDatos.executeQuery(consulta);
//            
//            if(datos.next()) //Pregunto si trajo datos
//                contenido = datos.getString("contenido");
//            //System.out.println(contenido);
//        } 
//        catch (SQLException ex) 
//        {
//            System.out.println("Error al traer el contenido del correo");
//        }
//        return contenido;
//    }
    
    public ArrayList<Neumatico> recuperarNeumaticos()
    {
        ArrayList<Neumatico> ar_neumatico = new ArrayList<>();
        try 
        {
            String consulta = "SELECT * FROM Neumatico";
            Statement instruccionBaseDatos = conexion.createStatement();
            ResultSet datos = instruccionBaseDatos.executeQuery(consulta);
            
            while(datos.next())
            {
                Neumatico neumaticos = new Neumatico();
                neumaticos.setCodigo(datos.getInt("codigo"));
                neumaticos.setPrecio(datos.getInt("precio"));
                neumaticos.setTipo(datos.getString("tipo"));
                neumaticos.setStock(datos.getInt("stock"));
                
                ar_neumatico.add(neumaticos);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al recuperar los correos");
        }
        return  ar_neumatico;
    }

//    public void eliminarcorreo(String correoSeleccionado)
//    {
//        try {
//            String consulta = "DELETE FROM mensaje WHERE remitente = '"+correoSeleccionado+"'";
//            Statement instruccionBaseDatos = conexion.createStatement();
//            //ejecucion
//            //ResultSet datos = instruccionBaseDatos.executeQuery(consulta);
//            instruccionBaseDatos.executeUpdate(consulta);
//        } catch (SQLException ex) {
//           System.out.println("no se puede eliminar mensaje"+correoSeleccionado);
//        }
//       
//    }

public void llenarNeumatico(String codigo, String precio, String tipo, String stock)
    {
        try 
        {
            
            String consulta = "INSERT INTO neumatico VALUES("+codigo+","+precio+",'"+tipo+"',"+stock+")";
            Statement instruccionBaseDatos = conexion.createStatement();
            instruccionBaseDatos.executeUpdate(consulta);
            JOptionPane.showMessageDialog(null, "Guardado Con Exito");
            
            
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "imposible guardar datos");

        }
    }
}
