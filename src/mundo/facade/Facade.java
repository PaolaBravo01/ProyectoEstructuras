package mundo.facade;

import mundo.contenedora.Nodo;
import mundo.contenedora.Tabla;
import mundo.dao.ArtistasDAO;
import mundo.dao.CancionesDAO;
import mundo.db.Conexion;
import mundo.contenedora.Mensaje;

public class Facade implements IFacade
{
	private ArtistasDAO artistasDao;
	private CancionesDAO cancionesDao;
	
	public Facade()
	{
		artistasDao = new ArtistasDAO();
		cancionesDao = new CancionesDAO();
	}

	@Override
	public void insertar(Conexion con, Mensaje messa) 
	{
		if(messa.getTabla().equals(Tabla.ARTISTAS))
		{
			artistasDao.insertar(con, messa);
		}
		else
		{
			cancionesDao.insertar(con, messa);
		}
	}



	@Override
	public void eliminar(Conexion con, Mensaje messa) 
	{
		if(messa.getTabla().equals(Tabla.ARTISTAS))
		{
			artistasDao.eliminar(con, messa);
		}
		else
		{
			cancionesDao.eliminar(con, messa);
		}
		
	}



	@Override
	public void actualizar(Conexion con, Mensaje messa) 
	{
	
		if(messa.getTabla().equals(Tabla.ARTISTAS))
		{
			artistasDao.actualizar(con, messa);
		}
		else
		{
			cancionesDao.actualizar(con, messa);
		}
	}



	@Override
	public Nodo consultarTodos(Conexion con, Mensaje messa) 
	{
		Nodo nvo = new Nodo<>();
		
		if(messa.getTabla().equals(Tabla.ARTISTAS))
		{
			nvo = artistasDao.consultarTodos(con, messa);
		}
		else
		{
			nvo = cancionesDao.consultarTodos(con, messa);
		}
		return nvo;
	}



	@Override
	public Nodo consultar(Conexion con, Mensaje messa) 
	{
		Nodo nvo = new Nodo<>();
		
		if(messa.getTabla().equals(Tabla.ARTISTAS))
		{
			nvo = artistasDao.consultar(con, messa);
		}
		else
		{
			nvo = cancionesDao.consultar(con, messa);
		}
		return nvo;
	}

}
