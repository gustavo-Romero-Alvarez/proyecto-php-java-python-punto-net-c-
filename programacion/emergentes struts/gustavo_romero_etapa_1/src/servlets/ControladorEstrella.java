package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ControladorEstrella")
public class ControladorEstrella extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ControladorEstrella() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id_estrella = request.getParameter("id_estrella");
		String nombre = request.getParameter("nombre");
		String id_sistema_planetario = request.getParameter("id_sistema_planetario");
		
		GestionDatos gd = new GestionDatos();
		gd.insertarEstrella(id_estrella, nombre, id_sistema_planetario);
		
		RequestDispatcher despachador = null;
		despachador = request.getRequestDispatcher("/home.jsp");
		despachador.forward(request, response);
	}

}
