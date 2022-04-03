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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String UserName=request.getParameter("UserName");
        String Password= request.getParameter("Password");
        PrintWriter writer = response.getWriter();


        HttpSession session = request.getSession();//session
        session.setAttribute("UserName",UserName);
        writer.println( " Hello "+ UserName);
        writer.println("<a href = 'goal?uName="+ UserName +"'>Next</a>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
