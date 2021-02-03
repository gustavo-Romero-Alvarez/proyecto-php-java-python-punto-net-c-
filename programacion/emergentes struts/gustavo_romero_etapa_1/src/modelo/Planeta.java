package modelo;

public class Planeta 
{
	 private String  id_planeta ;
	 private String   nombre ;
	 private String    simbologia ;
	 private int  diametro_ecuatorial ;
	 private int  masa ;
	 private int  radio_orbital;
	 private int  periodo_orbital;
	 private int   periodo_rotacion ;
	 private String   composicion_atmosfera;
	 private String   imagen ;
	 private String  id_estrella;
	 private String  id_tipo ;
	 
	public String getId_planeta() {
		return id_planeta;
	}
	public void setId_planeta(String id_planeta) {
		this.id_planeta = id_planeta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSimbologia() {
		return simbologia;
	}
	public void setSimbologia(String simbologia) {
		this.simbologia = simbologia;
	}
	public int getDiametro_ecuatorial() {
		return diametro_ecuatorial;
	}
	public void setDiametro_ecuatorial(int diametro_ecuatorial) {
		this.diametro_ecuatorial = diametro_ecuatorial;
	}
	public int getMasa() {
		return masa;
	}
	public void setMasa(int masa) {
		this.masa = masa;
	}
	public int getRadio_orbital() {
		return radio_orbital;
	}
	public void setRadio_orbital(int radio_orbital) {
		this.radio_orbital = radio_orbital;
	}
	public int getPeriodo_orbital() {
		return periodo_orbital;
	}
	public void setPeriodo_orbital(int periodo_orbital) {
		this.periodo_orbital = periodo_orbital;
	}
	public int getPeriodo_rotacion() {
		return periodo_rotacion;
	}
	public void setPeriodo_rotacion(int periodo_rotacion) {
		this.periodo_rotacion = periodo_rotacion;
	}
	public String getComposicion_atmosfera() {
		return composicion_atmosfera;
	}
	public void setComposicion_atmosfera(String composicion_atmosfera) {
		this.composicion_atmosfera = composicion_atmosfera;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getId_estrella() {
		return id_estrella;
	}
	public void setId_estrella(String id_estrella) {
		this.id_estrella = id_estrella;
	}
	public String getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(String id_tipo) {
		this.id_tipo = id_tipo;
	}
	   
	   

}
