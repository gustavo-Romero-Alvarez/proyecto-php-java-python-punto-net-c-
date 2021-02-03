
package productoresBasicos;


public class Termica extends ProductorBasico 
{
    private int numeroHornos;
    private float volumenCarbonConsumudo;
    private  float volumenEmisionGas;

    public Termica(int numeroHornos, float volumenCarbonConsumudo, float volumenEmisionGas, String nombreProductor, int produccionPromedio, int produccionMaxima, String fechaEntrada) {
        super(nombreProductor, produccionPromedio, produccionMaxima, fechaEntrada);
        this.numeroHornos = numeroHornos;
        this.volumenCarbonConsumudo = volumenCarbonConsumudo;
        this.volumenEmisionGas = volumenEmisionGas;
    }
    public Termica(){
        
    }

    public int getNumeroHornos() {
        return numeroHornos;
    }

    public void setNumeroHornos(int numeroHornos) {
        this.numeroHornos = numeroHornos;
    }

    public float getVolumenCarbonConsumudo() {
        return volumenCarbonConsumudo;
    }

    public void setVolumenCarbonConsumudo(float volumenCarbonConsumudo) {
        this.volumenCarbonConsumudo = volumenCarbonConsumudo;
    }

    public float getVolumenEmisionGas() {
        return volumenEmisionGas;
    }

    public void setVolumenEmisionGas(float volumenEmisionGas) {
        this.volumenEmisionGas = volumenEmisionGas;
    }
    
    
}
