import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieServlet",urlPatterns = "/Success")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String UserName=request.getParameter("UserName");
        String Password= request.getParameter("Password");


        PrintWriter printWriter = response.getWriter();
        printWriter.println( "Hello " + UserName);

        Cookie c = new Cookie("cookieName",UserName);
        response.setContentType("text/html");
        response.addCookie(c);
        printWriter.println("<form action='cookieTest' method='POST'>");
        printWriter.println("<input type='submit' value='Login' />");
        printWriter.println("</form>");

        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
