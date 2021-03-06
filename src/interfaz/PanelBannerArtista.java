package interfaz;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBannerArtista extends JPanel
{
	// -----------------------------------------------------
	// Atributos
	// -----------------------------------------------------
		
	/** Etiqueta para mostrar la imagen del banner.	 */
		private JLabel labImagen;
		
	// -----------------------------------------------------
	// Constructor
	// -----------------------------------------------------
		
    /** Crea el panel del banner. */
		
	public PanelBannerArtista() 
	{
		// Se crea el objeto del panel
		labImagen = new JLabel(new ImageIcon( getClass().getResource("/Imagenes/artistas.jpg") ) );
			
		// Agregar el objeto al panel
		add( labImagen );
	}

}
