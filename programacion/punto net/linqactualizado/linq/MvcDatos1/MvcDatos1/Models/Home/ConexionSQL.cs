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
        //Clase LinQ
        static DatosSqlDataContext contexto = new DatosSqlDataContext();    

        
    
        //LinQ

        public static bool AutenticarUsuarioLinQ(string usuario, string contrasenia)//buscar y comparar datos
        {
            //Expresion para autenticar
            var consulta = from user in contexto.usuario
                           where user.usuario1 == usuario &&
                           user.contrasenia == contrasenia
                           select user;
            if (consulta.ToList().Count == 1)
                return true;
            else
                return false;
        }

        public static Usuario ObtenerUsuarioLinQ(string usuario)//rescatar datos
        {
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

        }

        public static List<Usuario> ObtenerUsuariosLinQ()
        {
            var consulta = from user in contexto.usuario select user;
            var resultado = consulta.ToList();

            List<Usuario> ListaUsuarios = new List<Usuario>();
            Usuario u = new Usuario();

            foreach(var usuario in resultado)//Recorrer lista
            {
                u.usuario = usuario.usuario1;
                u.perfil = usuario.perfil;
                u.nombre = usuario.nombre;
                u.apellido = usuario.apellido;

                ListaUsuarios.Add(u);
                u = new Usuario();
            }
            return ListaUsuarios;

        }

        public static void ActualizarUsuario(Usuario u)
        {
            var consulta = from usuario in contexto.usuario
                           where usuario.usuario1 == u.usuario
                           select usuario ;

            var us = consulta.Single();
            us.perfil = u.perfil;
            us.nombre = u.nombre;
            us.apellido = u.apellido;          
            contexto.SubmitChanges();
            return;
        }
        public static void InsertarUsuarioLinq(Usuario u)
        {
           usuario us = new usuario();
            us.usuario1 = u.usuario;
            us.contrasenia = u.contrasenia;
            us.perfil = u.perfil;
            us.nombre = u.nombre;
            us.apellido = u.apellido;
            contexto.usuario.InsertOnSubmit(us);
            contexto.SubmitChanges();
        }

        public static void EliminarUsuarioLinq(Usuario u)
        {
            var consulta = from usuario in contexto.usuario
                           where usuario.usuario1 == u.usuario
                           select usuario;



            foreach (var detail in consulta)
            {
                contexto.usuario.DeleteOnSubmit(detail);
            }

            try
            {
                contexto.SubmitChanges();
            }
            catch (Exception e)
            {
                Console.WriteLine("error");
                // Provide for exceptions.
            }
            return;
        }
    }
}