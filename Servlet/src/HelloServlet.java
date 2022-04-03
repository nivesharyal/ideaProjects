
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/Success")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String UserName = request.getParameter("UserName");
        String Password = request.getParameter("Password");
        String Gender   = request.getParameter("Gender");
        String Course   = request.getParameter("Course");
        String b[]      = request.getParameterValues("bike");
        if(b !=null){
            for (String a:b) {
                System.out.println(a);

            }
        }

        if(Password.isEmpty()){
            System.out.println("Cannot be empty ");
        }

        System.out.println(" UserName is: "+UserName+" Password is: " +Password+" Gender is : " +Gender+ " Course is :"+Course);
        PrintWriter printWriter = response.getWriter();
        printWriter.println(UserName);
        printWriter.println(Password);
        printWriter.println(Gender);
        printWriter.println(Course);
        printWriter.println(b);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
