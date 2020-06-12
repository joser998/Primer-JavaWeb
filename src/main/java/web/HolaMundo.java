package web;
/* Primer Servlet */
/* Dentro de los Servlets no se recomienda usar codigo HTML para eso se usa los JSP's*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    
    /* Se hara una peticion de tipo do-Get */
    /* En este caso usamos el @Override ya que este metodo ya existe y desciende de la clase HttpServlet*/
    /*El metodo response nos obliga a usar la excepcion throws IOException, por eso la agregamos*/
    /* Podemos responder con texto tipo html*/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
/*Usamos el objeto response ya que estamos usando el mismo parametro en este metodo perteneciente a HttpServletResponse*/
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola mundo desde Servlet");
    }   
}