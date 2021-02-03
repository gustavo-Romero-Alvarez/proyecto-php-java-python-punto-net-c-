package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;


public class ControladorEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEliminar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	String usuario = request.getParameter("usuario");
	String contrasenia = request.getParameter("contrasenia");
	String nombre = request.getParameter("nombre");
	String apellidos = request.getParameter("apellidos");
	String tipo = request.getParameter("tipo");
	

	Usuario u = new Usuario();
	u.setUsuario(usuario);

	
	new GestionDatos().eliminarUsuario(u);
	
	RequestDispatcher despachador = null;
	despachador = request.getRequestDispatcher("/usuarios.jsp");
	despachador.forward(request, response);
	}
}
