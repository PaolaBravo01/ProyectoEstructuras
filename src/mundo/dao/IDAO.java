package mundo.dao;

import mundo.db.Conexion;
import mundo.dto.ArtistasDTO;

public interface IDAO 
{
	
	public void insertar(Conexion con, ArtistasDTO artist);
	public void eliminar(Conexion con, ArtistasDTO artist);
	public void actualizar(Conexion con, ArtistasDTO artist);
	
	
	

}
