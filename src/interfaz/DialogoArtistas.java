package interfaz;

import java.awt.BorderLayout;

import javax.swing.JDialog;

public class DialogoArtistas extends JDialog
{

	private static final long serialVersionUID = 4567890L;

	private InterfazAres principal;
	
	private PanelBanner banner;
	
	private PanelInformacion panelInfo;
	
	public DialogoArtistas()
	{
		
		setTitle( "Artistas" );
        setSize( 800, 600 );
        setResizable( false );
        setLocationRelativeTo(null);
        setModal(true);
        
        // Distribuidor grafico en los bordes
        setLayout( new BorderLayout( ) );        
        
        banner = new PanelBanner();
        add( banner, BorderLayout.NORTH );
        
        panelInfo = new PanelInformacion( this );
        add(panelInfo, BorderLayout.CENTER);
        
	}
	
	

}
