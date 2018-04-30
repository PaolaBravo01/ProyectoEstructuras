package mundo.dto;

import java.io.Serializable;

public class ArtistasDTO implements IDTO, Serializable
{
	
	private static final long serialVersionUID = 4567897654L;

	private int id;
	
	private String nombre;
	
	private String nombreReal;
	
	public ArtistasDTO()
	{	
		
	}
	
	public ArtistasDTO(int pIdArtista, String pNombre, String pNombreReal)
	{
		super();

		id = pIdArtista;
		nombre = pNombre;
		nombreReal = pNombreReal;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int PIdArtista) {
		id = PIdArtista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNombre) {
		nombre = pNombre;
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String pNombreReal) {
		nombreReal = pNombreReal;
	}

	@Override
	public String insertar() {
		
		return "INSERT INTO ARTISTAS (ID, NOMBRE, NOMBRE_REAL) VALUES ("+ id + ", '"+ nombre.trim()+"', '"+nombreReal.trim()+"')" ;
	}

	@Override
	public String eliminar() {
		return "delete from ARTISTAS where id = "+id;
	}

	@Override
	public String actualizar() {
		return "UPDATE ARTISTAS SET ID = "+id+",NOMBRE = '"+nombre.trim()+"',NOMBRE_REAL = '"+nombreReal.trim()+"' WHERE ID = "+id;
		
	}

	@Override
	public String consultar() {
		return "SELECT ID, NOMBRE, NOMBRE_REAL FROM ARTISTAS WHERE ID ="+id;
	}

	@Override
	public String consultarTodos() {
		return "SELECT * FROM ARTISTAS";
	}
	
	
	public String toString() {
		return "Artista:" + "\n" + "ID = "+ id +"\n  Nombre = " + nombre +"\n  Nombre Real = "+ nombreReal + "\n \n" ;
	}

	
}
