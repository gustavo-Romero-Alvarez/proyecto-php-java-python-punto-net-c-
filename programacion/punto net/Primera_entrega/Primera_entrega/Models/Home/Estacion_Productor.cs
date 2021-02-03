using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Primera_entrega.Models.Home
{
    public class Estacion_Productor
    {
        public Productor productor { get; set; }
        public Estacion_Productor nombreEstacion { get; set; }
        public string fecha { get; set; }
        public int cantidadProductores { get; set; }
    }
}