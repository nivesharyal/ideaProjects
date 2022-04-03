import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet",urlPatterns = "/goal")
public class SecondServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        HttpSession session = request.getSession(false);
        String value= session.getAttribute("UserName").toString();
        String v= session.getAttribute("Password").toString();
        PrintWriter writer =response.getWriter();
        writer.println("Your entry name is "+ value + " And you have entered password as "+ v );
//        writer.println("Your entered password is "+ v );
//        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//        rd.include(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        HttpSession session = request.getSession();
//
//        int k =(int)session.getAttribute("k");
//        k = k * k;
//        PrintWriter out = response.getWriter();
//        out.println("Result is "+k);
////        System.out.println("Goal is called");
    }
}
