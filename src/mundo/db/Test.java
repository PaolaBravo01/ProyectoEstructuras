package mundo.db;

import mundo.dto.ArtistasDTO;
import mundo.facade.Facade;

public class Test {
	

	public static void main(String[] args) 
	{
		
		Servicios serv = new Servicios();
		Facade facade = new Facade();
		
		ArtistasDTO nvo = new ArtistasDTO(6, "Greicy", "Greicy Rendon");
		
		facade.insertar(serv.getCon(), nvo);


	}

}
