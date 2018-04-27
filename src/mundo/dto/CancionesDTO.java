package mundo.dto;


public class CancionesDTO implements IDTO {
	
	private int idCancion;
	
	private String nombre;
	
	private String nombreArtista;
	
	private int duracion;
	
	private String genero;
	
	
	public CancionesDTO()
	{
		super();
	}
	
	public CancionesDTO(int pId, String pNombre, String pNombreArtista, int pDuracion, String pGenero )
	{
		idCancion = pId;
		nombre = pNombre;
		nombreArtista = pNombreArtista;
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

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String pNombreArtista) {
		nombreArtista = pNombreArtista;
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
		return "INSERT INTO CANCIONES (ID, NOMBRE, NOMB_ARTISTA, DURACION, GENERO) VALUES ("+ idCancion+ ", '"+nombre.trim()+"', '"+nombreArtista.trim()+ "', "+ duracion+", '"+genero.trim()+"' )";
	}

	@Override
	public String eliminar() {
		return  "delete from CANCIONES where id = "+idCancion;
	}

	@Override
	public String actualizar() {
		return "UPDATE CANCIONES SET GENERO = '"
				+genero.trim()+"' WHERE ID = "+idCancion;
	}

	@Override
	public String consultarPorID() {
		return "select * from canciones where id = "+idCancion;
	}

	@Override
	public String consultarTodos() {
		return "select * from canciones";
	}


	public String toString() 
	{
		return "CancionesDTO [ID=" + idCancion + ", NOMBRE=" + nombre + ", NOM_ARTISTA=" + nombreArtista +" DURACION="+ duracion+", GENERO="+ genero +" ]";
	}
}
