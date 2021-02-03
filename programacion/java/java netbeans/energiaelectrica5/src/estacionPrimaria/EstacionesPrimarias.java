
package estacionPrimaria;
import java.util.ArrayList;
import java.util.Iterator;
import productoresBasicos.Hidroelectrica;
import productoresBasicos.Solar;
import productoresBasicos.Eolica;
import productoresBasicos.Termica;

public class EstacionesPrimarias {
    private String nombreEstacion;
    private int numTrasformadores;
    private ArrayList<productoresBasicos.Hidroelectrica> hidroelectrica;
    private ArrayList<productoresBasicos.Solar>solar;
    private ArrayList<productoresBasicos.Eolica>eolica;
    private ArrayList<productoresBasicos.Termica>termica;

    public EstacionesPrimarias(String nombreEstacion, int numTrasformadores) {
        this.nombreEstacion = nombreEstacion;
        this.numTrasformadores = numTrasformadores;
        this.hidroelectrica = new ArrayList<>();
        this.solar=new ArrayList<>();
        this.eolica=new ArrayList<>();
        this.termica=new ArrayList<>();
    }
 
 public void agregarEstacionH(Hidroelectrica p)
 {
     hidroelectrica.add(p);     
 }
 
 public void agregarEstacionS(Solar p)
 {
     solar.add(p);
 }
 public void agregarEstacionE(Eolica p)
 {
     eolica.add(p);
 }

 public void agregarEstacionT(Termica p)
 {
     termica.add(p);
 }
 public void eliminarEstacionH(Hidroelectrica p)
 {
     hidroelectrica.remove(p);    
 }
 
 public void eliminarEstacions(Solar p){
     solar.remove(p);
 }
 public void eliminarEstacionE(Eolica p)
 {
     eolica.remove(p);
 }
 public void eliminarEstacionT(Termica p)
 {
     termica.remove(p);
 }
 public void agregarEstacionH(Hidroelectrica[] Hidroelectrica)//arreglo
    {
        for (int i=0; i<Hidroelectrica.length; i++)//recorrer la lista
            this.hidroelectrica.add(Hidroelectrica[i]);//arraylist agrega los 
        //del arreglo
    }
 
 public void agregarEstacionS(Solar[] Solar)//arreglo
    {
        for (int i=0; i<Solar.length; i++)//recorrer la lista
            this.solar.add(Solar[i]);//arraylist agrega los 
        //del arreglo
    }
 
  public void agregarEstacionE(Eolica[] Eolica)//arreglo
    {
        for (int i=0; i<Eolica.length; i++)//recorrer la lista
            this.eolica.add(Eolica[i]);//arraylist agrega los 
        //del arreglo
    }
  
   public void agregarEstacionT(Termica[] Termica)//arreglo
    {
        for (int i=0; i<Termica.length; i++)//recorrer la lista
            this.termica.add(Termica[i]);//arraylist agrega los 
        //del arreglo
    }
 public void mostrarArregloyEstacionH()
    {
        Iterator<Hidroelectrica> iterador = hidroelectrica.iterator();
        int i = 1;
        while (iterador.hasNext())
        {
            Hidroelectrica p = iterador.next();
            System.out.println(
                    "nombre productor :"+p.getNombreProductor()+
                    "\nProduccion Promedio" +p.getProduccionPromedio()+
                    " kmh \n Produccion maxima :"+p.getProduccionMaxima()+
                    " \n Fecha de entrada:"+p.getFechaEntrada()+
                    "\n Area inundada:"+p.getAreaInundada()+"m2 de superficie"+
                    "\n capacidad Maxima:"+p.getCapacidadMaxima()+" m3"+
                    "\n numero de Turbinas :"+p.getNumeroTurbinas()+" Turbinas Disponibles"+"\n"
            
                    +"\nNombre Estacion:"+this.nombreEstacion
                    +"\nNumero de Transformadores:"+this.numTrasformadores+"\n\n");
                                                                                                
        }
    }

 
  public void mostrarArregloyEstacionS()
    {
        Iterator<Solar> iterador = solar.iterator();
        int i = 1;
        while (iterador.hasNext())
        {
            Solar p = iterador.next();
            System.out.println(
                    "nombre productor :"+p.getNombreProductor()+
                    "\nProduccion Promedio" +p.getProduccionPromedio()+
                    " kmh \n Produccion maxima :"+p.getProduccionMaxima()+
                    " \n Fecha de entrada:"+p.getFechaEntrada()+
                    "\n Promedio horas de sol:"+p.getPromedioHorasSol()+" "+
                    "\n Superficie Total:"+p.getSuperficieTotal()+" "+
                    "\n tipo:"+p.getTipo()+" "+"\n"
            
                    +"\nNombre Estacion:"+this.nombreEstacion
                    +"\nNumero de Transformadores:"+this.numTrasformadores+"\n\n");
                                                                                                
        }
    }
 
    public void mostrarArregloyEstacionE()
    {
        Iterator<Eolica> iterador = eolica.iterator();
        int i = 1;
        while (iterador.hasNext())
        {
            Eolica p = iterador.next();
            System.out.println(
                    "nombre productor :"+p.getNombreProductor()+
                    "\nProduccion Promedio" +p.getProduccionPromedio()+
                    " kmh \n Produccion maxima :"+p.getProduccionMaxima()+
                    " \n Fecha de entrada:"+p.getFechaEntrada()+
                    "\n numero de generadores eolicos:"+p.getNumGeneradoresEolicos()+" "+
                    "\n produccin promedio mensual de energia:"+p.getProduccionProm()+" "+
                    "\n superficie:"+p.getSuperficie()+" "+"\n"
            
                    +"\nNombre Estacion:"+this.nombreEstacion
                    +"\nNumero de Transformadores:"+this.numTrasformadores+"\n\n");
                                                                                                
        }
    }
    
        public void mostrarArregloyEstacionT()
    {
        Iterator<Termica> iterador = termica.iterator();
        int i = 1;
        while (iterador.hasNext())
        {
            Termica p = iterador.next();
            System.out.println(
                    "nombre productor :"+p.getNombreProductor()+
                    "\nProduccion Promedio" +p.getProduccionPromedio()+
                    " kmh \n Produccion maxima :"+p.getProduccionMaxima()+
                    " \n Fecha de entrada:"+p.getFechaEntrada()+
                    "\n numero de Hornos:"+p.getNumeroHornos()+" "+
                    "\n volumen de carbon consumido:"+p.getVolumenCarbonConsumudo()+" "+
                    "\n volumen de emision de gas:"+p.getVolumenEmisionGas()+" "+"\n"
            
                    +"\nNombre Estacion:"+this.nombreEstacion
                    +"\nNumero de Transformadores:"+this.numTrasformadores+"\n\n");
                                                                                                
        }
    }
        
   public int cantidadHodroelectricas(){
       return hidroelectrica.size();
   } 
 
}
