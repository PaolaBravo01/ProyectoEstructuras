package mundo.servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import mundo.db.Servicios;

public class Servidor 
{
	
	public static final int PUERTO = 2027;
	private static final int NO_CONEXIONES = 20;
	
	
	private ServerSocket server;
	private Servicios serv;
	
	
	public Servidor()
	{
		serv = new Servicios();
		this.escuchar();
	}
	
	public void escuchar()
	{
		try 
		{
		
			server = new ServerSocket(PUERTO, NO_CONEXIONES);
			
			while(true)
			{
				System.out.println("Esperando......");
				Socket cliente = server.accept();
				
				ObjectInputStream ois = new ObjectInputStream(cliente.getInputStream());
				ObjectOutputStream oos = new ObjectOutputStream(cliente.getOutputStream());
				
				HiloServidor hilo = new HiloServidor(serv.getCon(), ois, oos);
				hilo.start();
				
			}
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}
	


}
