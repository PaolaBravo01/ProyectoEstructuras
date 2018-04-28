package mundo.dao;

import mundo.contenedora.Nodo;
import mundo.db.Conexion;
import mundo.dto.ArtistasDTO;
import mundo.dto.CancionesDTO;

import java.sql.ResultSet;

import mundo.contenedora.Contenedora;
import mundo.contenedora.Mensaje;

public class ArtistasDAO implements IDAO{

	@Override
	public void insertar(Conexion con, Mensaje messa) 
	{
		int idArtista = messa.getIdArtista();
		String nombreArtista = messa.getNombre();
		String nomReal = messa.getNombreReal();
		
		ArtistasDTO nvo = new ArtistasDTO(idArtista, nombreArtista, nomReal);
		
		con.ejecutaActualizacion(nvo.insertar());
	}

	@Override
	public void eliminar(Conexion con, Mensaje messa) 
	{
		ArtistasDTO nvo = new ArtistasDTO();
		nvo.setIdArtista(messa.getIdArtista());
		
		con.ejecutaActualizacion(nvo.eliminar());
		
	}

	@Override
	public void actualizar(Conexion con, Mensaje messa) 
	{
		int idArtista = messa.getIdArtista();
		String nombreArtista = messa.getNombre();
		String nomReal = messa.getNombreReal();
		
		ArtistasDTO artista = new ArtistasDTO(idArtista, nombreArtista, nomReal);
		
		con.ejecutaActualizacion(artista.actualizar());
	}

	@Override
	public Nodo consultarTodos(Conexion con, Mensaje messa) 
	{
		ArtistasDTO artista = new ArtistasDTO();

		ResultSet rs = con.ejecutaConsulta(artista.consultarTodos());

		Nodo consultado = new Contenedora<>().dato(rs, "mundo.dto.ArtistasDTO");

		return consultado;
	}

	@Override
	public Nodo consultar(Conexion con, Mensaje messa) 
	{
		ArtistasDTO artista = new ArtistasDTO();
		artista.setIdArtista(messa.getIdArtista());

		ResultSet rs = con.ejecutaConsulta(artista.consultarTodos());

		Nodo consultado = new Contenedora<>().dato(rs, "mundo.dto.ArtistasDTO");

		return consultado;
	}


}
