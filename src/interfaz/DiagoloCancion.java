package interfaz;

import java.awt.BorderLayout;

import javax.swing.JDialog;

public class DiagoloCancion extends JDialog {
	
	private InterfazAres principal;
	
	private PanelBanner banner;
	
	private PanelInformacionCancion panelInfo;
	
	public DiagoloCancion()
	{
		
		setTitle( "Cancion" );
        setSize( 800, 600 );
        setResizable( false );
        setLocationRelativeTo(null);
        setModal(true);
        
        // Distribuidor grafico en los bordes
        setLayout( new BorderLayout( ) );        
        
        banner = new PanelBanner();
        add( banner, BorderLayout.NORTH );
        
        panelInfo = new PanelInformacionCancion( this );
        add(panelInfo, BorderLayout.CENTER);
	}

}
