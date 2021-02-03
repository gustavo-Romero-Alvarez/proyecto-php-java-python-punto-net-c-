package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;


public class ControladorActualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorActualizar() {
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
		
		System.out.print(usuario);
		System.out.print(contrasenia);
		System.out.print(nombre);
		System.out.print(apellidos);
		System.out.print(tipo);
		
		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setContrasenia(contrasenia);
		u.setNombre(nombre);
		u.setApellidos(apellidos);
		u.setTipo(tipo);
		
		new GestionDatos().actualizarUsuario(u);
		
		RequestDispatcher despachador = null;
		despachador = request.getRequestDispatcher("/usuarios.jsp");
		despachador.forward(request, response);
	}

}
