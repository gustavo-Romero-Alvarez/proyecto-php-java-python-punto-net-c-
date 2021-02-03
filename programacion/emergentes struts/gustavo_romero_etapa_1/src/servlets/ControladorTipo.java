package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ControladorTipo")
public class ControladorTipo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorTipo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id_tipo = request.getParameter("id_tipo");
		String nombre = request.getParameter("nombre");
	
		
		GestionDatos gd = new GestionDatos();
		gd.insertarTipo(id_tipo, nombre);
		
		RequestDispatcher despachador = null;
		despachador = request.getRequestDispatcher("/home.jsp");
		despachador.forward(request, response);
		
	}

}
