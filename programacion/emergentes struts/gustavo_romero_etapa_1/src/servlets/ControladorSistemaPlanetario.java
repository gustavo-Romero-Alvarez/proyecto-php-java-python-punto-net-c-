package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ControladorSistemaPlanetario")
public class ControladorSistemaPlanetario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorSistemaPlanetario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String id_sistema_planetario = request.getParameter("id_sistema_planetario");
		String nombre = request.getParameter("nombre");
	
		
		GestionDatos gd = new GestionDatos();
		gd.insertarSistemaPlanetario(id_sistema_planetario, nombre);
		
		RequestDispatcher despachador = null;
		despachador = request.getRequestDispatcher("/home.jsp");
		despachador.forward(request, response);
	}

}
