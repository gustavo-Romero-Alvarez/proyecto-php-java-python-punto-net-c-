using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

using System.Data.SqlClient;
using System.Configuration;

namespace MvcDatos1.Models.Home
{
    public class ConexionSQL
    {
        //Clase linQ
        static DatosSQLDataContext contexto = new DatosSQLDataContext();
        public static SqlConnection ObtenerConexion()
        {
            String CadenaConexion = ConfigurationManager.ConnectionStrings["conexionSQL"].ConnectionString;
            return new SqlConnection(CadenaConexion);
        }

        public static bool AutenticarUsuario(String usuario, String contrasenia) 
        {
            
        }

        public static Usuario RecuperarUsuario(String usuario) 
        {
            SqlConnection conexion = ObtenerConexion();
            SqlCommand Instruccion = new SqlCommand();

            String Consulta = "SELECT*FROM usuario WHERE usuario='" + usuario + " ' ";
            Instruccion.CommandText = Consulta;
        
            Instruccion.Connection = conexion;

            conexion.Open();
            SqlDataReader datos = Instruccion.ExecuteReader();

            if (datos.HasRows && datos.Read())
            {
                Usuario u = new Usuario();
                u.usuario = datos.GetString(0);
                u.perfil = datos.GetString(2);                              
                u.nombre=datos.GetString(3);
                u.apellido=datos.GetString(4);
                //u.contrasenia = datos.GetString(4);
                

                return u;
            }
            return null;
              
           
        }
        public static Usuario RecuperarUsuarios(String usuario)
        {
            SqlConnection conexion = ObtenerConexion();
            SqlCommand Instruccion = new SqlCommand();

            String Consulta = "SELECT*FROM usuario WHERE usuario='" + usuario + " ' ";
            Instruccion.CommandText = Consulta;

            Instruccion.Connection = conexion;

            conexion.Open();
            SqlDataReader datos = Instruccion.ExecuteReader();

            if (datos.HasRows && datos.Read())
            {
                Usuario u = new Usuario();
                u.usuario = datos.GetString(0);
                u.contrasenia = datos.GetString(1);             
                u.perfil = datos.GetString(2);
                u.nombre = datos.GetString(3);
                u.apellido = datos.GetString(4);
                
                //u.contrasenia = datos.GetString(4);


                return u;
            }
            return null;


        }
        public static List<Usuario> ObtenerUsuarios()
        {
            
        }


         public static bool actualizarUsuario(String usuario,String contrasenia,String perfil,String nombre,String apellido)
        {
            SqlConnection conexion = ObtenerConexion();
            	String consulta = "UPDATE usuario SET contrasenia ='"+contrasenia+"',"
				+ ""+"perfil ='"+perfil+"',nombre ='"+nombre+"',"
				+" apellido ='"+apellido+"'WHERE usuario = '"+usuario+"'";
            SqlCommand command = new SqlCommand(consulta, conexion);
            command.Connection.Open();
            command.ExecuteNonQuery();


            
        
            return true;
            

        }


         public static bool AutenticarUsuarioLinQ(String usuario, string contrasenia)
         {
             //expresion para autenticar
             var consulta = from user in contexto.usuario
                            where user.usuario1 == usuario &&
                            user.contrasenia == contrasenia
                            select user;

             if (consulta.ToList().Count == 1)
             {
                 return true;
             }
             else
                 return false;
         }

         public static Usuario RecuperarUsuarioLinQ(String usuario)
         {
             SqlConnection conexion = ObtenerConexion();
             SqlCommand Instruccion = new SqlCommand();

             var consulta = from user in contexto.usuario
                            where user.usuario1 == usuario
                            select user;

             var resultado = consulta.ToList().Single();
             Usuario u = new Usuario();
             u.usuario = resultado.usuario1;
             u.perfil = resultado.perfil;
             u.nombre = resultado.nombre;
             u.apellido = resultado.apellido;

             return u;
               
             if(consulta.ToList){}
                            
             String Consulta = "SELECT*FROM usuario WHERE usuario='" + usuario + " ' ";
             Instruccion.CommandText = Consulta;

             Instruccion.Connection = conexion;

             conexion.Open();
             SqlDataReader datos = Instruccion.ExecuteReader();

             if (datos.HasRows && datos.Read())
             {
                 Usuario u = new Usuario();
                 u.usuario = datos.GetString(0);
                 u.perfil = datos.GetString(2);
                 u.nombre = datos.GetString(3);
                 u.apellido = datos.GetString(4);
                 //u.contrasenia = datos.GetString(4);


                 return u;
             }
             return null;


         }

         public static Usuario RecuperarUsuario(String usuario)
         {
             SqlConnection conexion = ObtenerConexion();
             SqlCommand Instruccion = new SqlCommand();

             String Consulta = "SELECT*FROM usuario WHERE usuario='" + usuario + " ' ";
             Instruccion.CommandText = Consulta;

             Instruccion.Connection = conexion;

             conexion.Open();
             SqlDataReader datos = Instruccion.ExecuteReader();

             if (datos.HasRows && datos.Read())
             {
                 Usuario u = new Usuario();
                 u.usuario = datos.GetString(0);
                 u.perfil = datos.GetString(2);
                 u.nombre = datos.GetString(3);
                 u.apellido = datos.GetString(4);
                 //u.contrasenia = datos.GetString(4);


                 return u;
             }
             return null;


         }

    }
}