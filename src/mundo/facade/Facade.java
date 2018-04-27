package mundo.facade;

import mundo.dao.ArtistasDAO;
import mundo.db.Conexion;
import mundo.db.Servicios;
import mundo.dto.ArtistasDTO;

public class Facade implements IFacade
{

	private ArtistasDAO artistaDAO;
	
	public Facade() 
	{
		artistaDAO = new ArtistasDAO();
	}
	
	

	@Override
	public void insertar(Conexion con, ArtistasDTO arti) 
	{

		
		artistaDAO.insertar(con, arti);
	}

	@Override
	public void eliminar(Conexion con, ArtistasDTO arti) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Conexion con, ArtistasDTO arti) {
		// TODO Auto-generated method stub
		
	}

}
