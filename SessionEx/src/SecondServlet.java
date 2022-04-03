import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet",urlPatterns = "/dashboard")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        HttpSession session = request.getSession(false);
        if (session != null) {
            String UserName = session.getAttribute("username").toString();
            String Password = (String) session.getAttribute("password");
            writer.println("Your Username is: " + UserName + " and Password is : " +Password);
            writer.println("<a href = 'logout'> Logout</a>");
        }else{
            writer.println("Please Login");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.include(request,response);
        }
    }
}
