
package pojo;

import java.util.ArrayList;


public class Paciente extends Persona
{
    private String genero;
    private int peso;
    private int talla;
    private String tipoParto;
    private String fallece;
    private String fechaNacimiento;

//    public Paciente(String rut, char dv, String priNombre, String segNombre, String apellPat, String apellMat)
//    {
//        super(rut, dv, priNombre, segNombre, apellPat, apellMat);
//    }

    public Paciente(String genero, int peso, int talla, String tipoParto, String fallece, String fechaNacimiento, String rut, String dv, String priNombre, String segNombre, String apellPat, String apellMat) {
        super(rut, dv, priNombre, segNombre, apellPat, apellMat);
        this.genero = genero;
        this.peso = peso;
        this.talla = talla;
        this.tipoParto = tipoParto;
        this.fallece = fallece;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
   public Paciente(){}
  

   

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipoParto() {
        return tipoParto;
    }

    public void setTipoParto(String tipoParto) {
        this.tipoParto = tipoParto;
    }

    public String getFallece() {
        return fallece;
    }

    public void setFallece(String fallece) {
        this.fallece = fallece;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
//        public String espacio(String aespaciar,int largo)
//    {
//        int caracteres;         
//        String finalc;                                             
//        caracteres=aespaciar.length();        
//         //System.out.println("caracteres "+caracteres);                    
//         ArrayList<String> al = new ArrayList<String>();                         
//         al.clear();
//          while (caracteres<=largo){
//              caracteres=caracteres+1;
//               al.add("-");
//             }
//
//         finalc=String.valueOf(al); 
//         caracteres=finalc.length();          
//         String nombreCambiado = finalc.replace(",", "");// System.out.println(nombreCambiado);
//         String nombreCambiado2 =nombreCambiado.replace(" ", "");// System.out.println(nombreCambiado2);
//         String nombreCambiado3 =nombreCambiado2.replace("]", ""); //System.out.println(nombreCambiado3);
//         String nombreCambiado4 =nombreCambiado3.replace("[", "");
//         String nombreCambiado5 =nombreCambiado4.replace('-', '_');   
//        return nombreCambiado5;
//    }
    
    
    @Override
    public String toString() 
    {
        return "  Paciente " + "genero =  " + genero + "  peso  = " + peso + "  talla  = " + talla + ", tipoParto=" + tipoParto + ", fallece=" + fallece + ", fechaNacimiento  =  " + fechaNacimiento + ' ';
    }
    
    
    
            
    
    
}
