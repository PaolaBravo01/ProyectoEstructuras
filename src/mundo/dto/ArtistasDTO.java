package mundo.dto;

import java.io.Serializable;

public class ArtistasDTO implements IDTO, Serializable
{
	
	private static final long serialVersionUID = 4567897654L;

	private int idArtista;
	
	private String nombre;
	
	private String nombreReal;
	
	public ArtistasDTO()
	{
	}
	
	public ArtistasDTO(int pIdArtista, String pNombre, String pNombreReal)
	{
		super();

		idArtista = pIdArtista;
		nombre = pNombre;
		nombreReal = pNombreReal;
	}
	
	
	public int getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(int PIdArtista) {
		idArtista = PIdArtista;
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
		
		return "INSERT INTO ARTISTAS (ID, NOMBRE, NOMBRE_REAL) VALUES ("+ idArtista + ", '"+ nombre.trim()+"', '"+nombreReal.trim()+"')" ;
	}

	@Override
	public String eliminar() {
		return "delete from ARTISTAS where id = "+idArtista;
	}

	@Override
	public String actualizar() {
		return "UPDATE ARTISTAS SET ID = "+idArtista+",NOMBRE = '"+nombre.trim()+"',NOMBRE_REAL = '"+nombreReal.trim()+"' WHERE ID_ARTICULO = "+idArtista;
		
	}

	@Override
	public String consultar() {
		// TODO Auto-generated method stub
		return "select * from artistas where id = "+idArtista;
	}

	@Override
	public String consultarTodos() {
		// TODO Auto-generated method stub
		return "select * from artistas";
	}
	
	
	public String toString() {
		return "ArtistasDTO [ID=" + idArtista + ", NOMBRE=" + nombre + ", NOMBRE_REAL=" + nombreReal +"]";
	}

	
}
