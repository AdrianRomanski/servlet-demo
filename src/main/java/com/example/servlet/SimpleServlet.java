package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(description = "Something", urlPatterns = {"/SimpleServletPath"})
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h3>Ale jestem kozakiem</h3>");
        writer.println("</body></html>");

        System.out.println("Hello from GET method.");
    }
}
