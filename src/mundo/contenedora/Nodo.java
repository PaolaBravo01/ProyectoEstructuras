package mundo.contenedora;

public class Nodo<T> 
{
	
	private Nodo<T> siguiente;
	
	private T informacion;

	
	public Nodo() 
	{
		siguiente = null;
		
	}

	public T getInformacion() {
		return informacion;
	}

	public void setInformacion(T informacion) {
		this.informacion = informacion;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	

}
