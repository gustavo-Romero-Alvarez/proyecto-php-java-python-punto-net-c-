package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("contrasenia");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String tipo = request.getParameter("tipo");
		
		GestionDatos gd = new GestionDatos();
		gd.insertarUsuario(usuario, contrasenia, nombre, apellido, tipo);
		
		RequestDispatcher despachador = null;
		despachador = request.getRequestDispatcher("/home.jsp");
		despachador.forward(request, response);
		
//		System.out.println(usuario);
//		System.out.println(contrasenia);
//		System.out.println(nombre);
//		System.out.println(apellido);
//		System.out.println(tipo);
	}

}
