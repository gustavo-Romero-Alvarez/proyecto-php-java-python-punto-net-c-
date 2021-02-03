
package pojo;

import java.util.ArrayList;

public class Neumatico 
{
    private int codigo;
    private int precio;
    private String tipo;
    private int stock;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String espacio(String aespaciar,int largo)
    {
        int caracteres;         
        String finalc;                                             
        caracteres=aespaciar.length();        
         //System.out.println("caracteres "+caracteres);                    
         ArrayList<String> al = new ArrayList<String>();                         
         al.clear();
          while (caracteres<=largo){
              caracteres=caracteres+1;
               al.add("-");
             }

         finalc=String.valueOf(al); 
         caracteres=finalc.length();          
         String nombreCambiado = finalc.replace(",", "");// System.out.println(nombreCambiado);
         String nombreCambiado2 =nombreCambiado.replace(" ", "");// System.out.println(nombreCambiado2);
         String nombreCambiado3 =nombreCambiado2.replace("]", ""); //System.out.println(nombreCambiado3);
         String nombreCambiado4 =nombreCambiado3.replace("[", "");
         String nombreCambiado5 =nombreCambiado4.replace('-', '_');   
        return nombreCambiado5;
    }
    
    @Override
    public String toString() {
        
    String codigo1,precio1,stock1;
    codigo1=espacio(String.valueOf(getCodigo()),10);
    precio1=espacio(String.valueOf(getPrecio()),10);
    stock1=espacio(String.valueOf(getStock()),10);
    

        return "" + " codigo = "+ codigo +codigo1 +"        precio   = " + precio + precio1+"           stock = " + stock +stock1+ "           tipo  =  " + tipo ;
    }
    
    
}
