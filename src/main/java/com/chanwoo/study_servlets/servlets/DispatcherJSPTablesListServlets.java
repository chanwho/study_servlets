package com.chanwoo.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.chanwoo.study_servlets.DatasInfor;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/DispatcherJSP/TablesListServlets")
public class DispatcherJSPTablesListServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DatasInfor datasInfor = new DatasInfor();
        ArrayList<String> tablesListWithString = datasInfor.getTablesListWithString();
        HashMap<String, String> searchForm = datasInfor.getSearchFormData();
        request.setAttribute("tablesListWithString", tablesListWithString);
        request.setAttribute("searchForm", searchForm);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tables_list.jsp");
        requestDispatcher.forward(request, response);
    }
}
