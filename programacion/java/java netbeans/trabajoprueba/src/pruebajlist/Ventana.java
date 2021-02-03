
package pruebajlist;

import conexion.ConexionBD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import pojo.Mensaje;
 
import pruebajlist.ventana2;
public class Ventana  extends JFrame implements ListSelectionListener,ActionListener
{
    private Container contenedor;
    private JPanel panel;//panel principal
    private JPanel remitente;
    private JPanel contenido;
    private JLabel etiquetaRemitente;
    private JLabel etiquetaContenido;
    private JLabel etiquetaNumeroCorreos;
    private JTextField numeroCorreos;
    private JPanel botones;
    private JList<Object>lista;
    private JTextArea texto, texto2;
    private JScrollPane scroll;
    private  Object[] listado;
    private ArrayList<Mensaje> correos;
    private JButton botonEliminar;
    private JButton botonRedactar;
    private conexion.ConexionBD conexion;
    
    //otra ventana
    
    ventana2 v2=new ventana2();
  
    
    public Ventana()
    {
      
        contenedor = getContentPane();
        panel = new JPanel(new BorderLayout(4, 4));
        conexion = new ConexionBD();
        correos = conexion.recuperarCorreos();
        remitente = new JPanel(new BorderLayout(4,4));
        etiquetaRemitente = new JLabel("|          Remitente:           | ");
        listado = crearListado();
        lista = new JList<>(listado);
        lista.addListSelectionListener(this);// con esto se registra para generar eventos
        scroll = new JScrollPane(lista);
        remitente.add(etiquetaRemitente, BorderLayout.NORTH);
        remitente.add(scroll, BorderLayout.CENTER);
        
        contenido = new JPanel(new BorderLayout(4,4));
        etiquetaContenido = new JLabel("Contenido: ");
        texto = new JTextArea(25,40);
        contenido.add(etiquetaContenido, BorderLayout.NORTH);
        contenido.add(texto, BorderLayout.SOUTH);
        
        
        botones = new JPanel(new FlowLayout());
        etiquetaNumeroCorreos = new JLabel("Número correos");
        numeroCorreos = new JTextField();
        numeroCorreos.setText(String.valueOf(listado.length));//transforma int a String
        botonEliminar = new JButton("Eliminar Correo");
        botonRedactar = new JButton("Redactar Correo");
        //registrar como botones de evento
        botonEliminar.addActionListener(this);
        botonRedactar.addActionListener(this);
        
        botones.add(etiquetaNumeroCorreos);
        botones.add(numeroCorreos);
        botones.add(botonEliminar);
        botones.add(botonRedactar);
        
        remitente.setBackground(Color.decode("#1E90FF"));
        contenido.setBackground(Color.decode("#1E90FF"));
    
                       
        //listado=conexion.correosRecibidos();
        
    
        texto2 = new JTextArea(25,40);
      
        panel.add(remitente, BorderLayout.WEST);//agregar elementos al panel
        panel.add(contenido, BorderLayout.EAST);
        panel.add(botones, BorderLayout.SOUTH);
        
       
        
        contenedor.add(panel);
       
        //panel.add(texto2, BorderLayout.EAST);//Agregar texto 2 a panel
                     
        this.setTitle("correo");
        this.setSize(240,320);
         this.pack();
        this.setVisible(true);
         
        //240,320
         //setResizable(false);
     }
  
    @Override
    public void valueChanged(ListSelectionEvent e) {
       
        if (e.getValueIsAdjusting())
        {
            int indice = lista.getSelectedIndex();
            //System.out.println(listado[indice]);
            //System.out.println(indice);
            buscarContenido(lista.getSelectedValue());
            
//          String contenido = new ConexionBD().contenidoCorreo((String)listado[indice]);
//          texto.setText(contenido);
//             
        }
    }

    private Object[] crearListado() 
    {
        Object[] listadoNuevo = new Object[correos.size()];
        Iterator<Mensaje> iterador = correos.iterator();
        int indice = 0;
        while( iterador.hasNext() )
        {
            listadoNuevo[indice++] = iterador.next().getRemitente();
        }
        return listadoNuevo; 
    }   

    private void buscarContenido(Object selectedValue) 
    {
        Iterator<Mensaje> iterador = correos.iterator();
        
        while(iterador.hasNext())
        {
            Mensaje m=iterador.next();
            if(m.getRemitente().equals(selectedValue))
            { 
                texto.setText(m.getContenido());
            break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==botonEliminar)
        {
             
            String correoSeleccionado=(String)lista.getSelectedValue();
            conexion.eliminarcorreo(correoSeleccionado);
            correos=conexion.recuperarCorreos();
            listado=crearListado();
            lista=new JList<>(listado);
         
            scroll.setViewportView(lista);
            numeroCorreos.setText(String.valueOf(listado.length));
            
             
            //System.out.println(correoSeleccionado);
            
        }
            
        else if (e.getSource()==botonRedactar) 
            //hacemos otra cosa
                  
            
        {
            
           
            correos=conexion.recuperarCorreos();
            listado=crearListado();
            lista=new JList<>(listado);
            scroll.setViewportView(lista);
                        
            scroll.setViewportView(lista);      
            panel.setVisible(true);
            
            v2.setVisible(rootPaneCheckingEnabled);
            numeroCorreos.setText(String.valueOf(listado.length));  
            // contenedor.setVisible(false);
            //tarea obligatoria:            //debe agregarse al listado de remitentes
            //implementar el redactar correo
            //entrega jueves 25/05/2017
            //ponderacion 15 por ciento de la prueba 2
        }
  

                  
    }


 }
