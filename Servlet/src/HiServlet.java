import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HiServlet")
public class HiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String UserName = request.getParameter("UserName");
        String Password = request.getParameter("Password");
        String Gender = request.getParameter("Gender");
        String Course = request.getParameter("Course");
        String []b = request.getParameterValues("Bike");


        System.out.println("UserName is" +UserName+ "Password is "+Password);
        PrintWriter printWriter = response.getWriter();
        printWriter.println(UserName);
    }
}
