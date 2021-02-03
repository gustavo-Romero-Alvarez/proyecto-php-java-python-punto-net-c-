
package pojo;


public class Enfermero extends Persona
{
    private String universidad;
     private String genero;



    public Enfermero(String universidad, String genero, String rut, String dv, String priNombre, String segNombre, String apellPat, String apellMat) {
        super(rut, dv, priNombre, segNombre, apellPat, apellMat);
        this.universidad = universidad;
        this.genero = genero;
    }

 

    public Enfermero(){}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Enfermero " + "universidad=" + universidad + ' ';
    }
    
    
    
}
