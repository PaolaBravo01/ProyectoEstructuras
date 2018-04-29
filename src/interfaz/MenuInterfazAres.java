package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuInterfazAres extends JMenuBar {
	
	private final static String ARTISTA = "Artista";
	
	private final static String CANCION = "Cancion";
	
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
    
    public MenuInterfazAres ()
    {
    	menuArchivo = new JMenu( "Archivo" );
        menuArchivo.setMnemonic( KeyEvent.VK_A );
        add( menuArchivo );
        
        itemArtista = new JMenuItem("Consultar por artista");
        itemArtista.setActionCommand(ARTISTA);
        itemArtista.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.CTRL_MASK ) );
        itemArtista.setMnemonic( KeyEvent.VK_N );
        itemArtista.addActionListener( (ActionListener) this );
        menuArchivo.add(itemArtista);
        
    }
    
}
