package com.chanwoo.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dispatcherServlets")
public class DispatcherServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String hiddenParam = request.getParameter("hiddenParam");

        // /dispatcherServlets?hiddenParam=searchFormServlet
        // 만약 히든파람에 데이터가 들어오면 저곳으로 redirect한다
        if ("searchFormServlet".equals(hiddenParam)){
            response.sendRedirect("/searchFormServlet");

        // /dispatcherServlets?hiddenParam=createCookieServlets
        // 히든파람 데이터가 들어와서 createCookieServlets로 이동할때
        } else if ("createCookieServlets".equals(hiddenParam)){
            request.setAttribute("firstName", "yojulab");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/cookies/createServlets");
            requestDispatcher.forward(request, response);
        } else {
            // normal display
            String message = "DispatcherServlets with Message !";
            PrintWriter printWriter =  response.getWriter();

            printWriter.println("<html lang='en'>");
            printWriter.println("<head>");
            printWriter.println("<title>"+message+"</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<button>call DispatcherServlets</button>");
            printWriter.println("</form>");
            
            printWriter.println("</body>");
            printWriter.println("</html>");

            printWriter.close();
        }
    }
}