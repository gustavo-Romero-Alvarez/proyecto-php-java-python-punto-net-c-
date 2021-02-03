package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;


public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String tipo = request.getParameter("tipo");
		
		RequestDispatcher despachador = null;
		
		GestionDatos gd = new GestionDatos();
		if(gd.autenticarUsuario(user, pass, tipo))
		{
			Usuario usuario = gd.getUsuario(user);
			
			request.getSession().setAttribute("nombre",usuario.getNombre());
			request.getSession().setAttribute("apellido",usuario.getApellidos());
			request.getSession().setAttribute("tipo",usuario.getTipo());
			
			despachador = request.getRequestDispatcher("/home.jsp");
		}
		else
			despachador = request.getRequestDispatcher("/index.html");
		
		despachador.forward(request, response);
	}
}





