
package productoresBasicos;


public class Hidroelectrica extends ProductorBasico {
    
    private int areaInundada;
    private int capacidadMaxima;
    private int numeroTurbinas;

    public Hidroelectrica(int areaInundada, int capacidadMaxima, int numeroTurbinas, String nombreProductor, int produccionPromedio, int produccionMaxima, String fechaEntrada) {
        super(nombreProductor, produccionPromedio, produccionMaxima, fechaEntrada);
        this.areaInundada = areaInundada;
        this.capacidadMaxima = capacidadMaxima;
        this.numeroTurbinas = numeroTurbinas;
    }
    public Hidroelectrica(){
        
    }

    public int getAreaInundada() {
        return areaInundada;
    }

    public void setAreaInundada(int areaInundada) {
        this.areaInundada = areaInundada;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public void setNumeroTurbinas(int numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }

   

   
    
}
