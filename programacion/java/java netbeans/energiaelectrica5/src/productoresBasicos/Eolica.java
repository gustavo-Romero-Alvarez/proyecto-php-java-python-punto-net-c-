
package productoresBasicos;

public class Eolica extends ProductorBasico 
{
    private int numGeneradoresEolicos;
    private int produccionProm;
    private int superficie;

    public Eolica(int numGeneradoresEolicos, int produccionProm, int superficie, String nombreProductor, int produccionPromedio, int produccionMaxima, String fechaEntrada) {
        super(nombreProductor, produccionPromedio, produccionMaxima, fechaEntrada);
        this.numGeneradoresEolicos = numGeneradoresEolicos;
        this.produccionProm = produccionProm;
        this.superficie = superficie;
    }
    
    public Eolica(){
        
    }

    public int getNumGeneradoresEolicos() {
        return numGeneradoresEolicos;
    }

    public void setNumGeneradoresEolicos(int numGeneradoresEolicos) {
        this.numGeneradoresEolicos = numGeneradoresEolicos;
    }

    public int getProduccionProm() {
        return produccionProm;
    }

    public void setProduccionProm(int produccionProm) {
        this.produccionProm = produccionProm;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    
    
}
