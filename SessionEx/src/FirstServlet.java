import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet",urlPatterns = "/Success")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        String UserName = request.getParameter("username");
        String Password = request.getParameter("password");
        PrintWriter writer = response.getWriter();

        if (UserName.equalsIgnoreCase("Nivesh") && Password.equals("123")){
            HttpSession session = request.getSession();
            session.setAttribute("username", UserName);
            session.setAttribute("password", Password);

            writer.println("Welcome You Can View Your Details By Clicking <br>");
            writer.println("<a href = 'dashboard' > View Details </a>");
        }else{
            writer.println("Incorrect Username or Password");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.include(request,response);
        }
    }
}
