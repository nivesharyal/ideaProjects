package com.nivesh;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    int i =Integer.parseInt(request.getParameter("num1"));
    int j =Integer.parseInt(request.getParameter("num2"));

    int k = i+j;
//
//        Cookie cookie = new Cookie("k",k +"");
//        response.addCookie(cookie);
//
//        response.sendRedirect("sq");

//        HttpSession session = request.getSession();//session
//        session.setAttribute("k",k);//session
//          response.sendRedirect("sq");//session

//        response.sendRedirect("sq?k=" + k);  //URL Rewriting
        request.setAttribute("k",k);

        RequestDispatcher rd = request.getRequestDispatcher("sq");
        rd.forward(request,response);



}
}
