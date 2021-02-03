
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
import pojo.Ingreso;




public class VentanaIngreso extends JFrame implements ListSelectionListener, ActionListener
{
    private Container contenedor;
    private JPanel panel;
    private JPanel panelBotones;
    private JPanel panelIngresar;
    private JPanel panelMostrar;
    private JLabel etiquetaRut;
    private JLabel etiquetaEnfermero;
    private JLabel etiquetaHoraInicio;
    private JLabel etiquetaEstado;
    private JLabel etiquetaObservaciones;
    private JLabel etiquetaMostrar;
    private JTextField campoRut;
    private JTextField campoEnfermero;
    private JTextField campoHoraInicio;
    private JTextField campoEstado;
    private JTextField campoObservaciones;
    private JButton botonGuardar;
    private JButton botonLimpiar;
    private JButton botonMostrar;
    private JTextArea mostrador;
    private conexion.ConexionBD conexion;
   
    
    private ArrayList<Ingreso> listaIngreso;
    private Object [] listado;
    private JList <Object> lista;
    private JScrollPane scroll;
    
    public VentanaIngreso()
    {
        conexion = new ConexionBD();
   
         //agregue
        
        conexion = new ConexionBD();
        listaIngreso = conexion.recuperarIngreso();        
        listado = crearListado();
        lista = new JList<>(listado);
        lista.addListSelectionListener(this);
        
        scroll = new JScrollPane(lista);
       
        //fin

        
        contenedor = getContentPane();
        panel = new JPanel (new BorderLayout(2,4));//cambiar 10,10
       
        panelIngresar = new JPanel();
        panelIngresar.setLayout(new GridLayout(12,2));
        
        panelMostrar = new JPanel();
        panelMostrar.setLayout(new GridLayout(2,2));
       
        etiquetaRut = new JLabel("   Rut de paciente: ");
        campoRut = new JTextField();
        etiquetaEnfermero = new JLabel("  Rut de enfermero: ");
        campoEnfermero = new JTextField();
        etiquetaHoraInicio = new JLabel("  Hora Inicio: ");
        campoHoraInicio = new JTextField();
        etiquetaEstado = new JLabel("   Estado: ");
        campoEstado = new JTextField();
        etiquetaObservaciones = new JLabel("   Observaciones: ");
        campoObservaciones = new JTextField();
       
        
        mostrador = new JTextArea(15, 15);//Donde Se deberian mostrar los datos guardados en la BDD
                     
        panelIngresar.add(etiquetaRut, 0);
        panelIngresar.add(campoRut, 1);
        panelIngresar.add(etiquetaEnfermero, 2);
        panelIngresar.add(campoEnfermero , 3);
        panelIngresar.add(etiquetaHoraInicio, 4);
        panelIngresar.add(campoHoraInicio, 5);
        panelIngresar.add(etiquetaEstado,6);
        panelIngresar.add(campoEstado,7); 
        panelIngresar.add(etiquetaObservaciones,8);
        panelIngresar.add(campoObservaciones, 9); 
              
        
        panelMostrar.add(scroll);

        //panelMostrar.add(etiquetaMostrar,0);
        //panelMostrar.add(mostrador,1);
        //panelMostrar.add(scroll,1);
        panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        botonLimpiar = new JButton("Limpiar");
        botonGuardar = new JButton("Guardar");
        botonMostrar = new JButton("Mostrar");   
        
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
        
        this.setTitle("Ingreso de ficha del paciente");
        this.setSize(800,500);
        this.setVisible(true);
        //this.setResizable(false);       
    }

    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        
    }
    
    private Object[] crearListado()
    {
        Object[] listadoNuevo = new Object[listaIngreso.size()];
        Iterator<Ingreso> iterador = listaIngreso.iterator();
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
            campoEnfermero.setText(null);
            campoHoraInicio.setText(null);
            campoEstado.setText(null);
            campoObservaciones.setText(null);
            panelMostrar.setVisible(false);
            
        }
        else if (e.getSource() == botonGuardar)
        {
            conexion.fichaIngreso(campoRut.getText(), campoEnfermero.getText(), campoHoraInicio.getText(), campoEstado.getText(), campoObservaciones.getText());
            conexion = new ConexionBD();
            listaIngreso = conexion.recuperarIngreso();
            listado = crearListado();
            lista = new JList<>(listado);
            panelMostrar.setVisible(true);
            scroll.setViewportView(lista);
        }
        else if (e.getSource() == botonMostrar)
        {
       
            conexion = new ConexionBD();
            listaIngreso = conexion.recuperarIngreso();
            listado = crearListado();
            lista = new JList<>(listado);
            panelMostrar.setVisible(true);
            scroll.setViewportView(lista);
            
            
           
            
                               
        }               
    }

}

   



                

