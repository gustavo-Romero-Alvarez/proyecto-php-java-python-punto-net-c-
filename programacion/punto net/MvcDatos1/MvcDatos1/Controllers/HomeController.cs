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
            Usuario u =ConexionSQL.RecuperarUsuarioLinQ(formulario["usuario"])
            if (ConexionSQL.AutenticarUsuarioLinQ(formulario["usuario"], formulario["contrasenia"]))
            {
                return View(u);
            }
            else
                return View("Index");
           
          
        }

        public ActionResult Usuarios(FormCollection formulario)               
        {

            String usuario = (formulario["usuario"]);  
            ViewData["usuario"] =usuario;
           List<Usuario> usuarios = ConexionSQL.ObtenerUsuarios();
            return View(usuarios);          
        }

        public ActionResult Editar_usuario(String usuario)
        {

            Usuario u = ConexionSQL.RecuperarUsuarios(usuario);
            ViewData["usuario"] = usuario;                
            return View(u);
        }

        public ActionResult resultado(FormCollection formulario)
        {
            List<Usuario> usuarios = ConexionSQL.ObtenerUsuarios();
            String usuario = formulario["usuario"];
            String contrasenia = formulario["contrasenia"];
            String perfil = formulario["perfil"];
            String nombre = formulario["nombre"];
            String apellido = formulario["apellido"];

            if (ConexionSQL.actualizarUsuario(formulario["usuario"], formulario["contrasenia"], formulario["perfil"], formulario["nombre"], formulario["apellido"]).Equals(true))
            {
                ViewData["usuario"] = usuario;

                return View(usuarios);
            }
            else
                return View("index");
             
        }
    }
}
