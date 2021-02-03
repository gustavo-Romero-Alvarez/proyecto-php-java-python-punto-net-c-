using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using MvcDatos1.Models.Home;

namespace MvcDatos1.Controllers
{
    public class HomeController : Controller
    {
        //
        // GET: /Home/

        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Home(FormCollection formulario) 
        {
            if (ConexionSQL.AutenticarUsuarioLinQ (formulario["usuario"], formulario["contrasenia"]))
            {
                Usuario u = ConexionSQL.ObtenerUsuarioLinQ(formulario["usuario"]);
                return View(u);
            }
            else
                return View("index");
        }

        public ActionResult Usuarios()
        {
            return View(ConexionSQL.ObtenerUsuariosLinQ());
        }

        public ActionResult Editar_usuario(String usuario)
        {
            Usuario u = ConexionSQL.ObtenerUsuarioLinQ(usuario);
            return View(u);
        }

        public ActionResult Actualizar_usuario(FormCollection formulario)
        {
            Usuario u = new Usuario();
            u.usuario = formulario["usuario"];
            u.perfil = formulario["perfil"];
            u.nombre = formulario["nombre"];
            u.apellido = formulario["apellido"];

            ConexionSQL.ActualizarUsuario(u);
            List<Usuario> usuarios = ConexionSQL.ObtenerUsuariosLinQ();

     
            return View("Usuarios",usuarios);
        }

        public ActionResult Insertar_usuario(FormCollection formulario)
        {
            if (formulario["usuario"] == null)
            {
               return View();
            }
            else
            {

                Usuario u = new Usuario();
                u.usuario = formulario["usuario"];
                u.contrasenia = formulario["contrasenia"];
                u.perfil = formulario["perfil"];
                u.nombre = formulario["nombre"];
                u.apellido = formulario["apellido"];
                ConexionSQL.InsertarUsuarioLinq(u);
                List<Usuario> usuarios = ConexionSQL.ObtenerUsuariosLinQ();
                return View("Usuarios",usuarios);
            }
                
        }
        public ActionResult Eliminar_usuario() 
        {
            return View(ConexionSQL.ObtenerUsuariosLinQ());
        }

        public ActionResult Eliminar_finalizar(String usuario)
        {
            Usuario u = ConexionSQL.ObtenerUsuarioLinQ(usuario);
            return View(u);
        }

        public ActionResult Actualizar_usuario2(FormCollection formulario)
        {
            Usuario u = new Usuario();
            u.usuario = formulario["usuario"];
            u.perfil = formulario["perfil"];
            u.nombre = formulario["nombre"];
            u.apellido = formulario["apellido"];

            ConexionSQL.EliminarUsuarioLinq(u);
            List<Usuario> usuarios = ConexionSQL.ObtenerUsuariosLinQ();


            return View("Usuarios", usuarios);
        }
        
    }
}
