package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");

        try (var out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Random Number</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align=center>"+this.getServletInfo()+"</h1>");
            out.println("</br>");
            out.println("<h1 align=center>"+(int)(Math.random()*100)+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    @Override
    public String getServletInfo() {
        return "Shows a random number!\n";
    }

}