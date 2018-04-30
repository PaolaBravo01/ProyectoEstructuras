package interfaz;

import java.awt.BorderLayout;

import javax.swing.JDialog;

public class DialogoArtistas extends JDialog
{

	private static final long serialVersionUID = 4567890L;


	private PanelBannerArtista banner;
	
	private PanelInformacionArtista panelInfo;
	
	public DialogoArtistas()
	{
		
		setTitle( "Artistas" );
        setSize( 500, 700 );
        setResizable( false );
        setLocationRelativeTo(null);
        setModal(true);
        
        // Distribuidor grafico en los bordes
        setLayout( new BorderLayout( ) );        
        
        banner = new PanelBannerArtista();
        add( banner, BorderLayout.NORTH );
        
        panelInfo = new PanelInformacionArtista( this );
        add(panelInfo, BorderLayout.CENTER);
        
	}
	
	

}
