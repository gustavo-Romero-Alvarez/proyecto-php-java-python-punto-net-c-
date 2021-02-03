using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace GustavoRomero.Models.Home
{
    public class ConversionUnidades
    {
        public static double ConvertirUnidad(int temperatura,int actividad1,int actividad2)
        {
            if (actividad1.Equals(2)&&actividad2.Equals(1))
                return (temperatura-32)/1.8;

            else if
            (actividad1.Equals(1) && actividad2.Equals(2))
                return ((1.8) *temperatura) +32;

            else if
           (actividad1.Equals(2) && actividad2.Equals(5))
                return (temperatura+459.67)/1.8;

            else if
            (actividad1.Equals(5) && actividad2.Equals(2))
                return temperatura*9/5-459.67;
              

            else if
            (actividad1.Equals(2) && actividad2.Equals(3))
                return temperatura + 459.67;

            else if
             (actividad1.Equals(3) && actividad2.Equals(2))
                return temperatura - 459.67;
            else if
            (actividad1.Equals(2) && actividad2.Equals(4))
                return (temperatura - 32) / 2.25;

            else
                return temperatura;



        }
    }
}