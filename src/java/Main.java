
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Krishna Paul
 */
public class Main extends HttpServlet
{

    /**
     * Store cars class name
     *
     * @type String
     * @final
     * @access private
     */
    private final String[] cars =
    {
        "Lamborghini",
        "Maruti",
    };
    private Object instance;
    private ArrayList<String> status;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InvocationTargetException
    {
        if ("POST".equals(request.getMethod()))
        {
            this.createInstance(Integer.parseInt(request.getParameter("car")));
            this.start();

            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<h2>" + this.cars[Integer.parseInt(request.getParameter("car"))] + " Car status:</h2><hr>");
            response.getWriter().println("<ul>");

            for (int counter = 0; counter < status.size(); counter++)
            {
                response.getWriter().println("<li>" + status.get(counter) + "</li>");
            }
            response.getWriter().println("</ul>");
            response.getWriter().println("<a href='index.jsp'>Back to main page</a>");
        }
        else 
        {
            response.sendRedirect("index.jsp");
        }
    }

    private void createInstance(int carIndex)
    {
        try
        {
            Class car;
            car = Class.forName("cars." + this.cars[carIndex]);
            this.instance = car.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e)
        {
        }
    }

    private void start() throws InvocationTargetException
    {
        try
        {
            this.status = (ArrayList<String>) this.instance.getClass().getMethod("start", (Class<?>[]) (null)).invoke(this.instance, (Object[]) null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e)
        {
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (InvocationTargetException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (InvocationTargetException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }

}
