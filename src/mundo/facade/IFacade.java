package mundo.facade;

import mundo.db.Conexion;
import mundo.dto.ArtistasDTO;

public interface IFacade 
{
	
	public void insertar(Conexion con, ArtistasDTO arti);
	public void eliminar(Conexion con, ArtistasDTO arti);
	public void actualizar(Conexion con, ArtistasDTO arti);

}
