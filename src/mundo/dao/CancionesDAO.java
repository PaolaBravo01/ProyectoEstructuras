package mundo.dao;

import mundo.db.Conexion;
import mundo.dto.CancionesDTO;

public class CancionesDAO implements IDAO
{

	//EJECUTO CO
	
	@Override
	public void insertar(Conexion con) {
		// TODO Auto-generated method stub
		CancionesDTO nesae= new CancionesDTO(1, "Aquelarre", "Cristian Devia", 452627, "Heavy Metal");
		con.ejecutaActualizacion(nesae.insertar());
		
	}

	@Override
	public void eliminar(Conexion con) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Conexion con) {
		// TODO Auto-generated method stub
		
	}

}
