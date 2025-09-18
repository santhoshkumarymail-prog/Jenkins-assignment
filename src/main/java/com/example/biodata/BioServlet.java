package com.example.biodata;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class BioServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
