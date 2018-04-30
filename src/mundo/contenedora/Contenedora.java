package mundo.contenedora;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * Clase que me crea el objeto
 * @author Paola
 *
 * @param <T>
 */
public class Contenedora<T> 
{
	
	private Nodo<T> cabeza;
	
	public Contenedora() {
		cabeza = null;
	}

	public Nodo dato(ResultSet rs, String clase)
	{
		T dato = null;
		ResultSetMetaData metaDatos;
		
		try
		{
			dato = (T) Class.forName(clase).newInstance();
			Method metodos[] = Class.forName(clase).getMethods();
			metaDatos = rs.getMetaData();
			int numeroColumnas = metaDatos.getColumnCount();
			while(rs.next())
			{
				for(int i = 1; i <= numeroColumnas; i++ )
				{
					
					
					Method metodo = buscarMetodo(metaDatos.getColumnName(i), metodos);
					if(metodo != null)
					{
						darValor(dato, metodo, rs.getObject(i));
					}
					
				}
				
				if(cabeza == null)
				{
					Nodo<T> temp = new Nodo<T>();

					temp.setInformacion(dato);
					cabeza = temp;
					
					dato = (T) Class.forName(clase).newInstance();

				}
				else
				{
					Nodo<T> actual = cabeza;
					while(actual.getSiguiente() != null)
					{
						actual = actual.getSiguiente();
						
					}
					
					Nodo<T> temp = new Nodo<T>();

					temp.setInformacion(dato);
					actual.setSiguiente(temp);
										
					dato = (T) Class.forName(clase).newInstance();
				}
				
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return cabeza;
		
		
	}
	
	public Method buscarMetodo(String nombre, Method[] metodos)
	{
		String variable = "set" + nombre;
		Method resultado = null;
		for(int i = 0; i < metodos.length; i++)
		{
			if(variable.compareToIgnoreCase(metodos[i].getName())==0)
			{
				resultado = metodos[i];
			}
		}
		
		return resultado;
		
	}
	
	public void darValor(T datito, Method metodito,Object res) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		metodito.invoke(datito, res);
	}
	

	public Nodo<T> getCabeza() {
		return cabeza;
	}

	public void setCabeza(Nodo<T> cabeza) {
		this.cabeza = cabeza;
	}
	

}
