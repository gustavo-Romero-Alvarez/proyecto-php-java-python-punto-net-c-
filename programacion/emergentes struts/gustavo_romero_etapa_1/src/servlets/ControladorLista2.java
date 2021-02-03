package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;

/**
 * Servlet implementation class ControladorLista2
 */
@WebServlet("/ControladorLista2")
public class ControladorLista2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorLista2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		GestionDatos gd = new GestionDatos();
		Usuario u = gd.getUsuario(request.getParameter("u"));
		
		request.setAttribute("usuario", u);
		RequestDispatcher despachador = request.getRequestDispatcher("/eliminar_usuario.jsp");
		despachador.forward(request, response);

	}

}
