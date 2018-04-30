package interfaz;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class DiagoloCancion extends JDialog {
	
	private InterfazAres principal;
	
	private PanelBannerCancion banner;
	
	private PanelInformacionCancion panelInfo;
	
	public DiagoloCancion()
	{
		
		setTitle( "Cancion" );
        setSize( 500, 700 );
        setResizable( false );
        setLocationRelativeTo(null);
        setModal(true);
        
        // Distribuidor grafico en los bordes
        setLayout( new BorderLayout( ) );        
        
        banner = new PanelBannerCancion();
        add( banner, BorderLayout.NORTH );
        
        panelInfo = new PanelInformacionCancion( this );
        add(panelInfo, BorderLayout.CENTER);
	}

}
