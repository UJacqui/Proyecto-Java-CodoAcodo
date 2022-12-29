package com.codoacodo.codoacodo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet" , value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String mensaje;

    public void init() {
        mensaje = "Hello world!!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
//hace lecturas
        response.setContentType("text/html");

        //muestra por pantalla
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + mensaje + "<h1>");
        out.println("</body></html>");
    }

    public void destroy(){

    }

}
