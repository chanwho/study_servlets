package com.chanwoo.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloWorldServelts") // 숨겨진주소매핑
public class HelloWorldServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String firstName = request.getParameter("firstName");
        String secondName = request.getParameter("secondName");
        String hiddenParam = request.getParameter("hiddenParam");


        String message = "HelloWorldServlets!!!";
        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>"+message+"</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div>"+message+"</div>");

        printWriter.println("<div> firstName : "+firstName+"</div>");
        printWriter.println("<div> SecondName : "+secondName+"</div>");
        printWriter.println("<form action='/helloWorldServelts' method='get'>");
        printWriter.println("<input type='text' name='firstName' id='' value='"+firstName+"' />");
        printWriter.println("<input type='text' name='secondName' id='' value='"+secondName+"' />");
        printWriter.println(hiddenParam);
        printWriter.println("<button>helloWorldServelts</button>");
        printWriter.println("</form>");

        printWriter.println("</body>");
        printWriter.println("</html>");
        // printWriter.println(printWriter.println("<div>HelloWorldServlets!</div>"););
        printWriter.close();
    }
}
