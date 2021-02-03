
package pojo;


public class Persona 
{
    private String rut;
    private String dv;
    private String priNombre;
    private String segNombre;
    private String apellPat;
    private String apellMat;

    public Persona(String rut, String dv, String priNombre, String segNombre, String apellPat, String apellMat) {
        this.rut = rut;
        this.dv = dv;
        this.priNombre = priNombre;
        this.segNombre = segNombre;
        this.apellPat = apellPat;
        this.apellMat = apellMat;
    }

    public Persona(){}
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getPriNombre() {
        return priNombre;
    }

    public void setPriNombre(String priNombre) {
        this.priNombre = priNombre;
    }

    public String getSegNombre() {
        return segNombre;
    }

    public void setSegNombre(String segNombre) {
        this.segNombre = segNombre;
    }

    public String getApellPat() {
        return apellPat;
    }

    public void setApellPat(String apellPat) {
        this.apellPat = apellPat;
    }

    public String getApellMat() {
        return apellMat;
    }

    public void setApellMat(String apellMat) {
        this.apellMat = apellMat;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", dv=" + dv + ", priNombre=" + priNombre + ", segNombre=" + segNombre + ", apellPat=" + apellPat + ", apellMat=" + apellMat + '}';
    }
    
    
}
