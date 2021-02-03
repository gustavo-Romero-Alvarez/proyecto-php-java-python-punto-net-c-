/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajlist;

import conexion.ConexionBD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import pojo.Mensaje;

public class ventana2  extends JFrame implements ListSelectionListener,ActionListener
{
    private Container contenedor;
    private JPanel panel;//panel principal
    private JPanel remitente;
    private JPanel contenido;
     private JPanel contenidoid;
    

    private JLabel etiquetaRemitente;
    private JLabel etiquetaContenido;
    private JLabel etiquetaNumeroCorreos;
    private JLabel etiquetaid;
    
    private JTextField numeroCorreos;
    private JPanel botones;
    private JList<Object>lista;
    private JTextArea texto, texto2,texto3;
    private JScrollPane scroll;
    private  Object[] listado;
    private ArrayList<Mensaje> correos;
    private JButton botonSalir;
    private JButton botonRedactar;
    private conexion.ConexionBD conexion;
    
    //otra ventana
    
  
  
   
    public ventana2()
    {
      
        
        contenedor = getContentPane();
        panel = new JPanel(new BorderLayout(4, 4));
        conexion = new ConexionBD();
        correos = conexion.recuperarCorreos();
        
        remitente = new JPanel(new BorderLayout(4,4));
        etiquetaRemitente = new JLabel("Mensaje: ");
        listado = crearListado();
        lista = new JList<>(listado);
        lista.addListSelectionListener(this);// con esto se registra para generar eventos
        scroll = new JScrollPane(lista);
        texto2 = new JTextArea(10,10);
        remitente.add(etiquetaRemitente, BorderLayout.NORTH);
        remitente.add(texto2, BorderLayout.EAST);
        
        contenido = new JPanel(new BorderLayout(4,4));
        etiquetaContenido = new JLabel("Mail: ");
        texto = new JTextArea(10,10);
        contenido.add(etiquetaContenido, BorderLayout.NORTH);
        contenido.add(texto, BorderLayout.WEST);
        
        contenidoid = new JPanel(new BorderLayout(2,2));
        etiquetaid = new JLabel("Identificacion: ");
        texto3 = new JTextArea(10,10);
        contenidoid.add(etiquetaid, BorderLayout.NORTH);
        contenidoid.add(texto3, BorderLayout.WEST);
                
        botones = new JPanel(new FlowLayout());
        etiquetaNumeroCorreos = new JLabel("Número correos");
        numeroCorreos = new JTextField();
        numeroCorreos.setText(String.valueOf(listado.length));//transforma int a String
        botonSalir = new JButton("Salir");
        botonRedactar = new JButton("agregar a base de datos");
        //registrar como botones de evento
        botonSalir.addActionListener(this);
        botonRedactar.addActionListener(this);
        
        botones.add(etiquetaNumeroCorreos);
        botones.add(numeroCorreos);
       
        botones.add(botonSalir);
        botones.add(botonRedactar);

        //texto2 = new JTextArea(25,40);
      
        panel.add(remitente, BorderLayout.EAST);//agregar elementos al panel
        panel.add(contenido, BorderLayout.CENTER);
         panel.add(contenidoid, BorderLayout.WEST);
         
        panel.add(botones, BorderLayout.SOUTH);
        
        contenedor.add(panel);
       
        //panel.add(texto2, BorderLayout.EAST);//Agregar texto 2 a panel
                     
        this.setTitle("llenado de correos");
        this.setSize(380,160);
        //this.pack();
        //350,150
         setResizable(false);
        this.setVisible(false);
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
        if (e.getSource()==botonSalir)
        {
            scroll.setViewportView(lista);
           
            String correoSeleccionado=(String)lista.getSelectedValue();
            conexion.eliminarcorreo(correoSeleccionado);
            correos=conexion.recuperarCorreos();
            listado=crearListado();
            lista=new JList<>(listado);
           
                   
            scroll.setViewportView(lista);      
            panel.setVisible(true);
            this.setVisible(false);
            numeroCorreos.setText(String.valueOf(listado.length));  
        }
            
        else if (e.getSource()==botonRedactar) 
            //hacemos otra cosa
        {
           
             scroll.setViewportView(lista);
            
             String remitente=texto.getText();
             String contenido=texto2.getText();
             String id=texto3.getText();
            //ventana1.setVisible(true);
            conexion.agregarcorreo(id,remitente,contenido);
           
             texto.setText("");
             texto2.setText("");
             texto3.setText("");
             numeroCorreos.setText(String.valueOf(listado.length));  

            //debe agregarse al listado de remitentes
            //tarea obligatoria:implementar el redactar correo
            //entrega jueves 25/05/2017
            //ponderacion 15 por ciento de la prueba 2
        }
       
                  
    }
}
