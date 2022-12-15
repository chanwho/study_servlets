package com.chanwoo.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/formsSelectsServlet")
public class FormsSelectsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter printWriter = response.getWriter();

        printWriter.println();
        
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>Document</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div class='fs-3'>from selects</div>");
        printWriter.println("<div>");
        printWriter.println("<label for='' class='form-label'>select</label>");
        printWriter.println("<select class='form-select' aria-label='' multiple>");
        printWriter.println("<option>Open this select menu</option>");
        printWriter.println("<option value='M01'>One</option>");
        printWriter.println("<option value='M02' selected>Two</option>");
        printWriter.println("<option value='M03'>Three</option>");
        printWriter.println("<option value='M04' selected>Four</option>");
        printWriter.println("</select>");
        printWriter.println("</div>");
        printWriter.println("<div>");
        printWriter.println("<label for='' class='form-label'>select</label>");
        printWriter.println("<select class='form-select' aria-label=''>");
        printWriter.println("<option>Open this select menu</option>");
        printWriter.println("<option value='M01'>One</option>");
        printWriter.println("<option value='M02' selected>Two</option>");
        printWriter.println("<option value='M03'>Three</option>");
        printWriter.println("</select>");
        printWriter.println("</div>");
        printWriter.println("</body>");
        printWriter.println("</html>");
        printWriter.close();
    }
}
