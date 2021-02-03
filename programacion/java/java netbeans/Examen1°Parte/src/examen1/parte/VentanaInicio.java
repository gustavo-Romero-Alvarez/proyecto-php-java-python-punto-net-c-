
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import examen1.parte.PruebaLectura;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;


/**
 *
 * @author SantoTomas
 */
public class VentanaInicio extends JFrame
{
    private Container contenedor;
    private JPanel panel;
    private JPanel panelBotones;
    private JPanel panelTraduccion;
    private JLabel etiquetaPalabra;
    private JLabel etiquetaTraduccion;
    private JTextField campoPalabra;
    private JTextField campoTraduccion;
    private JButton botonTraducir;
    private JButton botonLimpiar;
    private PruebaLectura traduccion;

  
    public VentanaInicio ()
    {
       super("Inicio de Sesion"); 
       contenedor = getContentPane();
       panel = new JPanel (new BorderLayout(4, 4));//cambiar 10,10
       
       panelTraduccion = new JPanel();
       panelTraduccion.setLayout(new GridLayout(4, 1));
       
       etiquetaPalabra = new JLabel("Usuario:");
       campoPalabra = new JTextField();
              
       campoTraduccion = new JTextField();
       etiquetaTraduccion = new JLabel("Contraseña:");
              
       panelTraduccion.add(etiquetaPalabra,0);
       panelTraduccion.add(campoPalabra,1);
       panelTraduccion.add(etiquetaTraduccion,2);
       panelTraduccion.add(campoTraduccion,3);
       
       panelBotones = new JPanel();
       panelBotones.setLayout(new FlowLayout());
       botonLimpiar = new JButton("Cerrar");
       botonTraducir = new JButton("iniciar Secion");

       
       
       botonTraducir.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) 
           {
               String palabra =campoPalabra.getText().trim();
               String traducciones =campoTraduccion.getText().trim();
               if(traduccion.devolverTraduccion(palabra,traducciones).equals("1"))
               {
               contenedor.setVisible(false);
               
               }
            
           }

            });
       
     
       panelBotones.add(botonTraducir);
       
       
       contenedor.add(panelTraduccion, BorderLayout.NORTH);
       contenedor.add(panelBotones, BorderLayout.SOUTH);
        //this.setTitle("correo");
        this.setSize(650,400);
       
        //this.pack();
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setVisible(true);
        this.setResizable(false);
        
        traduccion= new PruebaLectura();
    }


    
 
}
