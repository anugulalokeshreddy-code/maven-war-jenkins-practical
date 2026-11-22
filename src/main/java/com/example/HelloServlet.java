package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Hello Servlet</title></head><body>");
            out.println("<h1>Welcome to the Maven WAR Jenkins Practical!</h1>");
            out.println("<p>Your Servlet is running successfully on Tomcat 9.</p>");
            out.println("<a href=\"index.jsp\">Back to Home</a>");
            out.println("</body></html>");
        }
    }
}