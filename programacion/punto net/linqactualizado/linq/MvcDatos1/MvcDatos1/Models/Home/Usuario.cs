using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace MvcDatos1.Models.Home
{
    public class Usuario
    {
        public String usuario { get; set; }
        public String contrasenia { get; set; }
        public String nombre { get; set; }
        public String apellido { get; set; }
        public String perfil { get; set; }
    }
}