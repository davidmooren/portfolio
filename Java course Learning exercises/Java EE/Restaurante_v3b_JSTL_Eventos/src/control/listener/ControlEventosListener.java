package control.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Antonio Santos
 */
/*
 En el web.xml hubieramos escrito
 <listener>
 <description>ServletContextListener, HttpSessionListener, RequestListener</description>
 <listener-class>Listener.ControlEventosListener</listener-class>
 </listener> 
 */
@WebListener("ServletContextListener, HttpSessionListener, RequestListener")
public class ControlEventosListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {

    ServletContext servletContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        servletContext = sce.getServletContext();
        servletContext.log("--- metodo invocado: contextInitialized");
        //Vamos a hacer un caso practico
        // Creo un contexto
        ServletContext context = sce.getServletContext();
        // Obtengo el parametro guardado como <context-param>
        String frase = context.getInitParameter("despedida");
        // Lo paso a atributo para que lo puedan utilizar (mirar en pedidoRealizado.jsp) 
        context.setAttribute("frasefinal", frase+",majete");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        servletContext.log("--- metodo invocado: contextDestroyed");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        servletContext.log("--- metodo invocado: sessionCreated");
        //numSesiones++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        servletContext.log("--- metodo invocado: sessionDestroyed");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        servletContext.log("--- metodo invocado: requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        servletContext.log("--- metodo invocado: requestInitialized");
    }
}
