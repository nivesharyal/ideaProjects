package com.nivesh;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class SquareServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
//        int k =0;
//        Cookie cookies[] = request.getCookies();
//
//        for(Cookie c: cookies){
//            if(c.getName().equals("k"))
//                k = Integer.parseInt(c.getValue());
//        }

//        HttpSession session = request.getSession();
//       int k =(int) session.getAttribute("k");
       int k =(int) request.getAttribute("k");

        k = k * k;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("Result is : "+k);

//        System.out.println("sq called");

    }

}
