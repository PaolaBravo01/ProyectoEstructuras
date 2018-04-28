package mundo.dao;

import mundo.db.Conexion;
import mundo.contenedora.Mensaje;
import mundo.contenedora.Nodo;

public interface IDAO 
{
	public void insertar(Conexion con, Mensaje messa );
	public void eliminar(Conexion con, Mensaje messa);
	public void actualizar(Conexion con, Mensaje messa);
	public Nodo consultarTodos(Conexion con, Mensaje messa);
	public Nodo consultar(Conexion con, Mensaje messa);

}
