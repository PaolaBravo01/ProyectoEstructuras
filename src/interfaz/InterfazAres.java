package interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class InterfazAres extends JFrame
{

	//-----------------------------------------------------------
	// Atributos de la interfaz
	//-----------------------------------------------------------
	
	/** Panel del banner */
	private PanelBanner panelBanner;
	
	public InterfazAres ( ) 
	{

		setTitle( "Ares" );
        setSize( 757, 600 );
        setResizable( false );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    
        // Creacion de los paneles
        panelBanner = new PanelBanner( );
        
        // Distribuidor grafico en los bordes
        setLayout( new BorderLayout( ) );
        
        // Agrega los paneles a la interfaz
        add( panelBanner, BorderLayout.NORTH );
	}
	
	public static void main(String[] args)
	{
            InterfazAres interfaz = new InterfazAres( );
            interfaz.setVisible( true );
	}

}
