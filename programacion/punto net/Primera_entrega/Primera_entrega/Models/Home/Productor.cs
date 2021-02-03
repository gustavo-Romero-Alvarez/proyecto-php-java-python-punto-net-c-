using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Primera_entrega.Models.Home
{
    public class Productor
    {
        public string nombreProductor { get; set; }
        public double produccionPromedio { get; set; }
        public double produccionMaxima { get; set; }
        public string fechaInicio { get; set; }
        public string tipo { get; set; }
    }
}