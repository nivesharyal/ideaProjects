import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet",urlPatterns = "/Success")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        String UserName=request.getParameter("UserName");
        String Password= request.getParameter("Password");

        if (UserName.equals("abc") && Password.equals("123")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("dashboard.jsp");
            Cookie ck = new Cookie("UserName",UserName );
            response.addCookie(ck);
            System.out.println(ck.getValue());
            Cookie cookie = new Cookie("password",Password);
            response.addCookie(cookie);
            System.out.println(cookie.getValue());
            requestDispatcher.forward(request, response);

        } else {

            printWriter.println("Invalid Username or Password.");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.include(request, response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
