package mundo.dao;

import mundo.db.Conexion;
import mundo.dto.ArtistasDTO;

public class ArtistasDAO implements IDAO{

	@Override
	public void insertar(Conexion con, ArtistasDTO artist) 
	{
		con.ejecutaActualizacion(artist.insertar());
		
	}

	@Override
	public void eliminar(Conexion con, ArtistasDTO artist) 
	{
		con.ejecutaActualizacion(artist.eliminar());
	}

	@Override
	public void actualizar(Conexion con, ArtistasDTO artist) 
	{
		con.ejecutaActualizacion(artist.actualizar());
		
	}

}
