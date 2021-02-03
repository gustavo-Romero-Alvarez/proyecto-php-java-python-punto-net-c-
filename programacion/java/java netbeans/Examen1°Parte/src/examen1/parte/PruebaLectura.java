/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1.parte;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javax.swing.JFrame;

public class PruebaLectura {

    private  String pathArchivo="C:\\Users\\gustavo\\Desktop\\examenes nacionales\\java\\Examen1°Parte\\validacion.txt";
    private  File archivo;
    private  FileReader lector;
    
    
    private  InputStreamReader leer;
    private  BufferedReader  leerMemoria;
    private  BufferedReader memoria;
   
    public String devolverTraduccion(String palabra,String traducion)   
    {
        String resultado;
        resultado="0";
        try 
        {
            leer=new InputStreamReader(System.in);
            leerMemoria=new BufferedReader(leer); 
            
            archivo = new File(pathArchivo);
            lector = new FileReader(archivo);
            memoria= new BufferedReader(lector);
            String linea;
           
            
            while((linea=memoria.readLine()) != null)
            {                            
               StringTokenizer token=new StringTokenizer(linea,"-");
                String  español=token.nextToken();
                String  mapudungun=token.nextToken();
   
                if (español.equals(palabra) && mapudungun.equals(traducion))
                {
                   
                     
                     new Ventana1().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     resultado="1";
                    
                
                }              
           
        }
                     
        } catch (FileNotFoundException ex) {
            System.out.println("problema al leer el archivo"+pathArchivo);
      
        } catch (IOException ex) {
           System.out.println("problema al rescatar una linea del archivo"+pathArchivo) ;
        }
        
                     
    
    return resultado;
    }
}
