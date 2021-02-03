package modelo;

public class Cuerpos_celestes
{
	 private String  id_cuerpos_menores ;
	 private String   nombre ;
	 private int masa ;
	 private int tamano;
	 private String  id_estrella ;
	 private String  tipo_cuerpo_menor ;
	 
	public String getId_cuerpos_menores() {
		return id_cuerpos_menores;
	}
	public void setId_cuerpos_menores(String id_cuerpos_menores) {
		this.id_cuerpos_menores = id_cuerpos_menores;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMasa() {
		return masa;
	}
	public void setMasa(int masa) {
		this.masa = masa;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	public String getId_estrella() {
		return id_estrella;
	}
	public void setId_estrella(String id_estrella) {
		this.id_estrella = id_estrella;
	}
	public String getTipo_cuerpo_menor() {
		return tipo_cuerpo_menor;
	}
	public void setTipo_cuerpo_menor(String tipo_cuerpo_menor) {
		this.tipo_cuerpo_menor = tipo_cuerpo_menor;
	}
	 
	 

}
