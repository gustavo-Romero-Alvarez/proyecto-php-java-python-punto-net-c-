package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

public class ControladorBuscar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControladorBuscar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String datousuario = request.getParameter("datousuario");
		String tipo = request.getParameter("tipo");
        RequestDispatcher despachador = null;
		
		//GestionDatos gd = new GestionDatos();
	
			despachador = request.getRequestDispatcher("/resultadoBuscar2.jsp");
			despachador.forward(request, response);
			
		
		
	}
}
