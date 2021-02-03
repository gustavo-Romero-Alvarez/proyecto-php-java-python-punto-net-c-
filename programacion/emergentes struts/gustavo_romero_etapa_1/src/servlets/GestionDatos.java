package servlets;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import modelo.Usuario;

public class GestionDatos {

	private String cadenaConexion = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private Connection getConexion()
	{
		Connection cn = null;
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection(cadenaConexion,"alumno","alumno");
			System.out.println("Éxito");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Clase no encontrada");
		}
		catch (SQLException e) 
		{
			System.out.println("Error SQL");
		}
		return cn;
	}
	
	public void estadoConexion()
	{
		if( getConexion() != null )
			System.out.println("Conexión exitosa");
		else
			System.out.println("Conexión no lograda");
	}
	
		
	public boolean autenticarUsuario(String user, String pass, String tipo)
	{
		String consulta = "SELECT * FROM usuario WHERE usuario='"+user+"'"
				+ " AND contrasenia='"+pass+"' AND tipo='"+tipo+"'";
		Connection conexion = getConexion();
		try 
		{
			Statement instruccion = conexion.createStatement();
			ResultSet datos = instruccion.executeQuery(consulta);
			if(datos.next())
				return true;
			else
				return false;
		} 
		catch (SQLException e) 
		{
			return false;
		}
	}
	
	public Usuario getUsuario(String usuario)
	{
		String consulta = "SELECT * FROM usuario WHERE usuario='"+usuario+"'";
		Connection conexion = getConexion();
		Usuario u = new Usuario();
		try 
		{
			Statement instruccion = conexion.createStatement();
			ResultSet datos = instruccion.executeQuery(consulta);
			if(datos.next())
			{
				u.setUsuario(datos.getString("usuario"));
				u.setContrasenia(datos.getString("contrasenia"));
				u.setNombre(datos.getString("nombre"));
				u.setApellidos(datos.getString("apellidos"));
				u.setTipo(datos.getString("tipo"));
				
				return u;
			}
			return null;
		} 
		catch (SQLException e) 
		{
			return null;
		}
	}
	
	public void eliminarUsuario(String usuario)
	{
		 
		

		String consulta = "DELECT FROM usuario WHERE usuario='"+usuario+"'";
		Connection conexion = getConexion();
		
		try 
		{
			Statement instruccion = conexion.createStatement();
			instruccion.executeUpdate(consulta);
		
			
		} 
		catch (SQLException e) 
		{
		
		}
	}
	
	public void insertarUsuario(String usuario, String contrasenia,
			String nombre, String apellido, String tipo)
	{
		String consulta = "INSERT INTO usuario VALUES('"+usuario+"',"
				+"'"+contrasenia+"',"+"'"+nombre+"','"+apellido+"','"
				+tipo+"')";
		Connection conexion = getConexion();
		try 
		{
			Statement instruccion = conexion.createStatement();
			instruccion.executeUpdate(consulta);
		} 
		catch (SQLException e) 
		{
		}
	}
	
	public void insertarSistemaPlanetario(String id_sistema_planetario, String nombre)
	{
		String consulta = "INSERT INTO sistema_planetario VALUES('"+id_sistema_planetario+"',"
				+"'"+nombre+"')";
		Connection conexion = getConexion();
		try 
		{
			Statement instruccion = conexion.createStatement();
			instruccion.executeUpdate(consulta);
		} 
		catch (SQLException e) 
		{
		}
	}
	
	public void insertarEstrella(String id_estrella, String nombre, String id_sistema_planetario)
	{
		String consulta = "INSERT INTO estrella VALUES('"+id_estrella+"',"
				+"'"+nombre+"',"+"'"+id_sistema_planetario+"')";
		Connection conexion = getConexion();
		try 
		{
			Statement instruccion = conexion.createStatement();
			instruccion.executeUpdate(consulta);
		} 
		catch (SQLException e) 
		{
		}
	}
	
	public void insertarPlaneta(String id_planeta, String nombre,String simbologia,
		
			String diametro_ecuatorial,String masa,
			String radio_orbital,String periodo_orbital,String periodo_rotacion,String composicion_atmosfera,
			String imagen ,String id_estrella,String id_tipo)
	{
	

			
	
		String consulta = "INSERT INTO planeta VALUES('"+id_planeta+"',"
				+"'"+nombre+"',"+"'"+simbologia+"',"+diametro_ecuatorial+","+masa+","+radio_orbital+","+periodo_orbital+","+periodo_rotacion+",'"+composicion_atmosfera+"','"+imagen+"','"+id_estrella+"','"+id_tipo+"')";
				
		Connection conexion = getConexion();
		try 
		{
			Statement instruccion = conexion.createStatement();
			instruccion.executeUpdate(consulta);
		} 
		catch (SQLException e) 
		{
		}
	}
	
	public void insertarTipo(String id_tipo, String nombre)
	{
		String consulta = "INSERT INTO tipo VALUES('"+id_tipo+"',"
				+"'"+nombre+"')";
		Connection conexion = getConexion();
		try 
		{
			Statement instruccion = conexion.createStatement();
			instruccion.executeUpdate(consulta);
		} 
		catch (SQLException e) 
		{
		}
	}
	
	public ArrayList<Usuario> obtenerUsuarios()
	{
		ArrayList<Usuario> listado = new ArrayList<>();
		String consulta = "SELECT * FROM usuario";
		Connection conexion = getConexion();
		Usuario u = new Usuario();
		try 
		{
			Statement instruccion = conexion.createStatement();
			ResultSet datos = instruccion.executeQuery(consulta);
			while(datos.next())
			{
				u.setUsuario(datos.getString("usuario"));
				u.setContrasenia(datos.getString("contrasenia"));
				u.setNombre(datos.getString("nombre"));
				u.setApellidos(datos.getString("apellidos"));
				u.setTipo(datos.getString("tipo"));
				
				listado.add(u);
				u = new Usuario();
			}
			return listado;
		} 
		catch (SQLException e) 
		{
			return null;
		}
	}
	
	public void actualizarUsuario(Usuario u)
	{
		String usuario = u.getUsuario();
		String contrasenia = u.getContrasenia();
		String nombre = u.getNombre();
		String apellidos = u.getApellidos();
		String tipo = u.getTipo();
		
		String consulta = "UPDATE usuario SET contrasenia ='"+contrasenia+"',"
				+ ""+"nombre ='"+nombre+"',apellidos ='"+apellidos+"',"
				+" tipo ='"+tipo+"'WHERE usuario = '"+usuario+"'";
		
		Connection conexion = getConexion();
		
		try 
		{
			Statement instruccion = conexion.createStatement();
			instruccion.executeUpdate(consulta);
		} 
		
		catch (SQLException e) 
		{
		}
		
	}
	
	public void eliminarUsuario(Usuario u)
	{
		String usuario = u.getUsuario();
	
		String consulta = "DELETE FROM usuario WHERE usuario='"+usuario+"'";
		Connection conexion = getConexion();
		
		try 
		{
			Statement instruccion = conexion.createStatement();
			instruccion.executeUpdate(consulta);
		
			
		} 
		catch (SQLException e) 
		{
		
		}
		

		
	}

	
	public static void main(String args[])
	{
		ArrayList<Usuario> usuarios = new GestionDatos().obtenerUsuarios();
		Iterator<Usuario> listado = usuarios.iterator();
		while( listado.hasNext() )
		{
			Usuario u = listado.next();
			System.out.print(u.getUsuario()+" ");
			System.out.print(u.getContrasenia()+" ");
			System.out.print(u.getNombre()+" ");
			System.out.print(u.getApellidos()+" ");
			System.out.print(u.getTipo());
			System.out.println();
		}
	}
}
