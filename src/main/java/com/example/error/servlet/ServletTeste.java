package com.example.error.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/// http://localhost:8080/Error_war_exploded/ServletTeste
@WebServlet(name = "ServletTeste", value = "/ServletTeste")
public class ServletTeste extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        throw new ServletException("Esta exceção é um teste");
    }
}
