package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ControladorPlaneta")
public class ControladorPlaneta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ControladorPlaneta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id_planeta = request.getParameter("id_planeta");
		String id_estrella = request.getParameter("id_estrella");
		String id_tipo = request.getParameter("id_tipo");
		String nombre = request.getParameter("nombre");
		String simbologia = request.getParameter("simbologia");
		
		String diametro_ecuatorial =request.getParameter("diametro_ecuatorial");
		String masa =request.getParameter("masa");
		String radio_orbital = request.getParameter("radio_orbital");
		String periodo_orbital = request.getParameter("periodo_orbital");
		String periodo_rotacion =request.getParameter("periodo_rotacion");
		
		String composicion_atmosfera = request.getParameter("composicion_atmosfera");
		String imagen = request.getParameter("imagen");
	
		
		
		GestionDatos gd = new GestionDatos();
		gd.insertarPlaneta(id_planeta, nombre, simbologia, diametro_ecuatorial, masa, radio_orbital, periodo_orbital, periodo_rotacion, composicion_atmosfera, imagen, id_estrella, id_tipo);
		
		RequestDispatcher despachador = null;
		despachador = request.getRequestDispatcher("/home.jsp");
		despachador.forward(request, response);
		
		System.out.println(id_planeta);
		System.out.println(id_estrella);
		System.out.println(id_tipo);
		System.out.println(nombre);
		System.out.println(simbologia);
		
		System.out.println(diametro_ecuatorial);
		System.out.println(masa);
		System.out.println(radio_orbital);
		System.out.println(periodo_orbital);
		System.out.println(periodo_rotacion);
		
		System.out.println(composicion_atmosfera);
		System.out.println(imagen);
	
	}

}
