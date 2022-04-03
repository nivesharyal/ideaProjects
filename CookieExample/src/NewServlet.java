import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NewServlet",urlPatterns = "/cookieTest")
public class NewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter= response.getWriter();

        Cookie c[] = request.getCookies();
        if (c != null){
            for (Cookie b:c)
            {
             String value = b.getValue();
             printWriter.println(" Hello " + value);
            }
//            for(int i=0;i<c.length;i++ ){
//                String value = c[i].getValue();
//                printWriter.println(" Hello " + value);
//            }
        }
        //
   //     printWriter.println("Hey" + cookie[0].getName());///cookie name aauxa

        printWriter.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
