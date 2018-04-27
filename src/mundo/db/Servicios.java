package mundo.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Servicios {
	private Conexion con;

	/**
	 * crea un objeto para la conxion de la base de datos crear un Map con los
	 * departamentos crear un Map con los tipos de documentos
	 */
	public Servicios() {
		con = new Conexion("jdbc:firebirdsql://localhost:3050/C://Bases de datos//PROYECTO.fdb", "SYSDBA", "masterkey");
	}

	public Conexion getCon() {
		return con;
	}

	public void setCon(Conexion con) {
		this.con = con;
	}

	
}
