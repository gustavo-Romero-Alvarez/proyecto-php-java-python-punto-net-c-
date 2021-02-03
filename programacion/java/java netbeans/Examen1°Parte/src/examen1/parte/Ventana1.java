
package examen1.parte;

import conexion.ConexionBD;
import java.awt.Container;
import javax.swing.JPanel;
import conexion.ConexionBD;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Ventana1 extends JFrame implements ListSelectionListener, ActionListener 
{
    private Container contenedor;
    private JPanel panel;
    private JPanel panelBotones;
    private JButton botonIngreso;
    private JButton botonSalir;
    private JButton botonRegistro;
    private conexion.ConexionBD conexion;
    
    public Ventana1()
    {
        conexion = new ConexionBD();
        
        contenedor = getContentPane();
        panel = new JPanel (new BorderLayout(2,4));
        
      
        panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        botonIngreso = new JButton("Realizar ficha");
        botonRegistro = new JButton("Registrar paciente");
        botonSalir = new JButton("Salir");
        
        botonIngreso.addActionListener(this);
        botonRegistro.addActionListener(this);
        botonSalir.addActionListener(this);
        
        panelBotones.add(botonIngreso,0);
        panelBotones.add(botonRegistro,1);
        panelBotones.add(botonSalir,2);
        
        contenedor.add(panelBotones);
        contenedor.setVisible(true);
        this.setTitle("Menu de Inicio");
        this.setSize(300,300);
          setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setVisible(true);
        
        
   
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == botonIngreso)
        {
           Object obj = e.getSource();
             if (obj == botonIngreso)
             {
                 VentanaIngreso objeto_ventana2= new VentanaIngreso();            
                 objeto_ventana2.setVisible(true);              
                
             }
            
        }
        else if (e.getSource() == botonRegistro)
        {
            Object obj = e.getSource();
             if (obj == botonRegistro)
             {
                 VentanaPaciente objeto_ventana2= new VentanaPaciente();            
                 objeto_ventana2.setVisible(true);
                
                
             }
           
        }
        else if (e.getSource() == botonSalir)
        {
            
          System.exit(0);
        }               
    }

    
}
