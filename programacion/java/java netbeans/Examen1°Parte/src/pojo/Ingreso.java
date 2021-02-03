package pojo;

public class Ingreso 

{
    private String rut;
    private String enfermero;
    private String horaInicio;
    private String estado;
    private String observaciones;

    public Ingreso(String rut, String enfermero, String horaInicio, String estado, String observaciones) {
        this.rut = rut;
        this.enfermero = enfermero;
        this.horaInicio = horaInicio;
        this.estado = estado;
        this.observaciones = observaciones;
    }
    
    public Ingreso(){}

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(String enfermero) {
        this.enfermero = enfermero;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return " " + " rut = " + rut + "  enfermero  = " + enfermero + "  horaInicio  " + horaInicio + "  estado  = " + estado + "  observaciones = " + observaciones + ' ';
    }
    
    
    
}

