package mundo.servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import mundo.contenedora.Mensaje;
import mundo.contenedora.Nodo;

public class Usuario 
{

	public final static int PUERTO = 2027;
	
	public Usuario()
	{
		
	}
	
	public Nodo envioMensaje(Mensaje messa) throws UnknownHostException, IOException, ClassNotFoundException 
	{
		
		Socket servidor = new Socket("localhost", PUERTO);
		System.out.println("Usuario Conectado!!");
		
		ObjectOutputStream oos = new ObjectOutputStream(servidor.getOutputStream());
		
		System.out.println("Se va a enviar una respuesta");
		
		oos.writeObject(messa);
		
		ObjectInputStream ois = new ObjectInputStream(servidor.getInputStream());
		
		Nodo nodo = (Nodo) ois.readObject();
		
		return nodo;
		
	}
}
