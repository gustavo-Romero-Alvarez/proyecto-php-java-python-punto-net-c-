package examen1.parte;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import javax.swing.JList;
import pojo.Paciente;
import pojo.Persona;
import java.util.ArrayList;
import javax.swing.JScrollPane;




public class VentanaPaciente extends JFrame implements ListSelectionListener, ActionListener
{
    private Container contenedor;
    private JPanel panel;
    private JPanel panelBotones;
    private JPanel panelIngresar;
    private JPanel panelMostrar;
    private JLabel etiquetaRut;
    private JLabel etiquetaDV;
    private JLabel etiquetaPrimerNombre;
    private JLabel etiquetaSegundoNombre;
    private JLabel etiquetaApePaterno;
    private JLabel etiquetaApeMaterno;
    private JLabel etiquetaGenero;
    private JLabel etiquetaPeso;
    private JLabel etiquetaTalla;
    private JLabel etiquetaTipoParto;
    private JLabel etiquetaFallece;
    private JLabel etiquetaFechaNacimiento;
    private JLabel etiquetaMostrar;
    private JTextField campoRut;
    private JTextField campoDV;
    private JTextField campoPrimerNombre;
    private JTextField campoSegundoNombre;
    private JTextField campoApePaterno;
    private JTextField campoApeMaterno;
    private JTextField campoGenero;
    private JTextField campoPeso;
    private JTextField campoTalla;
    private JTextField campoTipoParto;
    private JTextField campoFallece;
    private JTextField campoFechaNacimiento;
    private JButton botonGuardar;
    private JButton botonLimpiar;
    private JButton botonMostrar;
    private JTextArea mostrador;
    private JButton botonIngresos;
    private conexion.ConexionBD conexion;
   
    
    private ArrayList<Paciente> listapacientes;
    private Object [] listado;
    private JList <Object> lista;
    private JScrollPane scroll;
    
    public VentanaPaciente()
    {
        conexion = new ConexionBD();
   
         //agregue
        
        conexion = new ConexionBD();
        listapacientes = conexion.recuperarPacientes();        
        listado = crearListado();
        lista = new JList<>(listado);
        lista.addListSelectionListener(this);
        
        scroll = new JScrollPane(lista);
       
        //fin

        
        contenedor = getContentPane();
        panel = new JPanel (new BorderLayout(4,4));//cambiar 10,10
       
        panelIngresar = new JPanel();
        panelIngresar.setLayout(new GridLayout(12,2));
        
        panelMostrar = new JPanel();
        panelMostrar.setLayout(new GridLayout(2,1));
       
        etiquetaRut = new JLabel("   RUT: ");
        campoRut = new JTextField();
        etiquetaDV = new JLabel("   DV: ");
        campoDV = new JTextField();
        etiquetaPrimerNombre = new JLabel("  Primer Nombre: ");
        campoPrimerNombre = new JTextField();
        etiquetaSegundoNombre = new JLabel("   Segundo Nombre: ");
        campoSegundoNombre = new JTextField();
        etiquetaApePaterno = new JLabel("   Apellido Paterno: ");
        campoApePaterno = new JTextField();
        etiquetaApeMaterno = new JLabel("   Apellido Materno: ");
        campoApeMaterno = new JTextField();
        etiquetaGenero = new JLabel("   Genero: ");
        campoGenero = new JTextField();
        etiquetaPeso = new JLabel("   Peso: ");
        campoPeso = new JTextField();
        etiquetaTalla = new JLabel("   Talla: ");
        campoTalla = new JTextField();
        etiquetaTipoParto = new JLabel("   Tipo De Parto: ");
        campoTipoParto = new JTextField();
        etiquetaFallece = new JLabel("   Fallece: ");
        campoFallece = new JTextField();
        etiquetaFechaNacimiento = new JLabel("   Fecha De Nacimiento: ");
        campoFechaNacimiento = new JTextField();
        
        
        mostrador = new JTextArea(25, 40);//Donde Se deberian mostrar los datos guardados en la BDD
                     
        panelIngresar.add(etiquetaRut, 0);
        panelIngresar.add(campoRut, 1);
        panelIngresar.add(etiquetaDV, 2);
        panelIngresar.add(campoDV ,3);
        panelIngresar.add(etiquetaPrimerNombre,4);
        panelIngresar.add(campoPrimerNombre,5);
        panelIngresar.add(etiquetaSegundoNombre,6);
        panelIngresar.add(campoSegundoNombre,7); 
        panelIngresar.add(etiquetaApePaterno,8);
        panelIngresar.add(campoApePaterno, 9); 
        panelIngresar.add(etiquetaApeMaterno,10);
        panelIngresar.add(campoApeMaterno,11); 
        panelIngresar.add(etiquetaGenero,12);
        panelIngresar.add(campoGenero,13); 
        panelIngresar.add(etiquetaPeso,14);
        panelIngresar.add(campoPeso,15); 
        panelIngresar.add(etiquetaTalla,16);
        panelIngresar.add(campoTalla,17); 
        panelIngresar.add(etiquetaTipoParto,18);
        panelIngresar.add(campoTipoParto,19); 
        panelIngresar.add(etiquetaFallece,20);
        panelIngresar.add(campoFallece,21); 
        panelIngresar.add(etiquetaFechaNacimiento,22);
        panelIngresar.add(campoFechaNacimiento,23); 
             
                
               
         
        
        
        panelMostrar.add(scroll);

       // panelMostrar.add(etiquetaMostrar,0);
//        panelMostrar.add(mostrador,0);
//        panelMostrar.add(scroll,1);
        panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        botonLimpiar = new JButton("Limpiar");
        botonGuardar = new JButton("Guardar");
        botonMostrar = new JButton("Mostrar");   
        botonIngresos = new JButton("Realizar Ingreso");
        
        botonLimpiar.addActionListener(this);
        botonGuardar.addActionListener(this);
        botonMostrar.addActionListener(this); 
        
       
        panelBotones.add(botonGuardar);
        panelBotones.add(botonLimpiar);
        panelBotones.add(botonMostrar);
       
        
        
       
        contenedor.add(panelIngresar, BorderLayout.NORTH);
        contenedor.add(panelMostrar, BorderLayout.CENTER);
        contenedor.add(panelBotones, BorderLayout.SOUTH);   
        
        panelMostrar.setVisible(false);
        
        this.setTitle("Registro De Pacientes");
        this.setSize(1250,500);
        this.setVisible(true);
        //this.setResizable(false);       
    }

    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        
    }
    
    private Object[] crearListado()
    {
        Object[] listadoNuevo = new Object[listapacientes.size()];
        Iterator<Paciente> iterador = listapacientes.iterator();
        int indice = 0;
        while( iterador.hasNext() )
        {
            listadoNuevo[indice++] = iterador.next().toString();
        }
        return listadoNuevo;
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    { 
        if (e.getSource() == botonLimpiar)
        {
            campoRut.setText(null);
            campoDV.setText(null);
            campoPrimerNombre.setText(null);
            campoSegundoNombre.setText(null);
            campoApePaterno.setText(null);
            campoApeMaterno.setText(null);
            campoGenero.setText(null);
            campoPeso.setText(null);
            campoTalla.setText(null);
            campoTipoParto.setText(null);
            campoFallece.setText(null);
            campoFechaNacimiento.setText(null);
            panelMostrar.setVisible(false);
            
        }
        else if (e.getSource() == botonGuardar)
        {
            conexion.llenarPaciente(campoRut.getText(), campoDV.getText(), campoPrimerNombre.getText(), campoSegundoNombre.getText(), campoApePaterno.getText(),
            campoApeMaterno.getText(), campoGenero.getText(), campoPeso.getText(), campoTalla.getText(), campoTipoParto.getText(), campoFallece.getText(), 
            campoFechaNacimiento.getText());
            conexion = new ConexionBD();
            listapacientes = conexion.recuperarPacientes();
            listado = crearListado();
            lista = new JList<>(listado);
            panelMostrar.setVisible(true);
            scroll.setViewportView(lista);
        }
        else if (e.getSource() == botonMostrar)
        {
       
            conexion = new ConexionBD();
            listapacientes = conexion.recuperarPacientes();
            listado = crearListado();
            lista = new JList<>(listado);
            panelMostrar.setVisible(true);
            scroll.setViewportView(lista);  
                               
        }
        
    }

}

   



                