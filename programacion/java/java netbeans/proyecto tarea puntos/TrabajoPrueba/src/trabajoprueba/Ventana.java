
package trabajoprueba;

import conexion.ConexionBD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



import pojo.Neumatico;

public class Ventana extends JFrame implements ListSelectionListener, ActionListener
{
    private Container contenedor;
    private JPanel panel;
    private JPanel panelBotones;
    private JPanel panelIngresar;
    private JPanel panelMostrar;
    private JLabel etiquetaCodigo;
    private JLabel etiquetaPrecio;
    private JLabel etiquetaTipo;
    private JLabel etiquetaStock;
    private JLabel etiquetaMostrar;
    private JTextField campoCodigo;
    private JTextField campoPrecio;
    private JTextField campoTipo;
    private JTextField campoStock;
    private JButton botonGuardar;
    private JButton botonLimpiar;
    private JButton botonMostrar;
    private JTextArea mostrador;
    
    private conexion.ConexionBD conexion;
    private ArrayList<Neumatico> listaneumatico;  
    private JList<Object>lista;
    private Object[] listado;
    private JScrollPane scroll;
    
    
    public Ventana()
    {
        contenedor = getContentPane();
        panel = new JPanel (new BorderLayout(4, 4));//cambiar 10,10
       
        //agregue
        
        conexion = new ConexionBD();
        listaneumatico = conexion.recuperarNeumaticos();        
        listado = crearListado();
        lista = new JList<>(listado);
        lista.addListSelectionListener(this);
        
        scroll = new JScrollPane(lista);
       
        //fin
     
        
        panelIngresar = new JPanel();
        panelIngresar.setLayout(new GridLayout(2,2));

        
        panelMostrar = new JPanel();
        panelMostrar.setLayout(new GridLayout(2,2));
       
        etiquetaCodigo = new JLabel("Codigo");
       
        campoCodigo = new JTextField();
        etiquetaPrecio = new JLabel("Precio");
        campoPrecio = new JTextField();
        etiquetaTipo = new JLabel("Tipo");
        campoTipo = new JTextField();
        etiquetaStock = new JLabel("Stock");
        campoStock = new JTextField();
        etiquetaMostrar = new JLabel("         lista De Neumaticos");
            
            
        
        //mostrador = new JTextArea(8, 15);//Donde Se deberian mostrar los datos guardados en la BDD
        panelIngresar.setBackground(Color.decode("#4682B4"));
        
        panelIngresar.add(etiquetaCodigo,0);
        panelIngresar.add(etiquetaPrecio,1);
        panelIngresar.add(etiquetaTipo,2);
        panelIngresar.add(etiquetaStock,3);       
        panelIngresar.add(campoCodigo,4);        
        panelIngresar.add(campoPrecio ,5);        
        panelIngresar.add(campoTipo,6);        
        panelIngresar.add(campoStock,7);        
        
        panelMostrar.add(etiquetaMostrar);
        panelMostrar.add(scroll);
    

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
       
        panelMostrar.setVisible(false);

        contenedor.add(panelIngresar, BorderLayout.NORTH);
        contenedor.add(panelMostrar, BorderLayout.CENTER);
        contenedor.add(panelBotones, BorderLayout.SOUTH);  
     
        this.setTitle("Neumaticos");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        
        
        
        this.setSize(620,400);
        this.setVisible(true);
        this.setResizable(false);  
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        
    }

    private Object[] crearListado() 
    {
        Object[] listadoNuevo = new Object[listaneumatico.size()];
        Iterator<Neumatico> iterador = listaneumatico.iterator();
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

        if (e.getSource() == botonLimpiar)//accion para limpiar campos(codigo, precio, tipo, stock)
        {
            campoCodigo.setText(null);
            campoPrecio.setText(null);
            campoTipo.setText(null);
            campoStock.setText(null);
             panelMostrar.setVisible(false);
             

            
        }
        else if (e.getSource() == botonGuardar)//accion para guardar datos en BDD
        {
            
                       
             String codigo=campoCodigo.getText().trim();
             String precio=campoPrecio.getText().trim();
             String tipo=campoTipo.getText().trim();
             String stock=campoStock.getText().trim();
            //ventana1.setVisible(true);
            conexion.llenarNeumatico(codigo,precio,tipo,stock);
             campoCodigo.setText(null);
            campoPrecio.setText(null);
            campoTipo.setText(null);
            campoStock.setText(null);
            
            conexion = new ConexionBD();
            listaneumatico = conexion.recuperarNeumaticos();        
            listado=crearListado();
            lista=new JList<>(listado);
            lista.addListSelectionListener(this);        
            scroll.setViewportView(lista);
            

       

        }
        else if (e.getSource() == botonMostrar)//accion para mostrar datos guardados en BDD
        {
          
           
           panelMostrar.setVisible(true);
           System.out.println(etiquetaMostrar.getBounds());
                   etiquetaMostrar.setBounds(0,0,594,220);
           // mostrador.setText("");
                   

        }
                
            
 
    }
    
    
   
    
    
}
