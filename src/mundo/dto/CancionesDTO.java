package mundo.dto;

import java.io.Serializable;

public class CancionesDTO implements IDTO, Serializable {
	
	private static final long serialVersionUID = 5063886785530634323L;

	private int idCancion;
	
	private String nombre;
	
	private String nomArtista;
	
	private int duracion;
	
	private String genero;
	
	
	public CancionesDTO()
	{
	}
	
	public CancionesDTO(int pId, String pNombre, String pNombreArtista, int pDuracion, String pGenero )
	{
		super();

		idCancion = pId;
		nombre = pNombre;
		nomArtista = pNombreArtista;
		duracion = pDuracion;
		genero = pGenero;	
	}
	
		
	public int getIdCancion() {
		return idCancion;
	}

	public void setIdCancion(int pIdCancion) {
		idCancion = pIdCancion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNombre) {
		nombre = pNombre;
	}

	public String getNomArtista() {
		return nomArtista;
	}

	public void setNomArtista(String pNombreArtista) {
		nomArtista = pNombreArtista;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int pDuracion) {
		duracion = pDuracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String pGenero) {
		genero = pGenero;
	}

	@Override
	public String insertar() {
		return "INSERT INTO CANCIONES (ID_CANCION, NOMBRE, NOM_ARTISTA, DURACION, GENERO) VALUES ("+ idCancion+ ", '"+nombre.trim()+"', '"+nomArtista.trim()+ "', "+ duracion+", '"+genero.trim()+"' )";
	}

	@Override
	public String eliminar() {
		return "DELETE FROM CANCIONES WHERE ID_CANCION = " +idCancion;
	}

	@Override
	public String actualizar() {
		return "UPDATE CANCIONES SET ID_CANCION = "+idCancion+",NOMBRE = '"+nombre.trim()+"', NOM_ARTISTA = '"+nomArtista.trim()+"', DURACION = "+duracion+", GENERO = '"+genero.trim()+"' WHERE ID_CANCION = "+idCancion;
	}

	@Override
	public String consultar() {
		return "Select ID_CANCION, NOMBRE, NOM_ARTISTA, DURACION, GENERO FROM CANCIONES WHERE ID_CANCION = " +idCancion;
		
	}

	@Override
	public String consultarTodos() {
		return "select * from canciones";
	}


	public String toString() 
	{
		return "Canciones:" + "\n" + "ID = " + idCancion + "\nNombre = " + nombre +"\nNombre Artista = " + nomArtista + "\nDuracion = " + duracion + "\nGenero = "+genero +"\n " +"/---------------------------------------\\";
	}
}
