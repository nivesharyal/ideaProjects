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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
        response.setContentType("text/html");
        PrintWriter pw =response.getWriter();
        String UserName = request.getParameter("UserName");
        String Password = request.getParameter("Password");

        HttpSession session = request.getSession();
        session.setAttribute("UserName",UserName);
        session.setAttribute("Password",Password);
        pw.println("Username is "+ UserName +" Password is "+Password);
        response.sendRedirect("goal");
//        RequestDispatcher rd =request.getRequestDispatcher("/goal");
//        rd.forward(request,response);
    }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//            int i = Integer.parseInt(request.getParameter("num1"));
//            int j = Integer.parseInt(request.getParameter("num2"));
//
//            int k = i + j;
//
//            HttpSession session = request.getSession();
//            session.setAttribute("k", k);
//            response.sendRedirect("goal");

        }
    }
