package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import mundo.contenedora.Tabla;



public class MenuInterfazAres extends JMenuBar implements ActionListener
{
	
	private static final long serialVersionUID = 46378926473L;

	public final static String ARTISTA = "Artista";
	
	public final static String CANCION = "Cancion";
	
	public final static String SALIR = "Salir"; 
	
    /**
     * El menú Archivo.
     */
    private JMenu menuArchivo;
    
    /**
     * La opcion para abrir un menu de artistas.
     */
    private JMenuItem itemArtista;
    
    /**
     * La opcion para abrir el menu cancion.
     */
    private JMenuItem itemCancion;
    
    private InterfazAres principal;
    
    private JMenuItem itemSalir;
    
    private Tabla tabla = null;
    
    
    public MenuInterfazAres(InterfazAres ia)
    {
    	principal = ia;
    	
    	menuArchivo = new JMenu( "Archivo" );
        menuArchivo.setMnemonic( KeyEvent.VK_A );
        add( menuArchivo );
        
        itemArtista = new JMenuItem("Consultar por artista");
        itemArtista.setActionCommand(ARTISTA);
        itemArtista.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.CTRL_MASK ) );
        itemArtista.setMnemonic( KeyEvent.VK_N );
        itemArtista.addActionListener( (ActionListener) this );
        menuArchivo.add(itemArtista);
        
        itemCancion = new JMenuItem("Consultar por canción");
        itemCancion.setActionCommand(CANCION);
        itemCancion.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_A, ActionEvent.CTRL_MASK ) );
        itemCancion.setMnemonic( KeyEvent.VK_A );
        itemCancion.addActionListener( (ActionListener) this );
        menuArchivo.add(itemCancion);
        
        menuArchivo.addSeparator();
        
        itemSalir = new JMenuItem( "Salir" );
        itemSalir.setActionCommand( SALIR );
        itemSalir.addActionListener( this );
        menuArchivo.add( itemSalir );
        
        
        
    }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		String comando = e.getActionCommand( );
		
		if(ARTISTA.equals(comando))
		{
			tabla = Tabla.ARTISTAS;
			DialogoArtistas artistas = new DialogoArtistas();
			artistas.setVisible(true);
		
		
		}
		if(CANCION.equals(comando))
		{
			tabla = Tabla.CANCIONES;
			DiagoloCancion cancion = new DiagoloCancion();
			cancion.setVisible(true);
		}
		if(SALIR.equals(comando))
		{
			principal.dispose();
		}
		
	}
    
}
