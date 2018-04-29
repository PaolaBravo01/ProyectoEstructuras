package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelInformacionCancion extends JPanel implements ActionListener {

	
	public final static String AGREGAR = "Agregar";
	
	public final static String ELIMINAR = "Eliminar";
	
	public final static String MODIFICAR = "Modificar";
	
	public final static String CONSULTAR = "Consultar";
	
	public final static String CONSULTAR_ID = "Consultar por ID";
		
    private DiagoloCancion principal;
	
	private JLabel labID;
	
	private JLabel labNombreCancion;
	
	private JLabel labNombreArtista;
	
	private JLabel labGenero;
	
	private JLabel labDuracion;
	
	private JTextField txtID;
	
	private JTextField txtNombreCancion;
	
	private JTextField txtNombreArtista;
	
	private JTextField txtGenero;
	
	private JTextField txtDuracion;
	
	private JTextField txtResultados;
	
	private JButton butAgregar;
	
	private JButton butEliminar;
	
	private JButton butModificar;
	
	private JButton butConsultar;
	
	private JButton butConsultarID;
	
	
	public PanelInformacionCancion( DiagoloCancion ia )
	{
		principal = ia;
		
		TitledBorder borde = BorderFactory.createTitledBorder("Información del artista");
		borde.setTitleColor( Color.black );
		setBorder( borde );
		
		// Distribuidor grafico en los bordes
		setLayout( new BorderLayout( ) );
		
		JPanel panelInfo = new JPanel();
		
		panelInfo.setLayout(new GridLayout(3, 4));
		panelInfo.setPreferredSize( new Dimension( 0, 80 ) );
		
		labID = new JLabel(" ID: ");
		labNombreCancion = new JLabel(" Nombre: ");
		labNombreArtista = new JLabel(" Nombre real: ");	
		labGenero = new JLabel(" Genero: ");
		labDuracion = new JLabel(" Duracion: ");
		
		txtID = new JTextField();
		txtID.setEditable(true);
		
		txtNombreCancion = new JTextField();
		txtNombreCancion.setEditable(true);
		
		txtNombreArtista = new JTextField();
		txtNombreArtista.setEditable(true);
		
		txtGenero = new JTextField();
		txtGenero.setEditable(true);
		
		txtDuracion = new JTextField();
		txtDuracion.setEditable(true);
		
		panelInfo.add(labID);
		panelInfo.add(txtID);
		panelInfo.add(labNombreCancion);
		panelInfo.add(txtNombreCancion);
		panelInfo.add(labNombreArtista);
		panelInfo.add(txtNombreArtista);
		panelInfo.add(labGenero);
		panelInfo.add(txtGenero);
		panelInfo.add(labDuracion);
		panelInfo.add(txtDuracion);
	
		add(panelInfo, BorderLayout.NORTH);
		
		//Panel de resultados
		JPanel panelResultados = new JPanel();
		TitledBorder borde1 = BorderFactory.createTitledBorder("Resultados");
		borde1.setTitleColor( Color.black );
		panelResultados.setLayout(new BorderLayout());
		panelResultados.setBorder( borde1 );
		
		txtResultados = new JTextField();
		txtResultados.setBackground(Color.WHITE);
		txtResultados.setEditable(false);
		panelResultados.add(txtResultados,BorderLayout.CENTER);
		
		add(panelResultados);
		
		//Panel de Navegación
		JPanel panelNavegacion= new JPanel();
				
		//Adiciona un marco con titulo
		TitledBorder borde2 = BorderFactory.createTitledBorder("Navegación");
		borde2.setTitleColor( Color.black );
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
