package interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
public class InterfazAres extends JFrame
{

=======
=======
import mundo.facade.Facade;
>>>>>>> parent of 262bb15... .
=======
>>>>>>> 609e31d40185df572336b6134e202a741b972b02

public class InterfazAres extends JFrame
{

	private Facade interfazAres;
	
	//-----------------------------------------------------------
	// Atributos de la interfaz
	//-----------------------------------------------------------
	
	/** Panel del banner */
	private PanelBanner panelBanner;
	
	public InterfazAres ( ) throws Exception
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
        try
        {
            InterfazAres interfaz = new InterfazAres( );
            interfaz.setVisible( true );
        }
        catch( Exception e )
        {
            e.getMessage();
        }

	}

}
