using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using GustavoRomero.Models.Home;

namespace GustavoRomero.Controllers
{
    public class HomeController : Controller
    {
        //
        // GET: /Home/

        public ActionResult Index()
        {
            return View();
        }
        public ActionResult Conversion(FormCollection formulario)
        {
            int temperatura = int.Parse(formulario["temperatura"]);           
            int actividad1 = int.Parse(formulario["actividad1"]);
            int actividad2 = int.Parse(formulario["actividad2"]);
            ViewData["resultado"] = ConversionUnidades.ConvertirUnidad(temperatura,actividad1,actividad2);
       
            ViewData["final"] = actividad1;
            return View();
        }

    }
}
