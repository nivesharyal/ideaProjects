import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet",urlPatterns = "/Success")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw =response.getWriter();
        String UserName = request.getParameter("UserName");
        String Password = request.getParameter("Password");

        pw.println("<form action ='cookieTest' method='post'>");
        pw.println("Hello"+UserName);
        pw.println("<input type='hidden' name='UserName' value='"+UserName+"'/>");
        pw.println("<input type='submit' value='Next'/>");
        pw.println("</form>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
