import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "LoginServlet",urlPatterns = "/Success")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String UserName=request.getParameter("UserName");
        String Password= request.getParameter("Password");

        PrintWriter writer= response.getWriter();

        if(Password.equals("Java"))
        {
            RequestDispatcher rd = request.getRequestDispatcher("dash.jsp");
            rd.forward(request,response);
        }else{
            writer.println("<b> Incorrect Username or Password:</b>");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request,response);
        }

        System.out.println("UserName is:"+UserName+"Password is:"+Password);
        PrintWriter printWriter = response.getWriter();
        printWriter.println(UserName);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
