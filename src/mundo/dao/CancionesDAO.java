package mundo.dao;

import mundo.contenedora.Nodo;
import mundo.db.Conexion;
import mundo.dto.CancionesDTO;
import mundo.contenedora.Mensaje;

public class CancionesDAO implements IDAO
{

	@Override
	public void insertar(Conexion con, Mensaje messa) 
	{
	
		int idCancion = messa.getIdCancion();
		String nombreC = messa.getNombreCancion();
		String nombreArt = messa.getNombreArtista();
		int duracion = messa.getDuracion();
		String genero = messa.getGenero();
		
		CancionesDTO nva = new CancionesDTO(idCancion, nombreC, nombreArt, duracion, genero);
		
		con.ejecutaActualizacion(nva.insertar());
	}

	@Override
	public void eliminar(Conexion con, Mensaje messa) 
	{
		int idCancion = messa.getIdCancion();
		String nombreC = messa.getNombreCancion();
		String nombreArt = messa.getNombreArtista();
		int duracion = messa.getDuracion();
		String genero = messa.getGenero();
		
		CancionesDTO nva = new CancionesDTO(idCancion, nombreC, nombreArt, duracion, genero);
		
		con.ejecutaActualizacion(nva.eliminar());
	}

	@Override
	public void actualizar(Conexion con, Mensaje messa) 
	{
		int idCancion = messa.getIdCancion();
		String nombreC = messa.getNombreCancion();
		String nombreArt = messa.getNombreArtista();
		int duracion = messa.getDuracion();
		String genero = messa.getGenero();
		
		CancionesDTO nva = new CancionesDTO(idCancion, nombreC, nombreArt, duracion, genero);
		
		con.ejecutaActualizacion(nva.actualizar());
		
	}

	@Override
	public Nodo consultarTodos(Conexion con, Mensaje messa) 
	{
		return null;
	}

	@Override
	public Nodo consultarID(Conexion con, Mensaje messa) {
		// TODO Auto-generated method stub
		return null;
	}

}
