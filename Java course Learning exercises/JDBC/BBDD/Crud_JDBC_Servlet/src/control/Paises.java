package control;

import beans.Pais;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import datos.DAOPais;

public class Paises extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String operacion;

        try {

            // Comprobamos el tipo de accion que se solicita
            operacion = request.getParameter("operacion");
            DAOPais op = new DAOPais();

            if (operacion.equals("alta")) {
                //ALTA
                op.Alta(recogerDatos(request));
                response.sendRedirect("paises?operacion=listado");
            } else if (operacion.equals("baja")) {
                // BAJA
                op.Baja(request.getParameter("cod"));
                response.sendRedirect("paises?operacion=listado");
            } else if (operacion.equals("detalle")) {
                // DETALLE
                request.setAttribute("paises", op.Detalle(request.getParameter("cod")));
                RequestDispatcher view = request.getRequestDispatcher("/detalle.jsp");
                view.forward(request, response);
            } else if (operacion.equals("modificacion")) {
                // MODIFICACION
                request.setAttribute("paises", op.Detalle(request.getParameter("cod")));
                RequestDispatcher view = request.getRequestDispatcher("/update.jsp");
                view.forward(request, response);
            } else if (operacion.equals("update")) {
                // UPDATE
                op.Update(recogerDatos(request));
                response.sendRedirect("paises?operacion=listado");
            } else if (operacion.equals("listado")) {
                // LISTADO
                request.setAttribute("paises", op.Listado());
                RequestDispatcher view = request.getRequestDispatcher("/listado.jsp");
                view.forward(request, response);
            }

        } catch (Exception e) {
            System.out.println("--------------------  FALLO  -----------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------------");
        }
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public Pais recogerDatos(HttpServletRequest request) {
        Pais p = new Pais();
        p.setCode(request.getParameter("code"));
        p.setNombre(request.getParameter("nombre"));
        p.setContinente(request.getParameter("continente"));
        p.setRegion(request.getParameter("region"));
        p.setPoblacion(Integer.parseInt(request.getParameter("poblacion")));
        p.setCapital(Integer.parseInt(request.getParameter("capital")));
        return p;
    }
}
