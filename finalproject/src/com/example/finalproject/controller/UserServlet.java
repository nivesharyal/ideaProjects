 package com.example.finalproject.controller;

import com.example.finalproject.model.User;
import com.example.finalproject.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserServlet",urlPatterns = "/user")
public class UserServlet extends HttpServlet {

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        String page = request.getParameter("page");

        if (page.equalsIgnoreCase("register")) {

            User user = new User();
            user.setUserName(request.getParameter("userName"));
            user.setFullName(request.getParameter("fullName"));
            user.setPassword(request.getParameter("password"));


            UserService userService = new UserService();
            userService.insertUser(user);

            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }

        if (page.equalsIgnoreCase("login")) {
            String UserName = request.getParameter("userName");
            String Password = request.getParameter("password");

            User user = null;
            try {
                user = new UserService().getUser(UserName, Password);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            if (UserName != null) {
                HttpSession session = request.getSession();
                Cookie cookie = new Cookie("UserName", UserName);
                response.addCookie(cookie);
                session.setAttribute("userName", UserName);
                session.setAttribute("user", user);

                Cookie c = new Cookie("UserName",UserName);
                response.addCookie(c);

                RequestDispatcher requestDispatcher = request.getRequestDispatcher("page.jsp");
                requestDispatcher.forward(request, response);
            } else {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                requestDispatcher.include(request, response);
            }

        }
        if(page.equalsIgnoreCase("newUsers")){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("page/register.jsp");
            requestDispatcher.forward(request,response);
        }
        if(page.equalsIgnoreCase("index")){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(request,response);
        }

    }


    }

