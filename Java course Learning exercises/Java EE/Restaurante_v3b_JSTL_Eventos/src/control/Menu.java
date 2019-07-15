package control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datos.DaoMenu;
import datos.DaoMenuImpl;
import modelo.Pedido;
import modelo.Usuario;

/**
 *
 * @author Antonio
 */
@WebServlet(urlPatterns = { "/Menu" })
public class Menu extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request  servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException      if an I/O error occurs
	 */
	protected void processRequestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String origen = request.getParameter("opcion");
		// Si vienes de la pagina 1, vas a la 2
		if (origen.contentEquals("p1")) {
			processMenu(request, response);
		} else if (origen.contentEquals("p2")) {
			// Vienes de la pagina 2 y vas a la 3
			processPeticion(request, response);
		}
	}

	// Esto es más parecido a como funciona Spring

	protected void processMenu(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Paso 01: Recoger Parametros
		Usuario cliente = new Usuario();
		cliente.setNombre(request.getParameter("nombre"));
		cliente.setHabitacion(request.getParameter("habitacion"));
		System.out.println("--- " + cliente);
		HttpSession session = request.getSession();
		session.setAttribute("cliente", cliente);

		// Paso 02: Buscar información
		DaoMenu menu = new DaoMenuImpl();
		System.out.println(menu.getMenuDia());
		request.setAttribute("menuDia", menu.getMenuDia());

		// Paso 03: Salir
		RequestDispatcher view;
		view = request.getRequestDispatcher("mostrarMenu.jsp");
		view.forward(request, response);
	}

	protected void processPeticion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Vengo de la 2 y voy a la 3

		HttpSession session = request.getSession(false);
		if (session == null) {
			System.out.println("-- Sesion nula");
			response.sendRedirect("restaurante.html");
            //return;
		} else {
			// Paso 01: Recoger Parametros
			String primero = request.getParameter("primero");
			String segundo = request.getParameter("segundo");
			String postre = request.getParameter("postre");
			Pedido pedido = new Pedido();
			pedido.setPrimero(primero);
			pedido.setSegundo(segundo);
			pedido.setPostre(postre);
			request.setAttribute("pedido", pedido);

			// Paso 02: Buscar informacion

			// Paso 03: Salir
			RequestDispatcher view;
			view = request.getRequestDispatcher("pedidoRealizado.jsp");
			view.forward(request, response);
		}
	}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request  servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException      if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequestHandler(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request  servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException      if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequestHandler(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
