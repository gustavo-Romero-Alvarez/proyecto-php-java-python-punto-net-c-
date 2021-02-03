
package conexion;

import examen1.parte.VentanaIngreso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.ScrollEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import pojo.Paciente;
import pojo.Enfermero;
import pojo.Ingreso;



public class ConexionBD
{
    private String cadenaConexion = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    private static Connection conexion;
    
    public ConexionBD()
    {
        try 
        {
            conexion = null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection(cadenaConexion, "EXAMENJAVA", "EXAMENJAVA");
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
    
    
       public ArrayList<Paciente> recuperarPacientes()
    {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try 
        {
            String consulta = "SELECT * FROM paciente";
            Statement instruccionBaseDatos = conexion.createStatement();
            ResultSet datos = instruccionBaseDatos.executeQuery(consulta);
            
            while(datos.next())
            {
               Paciente pacientes1 = new Paciente();
               pacientes1.setRut(datos.getString("RUT"));
               pacientes1.setDv(datos.getString("DV"));
               pacientes1.setPriNombre(datos.getString("PRIMERNOMBRE"));
               pacientes1.setSegNombre(datos.getString("SEGUNDONOMBRE"));
               pacientes1.setApellPat(datos.getString("APE_PATERNO"));
               pacientes1.setApellMat(datos.getString("APE_MATERNO"));
               pacientes1.setGenero(datos.getString("GENERO"));
               pacientes1.setPeso(datos.getInt("PESO"));
               pacientes1.setTalla(datos.getInt("TALLA"));
               pacientes1.setTipoParto(datos.getString("TIPO_PARTO"));
               pacientes1.setFallece(datos.getString("FALLECE"));
               pacientes1.setFechaNacimiento(datos.getString("FECHA_NACIMIENTO"));

               
               pacientes.add(pacientes1);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al recuperar datos del paciente");
        }
        return pacientes;
    }
       
        public ArrayList<Enfermero> recuperarEnfermero()
    {
        ArrayList<Enfermero> pacientes = new ArrayList<>();
        try 
        {
            String consulta = "SELECT * FROM enfermero";
            Statement instruccionBaseDatos = conexion.createStatement();
            ResultSet datos = instruccionBaseDatos.executeQuery(consulta);
            
            while(datos.next())
            {
               Enfermero enfermero1 = new Enfermero();
               enfermero1.setRut(datos.getString("RUT"));
               enfermero1.setDv(datos.getString("DV"));
               enfermero1.setPriNombre(datos.getString("PRIMER_NOMBRE"));
               enfermero1.setSegNombre(datos.getString("SEGUNDO_NOMBRE"));
               enfermero1.setApellPat(datos.getString("APE_PATERNO"));
               enfermero1.setApellMat(datos.getString("APE_MATERNO"));
               enfermero1.setGenero(datos.getString("GENERO"));         
               enfermero1.setUniversidad(datos.getString("DONDE_ESTUDIO"));
  

               
               pacientes.add(enfermero1);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al recuperar datos del paciente");
        }
        return pacientes;
    }
        
        
           

    public void llenarPaciente(String rut, String dv, String primer_nombre, String segundo_nombre, 
            String ape_paterno, String ape_materno, String genero, String peso, String talla, String tipo_parto,
            String fallece, String fecha_nacimiento )
    {
        try 
        {            
            String consulta = "INSERT INTO paciente VALUES('"+rut+"','"+dv+"','"+primer_nombre+"','"+segundo_nombre+"','"+ape_paterno+"','"+ape_materno+"',"
                    + "'"+genero+"', '"+peso+"', '"+talla+"', '"+tipo_parto+"', '"+fallece+"', '"+fecha_nacimiento+"')";
            Statement instruccionBaseDatos = conexion.createStatement();
            instruccionBaseDatos.executeUpdate(consulta);
            JOptionPane.showMessageDialog(null, "Guardado Con Exito");
            
            
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Imposible Guardar Datos");
        }
    }
    
    public void fichaIngreso(String rut, String enfermero, String horaInicio, String estado, String otrasObservaciones )
    {
        
        try 
        {            
            String consulta = "INSERT INTO fichaingreso VALUES('"+rut+"','"+enfermero+"','"+horaInicio+"','"+estado+"','"+otrasObservaciones+"')";
            Statement instruccionBaseDatos = conexion.createStatement();
            instruccionBaseDatos.executeUpdate(consulta);
            JOptionPane.showMessageDialog(null, "Guardado Con Exito");
            
            
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Imposible Guardar Datos");
        }
        
        
    }
    public ArrayList<Ingreso> recuperarIngreso()
    {
        ArrayList<Ingreso> ingreso = new ArrayList<>();
        try 
        {
            String consulta = "SELECT * FROM fichaingreso";
            Statement instruccionBaseDatos = conexion.createStatement();
            ResultSet datos = instruccionBaseDatos.executeQuery(consulta);
            
            while(datos.next())
            {
               Ingreso ingresos1 = new Ingreso();
               ingresos1.setRut(datos.getString("RUT"));
               ingresos1.setEnfermero(datos.getString("ENFERMERO"));
               ingresos1.setHoraInicio(datos.getString("HORAINICIO"));
               ingresos1.setEstado(datos.getString("ESTADO"));
               ingresos1.setObservaciones(datos.getString("OTRASOBSERVACIONES"));
               
  

               
               ingreso.add(ingresos1);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al recuperar datos del paciente");
        }
        return ingreso;
    }
    
    
    
}
