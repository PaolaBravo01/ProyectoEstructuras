package mundo.contenedora;

import java.io.Serializable;

public class Mensaje implements Serializable
{
	
	private static final long serialVersionUID = 518405140372484957L;
	private Funcion funcion;
	private Tabla tabla;
	
	private int idArtista;
	private String nombre;
	private String nombreReal;
	
	private int idCancion;
	private String nombreCancion;
	private String nombreArtista;
	private int duracion;
	private String genero;
	
	public Mensaje()
	{
		
	}
	
	public void funcionArtistas(Funcion pFuncion, int pIDArtista, String pNombre, String pNombreReal)
	{
		tabla = Tabla.ARTISTAS;
		funcion = pFuncion;
		idArtista = pIDArtista;
		nombre = pNombre;
		nombreReal = pNombreReal;
	}
	
	public void funcionCanciones(Funcion pFuncion, int pIdCancion, String pNombreCancion, String pNombreArtista, int pDuracion, String pGenero)
	{
		tabla = Tabla.CANCIONES;
		funcion = pFuncion;
		idCancion = pIdCancion;
		nombreCancion = pNombreCancion;
		nombreArtista = pNombreArtista;
		duracion = pDuracion;
		genero = pGenero;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public Tabla getTabla() {
		return tabla;
	}

	public void setTabla(Tabla tabla) {
		this.tabla = tabla;
	}

	public int getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(int idArtista) {
		this.idArtista = idArtista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	public int getIdCancion() {
		return idCancion;
	}

	public void setIdCancion(int idCancion) {
		this.idCancion = idCancion;
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
