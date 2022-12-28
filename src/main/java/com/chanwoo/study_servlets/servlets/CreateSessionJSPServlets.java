package com.chanwoo.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /CreateSessionJSPServlets?username=yojulab&password=1234
@WebServlet(urlPatterns="/CreateSessionJSPServlets")
public class CreateSessionJSPServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // display
        HttpSession httpSession = null;
        HttpSession httpSession_false = null;
        
        String path = null;
        if("yojulab".equals(username) && "1234".equals(password)){
            // login 
            httpSession_false = request.getSession(false); // 존재하면 session 인스턴스화
            if (httpSession == null){
                httpSession = request.getSession();  // 그냥 session 인스턴스화 실행
                httpSession.setAttribute("username", username);
                httpSession.setAttribute("password", password);
            }
            path = "/session/checkLogin.jsp";

            System.out.println(httpSession.getAttribute("username"));
        } else{
            // logout 
            httpSession = request.getSession(false);
            if (httpSession != null){
                httpSession.invalidate();
            }
            // System.out.println(httpSession.getAttribute("username")); // null 체크필요
            // System.out.println(httpSession.getId()); //null 체크필요
            path = "/session/checkLogout.jsp";
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }
}