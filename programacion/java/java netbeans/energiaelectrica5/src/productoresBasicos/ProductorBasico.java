
package productoresBasicos;


public class ProductorBasico {
    private String nombreProductor;
    private int produccionPromedio;
    private int produccionMaxima;
    private String fechaEntrada;

    public ProductorBasico(String nombreProductor, int produccionPromedio, int produccionMaxima, String fechaEntrada) {
        this.nombreProductor = nombreProductor;
        this.produccionPromedio = produccionPromedio;
        this.produccionMaxima = produccionMaxima;
        this.fechaEntrada = fechaEntrada;
    }

  
    
    public ProductorBasico(){
        
    }

    public int getProduccionPromedio() {
        return produccionPromedio;
    }

    public void setProduccionPromedio(int produccionPromedio) {
        this.produccionPromedio = produccionPromedio;
    }

    public int getProduccionMaxima() {
        return produccionMaxima;
    }

    public void setProduccionMaxima(int produccionMaxima) {
        this.produccionMaxima = produccionMaxima;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getNombreProductor() {
        return nombreProductor;
    }

    public void setNombreProductor(String nombreProductor) {
        this.nombreProductor = nombreProductor;
    }

    
    @Override
    public String toString() {
        return "ProductorBasico{" + "produccionPromedio=" + produccionPromedio + 
                ", produccionMaxima=" + produccionMaxima + ", fechaEntrada=" + fechaEntrada + '}';
    }
    
    
    
}
