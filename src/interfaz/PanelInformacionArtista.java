package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import mundo.contenedora.Funcion;
import mundo.servidor.Usuario;
import mundo.contenedora.Mensaje;
import mundo.contenedora.Nodo;
import mundo.contenedora.Tabla;

public class PanelInformacionArtista extends JPanel implements ActionListener
{
	

	public final static String AGREGAR = "Agregar";
	
	public final static String ELIMINAR = "Eliminar";
	
	public final static String MODIFICAR = "Modificar";
	
	public final static String CONSULTAR = "Consultar";
	
	public final static String CONSULTAR_ID = "Consultar por ID";
	
	public final static String INICIAR = "Iniciar";
		
    private DialogoArtistas principal;
	
	private JLabel labID;
	
	private JLabel labNombre;
	
	private JLabel labNombreReal;
	
	private JTextField txtID;
	
	private JTextField txtNombre;
	
	private JTextField txtNombreReal;
	
	private JTextArea txtResultado;
	
	private JButton butAgregar;
	
	private JButton butEliminar;
	
	private JButton butModificar;
	
	private JButton butConsultar;
	
	private JButton butConsultarID;
	
	private JButton butIniciar;
	
	private JScrollPane scroll;
	
	private Funcion funcion;
	
	public PanelInformacionArtista( DialogoArtistas ia )
	{
		principal = ia;
		
		TitledBorder borde = BorderFactory.createTitledBorder("Información del artista");
		borde.setTitleColor( Color.BLACK );
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

		txtResultado = new JTextArea();
		txtResultado.setBackground(Color.WHITE);
		txtResultado.setEditable(false);
		scroll = new JScrollPane(txtResultado);
		
		panelResultados.add(scroll,BorderLayout.CENTER);
		
		add(panelResultados);
		
		//Panel de Navegación
		JPanel panelNavegacion= new JPanel();
				
		//Adiciona un marco con titulo
		TitledBorder borde2 = BorderFactory.createTitledBorder("Navegación");
		borde2.setTitleColor( Color.BLACK );
		panelNavegacion.setBorder( borde2 );
		
		//Establece las dimensiones del panel
		panelNavegacion.setPreferredSize( new Dimension( 0,90 ) );
		
		butAgregar = new JButton("Agregar");
		butAgregar.setActionCommand(AGREGAR);
		butAgregar.addActionListener(this);
		
		butEliminar = new JButton("Eliminar");
		butEliminar.setActionCommand(ELIMINAR);
		butEliminar.addActionListener(this);
		
		butModificar = new JButton("Actualizar");
		butModificar.setActionCommand(MODIFICAR);
		butModificar.addActionListener(this);
		
		butConsultar = new JButton("Consultar");
		butConsultar.setActionCommand(CONSULTAR);
		butConsultar.addActionListener(this);
		
		butConsultarID = new JButton("Consultar por ID");
		butConsultarID.setActionCommand(CONSULTAR_ID);
		butConsultarID.addActionListener(this);
		
		butIniciar = new JButton("Ejecutar");
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
		
		if(AGREGAR.equals(ejecucion))
		{
			int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea agregar un registro?", "AGREGAR", JOptionPane.YES_NO_OPTION);
			if(mensaje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese los datos del artista que desea agregar");
				funcion = Funcion.INSERT;
			}
		}
		
		if(ELIMINAR.equals(ejecucion))
		{

			int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea eliminar un registro?", "ELIMINAR", JOptionPane.YES_NO_OPTION);
			if(mensaje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del artista que desea eliminar");

				funcion = Funcion.DELETE;
			}
		}
		if(MODIFICAR.equals(ejecucion))
		{
			int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea actualizar un registro?", "ACTUALIZAR", JOptionPane.YES_NO_OPTION);
			if(mensaje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese los datos del artista que desea actualizar");

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
				JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del artista que desea consultar");
				
				funcion = Funcion.SELECT_ID;
			}
		}
		if(CONSULTAR_ID.equals(ejecucion))
		{
			int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea consultar por su ID a un artista?", "Consultar?",  JOptionPane.YES_NO_OPTION);
			if(mensaje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del artista que desea consultar");

				funcion = Funcion.SELECT_ID;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Se consultaran todos los elementos existentes");

				funcion = Funcion.SELECT;
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
							resultado +=  nodo.getInformacion().toString() + "\n";
							nodo = nodo.getSiguiente();
						}
						
						txtResultado.setText(resultado);							
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
					
					mensaje.funcionArtistas(funcion, 1, " ", " ");
				}
				else
				{
					int id = Integer.parseInt(txtID.getText());
					String nombre = txtNombre.getText();
					String nombreReal = txtNombreReal.getText();
				
					
					mensaje.funcionArtistas(funcion, id, nombre, nombreReal);
				}
				
			
			return mensaje;
			
		}
		

	
}
