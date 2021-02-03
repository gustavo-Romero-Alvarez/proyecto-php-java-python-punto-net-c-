using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

using Primera_entrega.Models;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Primera_entrega.Models.Home;


namespace Primera_entrega.Controllers
{
    public class HomeController : Controller
    {
        //
        // GET: /Home/

        public ActionResult Index()
        {
            return View();
        }
        public ActionResult Estaciones()
        {
            return View();
        }
        public ActionResult Productores()
        {
            return View();
        }
        public ActionResult EnergiaElectrica()
        {
            return View();
        }

        public ActionResult RedDeTransmision()
        {
            return View();
        }
        public ActionResult LineaDeTransmision()
        {
            return View();
        }

        public ActionResult EstadoProductor()
        {
            return View();
        }

        public ActionResult VolumenDeProduccion()
        {
            return View();
        }

        public ActionResult Home2()
        {
            return View();
        }

        public ActionResult Monitorear()
        {
            return View();
        }


        public ActionResult Home(FormCollection formulario)
        {


            if (ConexionSQL.AutenticarUsuarioLinQ(formulario["usuario"], formulario["contrasenia"]))
            {
                String tipo = formulario["tipo"];

                if (tipo == "Administrador")
                {
                    Usuario u = ConexionSQL.ObtenerUsuarioLinQ(formulario["usuario"]);
                    return View(u);
                }
                if (tipo == "Usuario")
                {
                    return View("Home2");
                }
                else
                    return View("index");

            }
            else
            {
                return View("index");
            }
        }
    }
   }

