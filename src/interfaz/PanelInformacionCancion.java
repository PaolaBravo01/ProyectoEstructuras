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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import mundo.contenedora.Funcion;
import mundo.contenedora.Mensaje;
import mundo.contenedora.Nodo;
import mundo.contenedora.Tabla;
import mundo.servidor.Usuario;

public class PanelInformacionCancion extends JPanel implements ActionListener {

	
	public final static String INSERTAR = "Insertar";
	
	public final static String ELIMINAR = "Eliminar";
	
	public final static String MODIFICAR = "Modificar";
	
	public final static String CONSULTAR = "Consultar";
	
	public final static String CONSULTAR_ID = "Consultar por ID";
	
	public final static String INICIAR = "Iniciar";
		
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

	private JButton butIniciar;
	
	private Funcion funcion;
	private Tabla tabla = Tabla.CANCIONES;

	
	
	public PanelInformacionCancion( DiagoloCancion ia )
	{
		principal = ia;
		
		TitledBorder borde = BorderFactory.createTitledBorder("Información del artista");
		borde.setTitleColor( Color.BLACK );
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
		panelNavegacion.setPreferredSize( new Dimension( 0,90 ) );
		
		butAgregar = new JButton("Insertar");
		butAgregar.setActionCommand(INSERTAR);
		butAgregar.addActionListener(this);
		
		butEliminar = new JButton("Eliminar");
		butEliminar.setActionCommand(ELIMINAR);
		butEliminar.addActionListener(this);
		
		butModificar = new JButton("Modificar");
		butModificar.setActionCommand(MODIFICAR);
		butModificar.addActionListener(this);
		
		butConsultar = new JButton("Consultar");
		butConsultar.setActionCommand(CONSULTAR);
		butConsultar.addActionListener(this);
		
		butConsultarID = new JButton("Consultar por ID");
		butConsultarID.setActionCommand(CONSULTAR_ID);
		butConsultarID.addActionListener(this);
		 
		butIniciar = new JButton("Iniciar");
		butIniciar.setActionCommand(INICIAR);
		butIniciar.addActionListener(this);
				
		panelNavegacion.add(butAgregar);
		panelNavegacion.add(butEliminar);
		panelNavegacion.add(butModificar);
		panelNavegacion.add(butConsultar);
		panelNavegacion.add(butConsultarID);
		panelNavegacion.add(butIniciar);
		
		add(panelNavegacion, BorderLayout.SOUTH);
	}


	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		String ejecucion = evento.getActionCommand();
		Usuario usuario = new Usuario();
		
		if(INSERTAR.equals(ejecucion))
		{
			int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea agregar un registro?", "AGREGAR", JOptionPane.YES_NO_OPTION);
			if(mensaje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese los datos de la cancion que desea agregar");
				funcion = Funcion.INSERT;
			}		
		}
		if(ELIMINAR.equals(ejecucion))
		{

			int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea eliminar un registro?", "ELIMINAR", JOptionPane.YES_NO_OPTION);
			if(mensaje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese el ID de la canción que desea eliminar");

				funcion = Funcion.DELETE;
			}		
		}
		
		if(MODIFICAR.equals(ejecucion))
		{
			int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea actualizar un registro?", "ACTUALIZAR", JOptionPane.YES_NO_OPTION);
			if(mensaje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese los datos de la canción que desea actualizar");

				funcion = Funcion.UPDATE;
			}
		}
		if(CONSULTAR.equals(ejecucion))
		{
			int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea consultar por todos los elementos?", "Consultar?",  JOptionPane.YES_NO_OPTION);
			if(mensaje == JOptionPane.YES_OPTION)
			{
				funcion = Funcion.SELECT;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese el ID de la canción que desea eliminar");

				funcion = Funcion.SELECT_ID;
			}
		}
		
		
		if(INICIAR.equals(ejecucion)) 
		{
			try {
				Mensaje mensaje = nuevoMensaje();
				
				if(funcion.equals(Funcion.SELECT) || funcion.equals(Funcion.SELECT_ID))
				{
					Nodo nodo = usuario.envioMensaje(mensaje);
					
					if(nodo != null)
					{
						String resultado = "";
						
						while(nodo != null)
						{
							resultado +=  nodo.getInformacion().toString() + "\n" +"" ;
							nodo = nodo.getSiguiente();
						}
						
						txtResultados.setText(resultado);							
					}
				}
				else
				{
					usuario.envioMensaje(mensaje);
					JOptionPane.showMessageDialog(null, "Se ha realizado la operación correctamente.");
				}
				
			} 
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Se ha producido un error: "+ "\n" + e.getMessage());
			}
		}
	}
		
		public Mensaje nuevoMensaje() 
		{
			Mensaje mensaje = new Mensaje();
			
			if(funcion.equals(Funcion.SELECT))
			{
				
				mensaje.funcionCanciones(funcion, 0, "", "", 0, "");
			}
			else if(funcion.equals(Funcion.SELECT_ID)) 
			{
				int id = Integer.parseInt(txtID.getText());
				mensaje.funcionCanciones(funcion, id, "", "", 0, "");

			}
			else
			{
				int id = Integer.parseInt(txtID.getText());
				String nombre = txtNombreCancion.getText();
				String nombreArtista = txtNombreArtista.getText();
				int duracion = Integer.parseInt(txtDuracion.getText());
				String genero = txtGenero.getText();
				
				mensaje.funcionCanciones(funcion, id, nombre, nombreArtista, duracion, genero);
			}
			
			return mensaje;
			
		}
		
	
}
