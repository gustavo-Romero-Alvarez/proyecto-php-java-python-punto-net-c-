
package energiaelectrica5;

import productoresBasicos.Hidroelectrica;
import estacionPrimaria.EstacionesPrimarias;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Energiaelectrica5 {

 
    public static void main(String[] args) {
        
        InputStreamReader entrada =new  InputStreamReader(System.in);
        BufferedReader lectura =new BufferedReader(entrada);
        //1 hidroelectrica
        productoresBasicos.Hidroelectrica p1=new Hidroelectrica();
        p1.setNombreProductor("hidroelectrica :");
        p1.setProduccionPromedio(12);
        p1.setProduccionMaxima(12);
        p1.setFechaEntrada("12 de marzo 2015");
        p1.setAreaInundada(12);
        p1.setCapacidadMaxima(12);
        p1.setNumeroTurbinas(12);
        //2 hidroelectrica
        productoresBasicos.Hidroelectrica p2=new Hidroelectrica();
        p2.setNombreProductor("hidroelectrica :");
        p2.setProduccionPromedio(13);
        p2.setProduccionMaxima(13);
        p2.setFechaEntrada("13 de marzo 2015");
        p2.setAreaInundada(13);
        p2.setCapacidadMaxima(13);
        p2.setNumeroTurbinas(13);
        
        estacionPrimaria.EstacionesPrimarias  estacion= new EstacionesPrimarias ("estacion a",1);
        
        estacion.agregarEstacionH(p1);  
        estacion.mostrarArregloyEstacionH();
        
        estacionPrimaria.EstacionesPrimarias  estacion2= new EstacionesPrimarias ("estacion b",2);
        estacion2.agregarEstacionH(p2);  
        estacion2.mostrarArregloyEstacionH();
        
        System.out.println("cantidad de hidroelectricas en la primera estacion:"+estacion.cantidadHodroelectricas());
        
        
        
         System.out.println("cantidad de hidroelectricas en la segunda estacion estacion:"+estacion2.cantidadHodroelectricas());
        estacion2.cantidadHodroelectricas();
    
    }
    
}
