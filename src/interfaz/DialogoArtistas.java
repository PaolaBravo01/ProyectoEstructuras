package interfaz;

import java.awt.BorderLayout;

import javax.swing.JDialog;

public class DialogoArtistas extends JDialog
{

	private static final long serialVersionUID = 4567890L;

	private InterfazAres principal;
	
	private PanelBanner banner;
	
	public DialogoArtistas()
	{
		
		setTitle( "Artistas" );
        setSize( 520, 270 );
        setResizable( false );
        setLocationRelativeTo(null);
        setModal(true);
        
        // Distribuidor grafico en los bordes
        setLayout( new BorderLayout( ) );        
        
        banner = new PanelBanner();
        add( banner, BorderLayout.NORTH );
        
	}
	
	

}
