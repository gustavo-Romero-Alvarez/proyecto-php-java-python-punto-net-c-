
package productoresBasicos;


public class Solar extends ProductorBasico{
    private int superficieTotal;
    private int promedioHorasSol;
    private String tipo;

    public Solar(int superficieTotal, int promedioHorasSol, String tipo, String nombreProductor, int produccionPromedio, int produccionMaxima, String fechaEntrada) {
        super(nombreProductor, produccionPromedio, produccionMaxima, fechaEntrada);
        this.superficieTotal = superficieTotal;
        this.promedioHorasSol = promedioHorasSol;
        this.tipo = tipo;
    }
    public Solar(){
        
    }

    public int getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(int superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    public int getPromedioHorasSol() {
        return promedioHorasSol;
    }

    public void setPromedioHorasSol(int promedioHorasSol) {
        this.promedioHorasSol = promedioHorasSol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
