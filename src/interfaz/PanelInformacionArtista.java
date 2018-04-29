package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelInformacionArtista extends JPanel implements ActionListener
{
	
	public final static String AGREGAR = "Agregar";
	
	public final static String ELIMINAR = "Eliminar";
	
	public final static String MODIFICAR = "Modificar";
	
	public final static String CONSULTAR = "Consultar";
	
	public final static String CONSULTAR_ID = "Consultar por ID";
		
    private DialogoArtistas principal;
	
	private JLabel labID;
	
	private JLabel labNombre;
	
	private JLabel labNombreReal;
	
	private JTextField txtID;
	
	private JTextField txtNombre;
	
	private JTextField txtNombreReal;
	
	private JTextField txtResultado;
	
	private JButton butAgregar;
	
	private JButton butEliminar;
	
	private JButton butModificar;
	
	private JButton butConsultar;
	
	private JButton butConsultarID;
	
	
	public PanelInformacionArtista( DialogoArtistas ia )
	{
		principal = ia;
		
		TitledBorder borde = BorderFactory.createTitledBorder("Información del artista");
		borde.setTitleColor( Color.black );
		setBorder( borde );
		
		// Distribuidor grafico en los bordes
		setLayout( new BorderLayout( ) );
		
		JPanel panelInfo = new JPanel();
		
		panelInfo.setLayout(new GridLayout(1, 3));
		panelInfo.setPreferredSize( new Dimension( 10,20 ) );
		
		labID = new JLabel(" ID: ");
		labNombre = new JLabel(" Nombre: ");
		labNombreReal = new JLabel(" Nombre real: ");	
		
		txtID = new JTextField();
		txtID.setEditable(true);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(true);
		
		txtNombreReal = new JTextField();
		txtNombreReal.setEditable(true);
		
		panelInfo.add(labID);
		panelInfo.add(txtID);
		panelInfo.add(labNombre);
		panelInfo.add(txtNombre);
		panelInfo.add(labNombreReal);
		panelInfo.add(txtNombreReal);
	
		add(panelInfo, BorderLayout.NORTH);
		
		//Panel de resultados
		JPanel panelResultados = new JPanel();
		TitledBorder borde1 = BorderFactory.createTitledBorder("Resultados");
		borde1.setTitleColor( Color.BLACK );
		panelResultados.setLayout(new BorderLayout());
		panelResultados.setBorder( borde1 );
		
		txtResultado = new JTextField();
		txtResultado.setBackground(Color.WHITE);
		txtResultado.setEditable(false);
		panelResultados.add(txtResultado,BorderLayout.CENTER);
		
		add(panelResultados);
		
		//Panel de Navegación
		JPanel panelNavegacion= new JPanel();
				
		//Adiciona un marco con titulo
		TitledBorder borde2 = BorderFactory.createTitledBorder("Navegación");
		borde2.setTitleColor( Color.BLACK );
		panelNavegacion.setBorder( borde2 );
		
		//Establece las dimensiones del panel
		panelNavegacion.setPreferredSize( new Dimension( 0,50 ) );
		
		butAgregar = new JButton("Agregar");
		butAgregar.setActionCommand(AGREGAR);
		butAgregar.addActionListener(this);
		
		butEliminar = new JButton("Eliminar");
		butEliminar.setActionCommand(ELIMINAR);
		butEliminar.addActionListener(this);
		
		butModificar = new JButton("Modificar");
		butModificar.setActionCommand(ELIMINAR);
		butModificar.addActionListener(this);
		
		butConsultar = new JButton("Consultar");
		butConsultar.setActionCommand(CONSULTAR);
		butConsultar.addActionListener(this);
		
		butConsultarID = new JButton("Consultar por ID");
		butConsultarID.setActionCommand(CONSULTAR_ID);
		butConsultarID.addActionListener(this);
		 
		
		panelNavegacion.add(butAgregar);
		panelNavegacion.add(butEliminar);
		panelNavegacion.add(butModificar);
		panelNavegacion.add(butConsultar);
		panelNavegacion.add(butConsultarID);
		
		add(panelNavegacion, BorderLayout.SOUTH);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
