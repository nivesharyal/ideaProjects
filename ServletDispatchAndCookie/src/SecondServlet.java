import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet",urlPatterns = "/cookieTest")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        Cookie cookies = null;
        Cookie cookie[] = request.getCookies();
        if (cookie != null){
            for (int i = 0; i< cookie.length; i++){
                cookies = cookie[i];
                String name = cookies.getName();
                String value = cookies.getValue();
                printWriter.print("Name : " + name + ",  ");
                printWriter.print("Value: " + value + " <br/>");
            }
        }else{
            printWriter.print("No Cookies Found");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
