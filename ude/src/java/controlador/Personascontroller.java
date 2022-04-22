
package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.*;
import java.io.IOException;
import personas.Personas;
import personas.PersonasC;

@WebServlet(name = "Personascontroller", urlPatterns = {"/Personascontroller"})
public class Personascontroller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PersonasC personasc = new PersonasC();
        String accion;
        RequestDispatcher dispatcher = null;
        
        accion = request.getParameter("accion");
        
        if(accion == null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("/Personas/mostrar.jsp");
            List<Personas> listarPersonas = personasc.listarPersonas();
            request.setAttribute("lista", listarPersonas);            
        } else if ("nuevo".equals(accion)){
            dispatcher = request.getRequestDispatcher("/Personas/agregar.jsp");
        } else if ("insertar".equals(accion)){
            int ci = Integer.parseInt(request.getParameter("ci"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            Personas persona = new Personas(ci, nombre, apellido);     
            personasc.insertar(persona);
            dispatcher = request.getRequestDispatcher("/Personas/mostrar.jsp");
            List<Personas> listarPersonas = personasc.listarPersonas();
            request.setAttribute("lista", listarPersonas);
        } else if ("modificar".equals(accion)){
            dispatcher = request.getRequestDispatcher("/Personas/modificar.jsp");
            int ci = Integer.parseInt(request.getParameter("ci"));
            Personas persona = personasc.mostrarPersonas(ci);
            request.setAttribute("persona", persona);                
        } else if ("actualizar".equals(accion)){
            int ci = Integer.parseInt(request.getParameter("ci"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            Personas persona = new Personas(ci, nombre, apellido);     
            personasc.actualizar(persona);
            dispatcher = request.getRequestDispatcher("/Personas/mostrar.jsp");
            List<Personas> listarPersonas = personasc.listarPersonas();
            request.setAttribute("lista", listarPersonas);
        } else if ("eliminar".equals(accion)){
            int ci = Integer.parseInt(request.getParameter("ci"));    
            personasc.eliminar(ci);
            dispatcher = request.getRequestDispatcher("/Personas/mostrar.jsp");
            List<Personas> listarPersonas = personasc.listarPersonas();
            request.setAttribute("lista", listarPersonas);
        }else {
            dispatcher = request.getRequestDispatcher("/Personas/mostrar.jsp");
            List<Personas> listarPersonas = personasc.listarPersonas();
            request.setAttribute("lista", listarPersonas);
        }
        dispatcher.forward(request, response);
       
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
