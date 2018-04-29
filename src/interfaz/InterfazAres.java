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
	
	private MenuInterfazAres barraMenu;
	
	public InterfazAres ( ) 
	{

		setTitle( "Ares" );
        setSize( 520, 250 );
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
		// TODO Auto-generated method stub
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
