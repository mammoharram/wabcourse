package edu.mum.cs;

import sun.nio.cs.StreamEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Calculator extends HttpServlet {
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int first = Integer.parseInt( req.getParameter("first").toString());
        int second = Integer.parseInt( req.getParameter("second").toString());
        int sum = first + second;

        int third = Integer.parseInt( req.getParameter("third").toString());
        int fourth = Integer.parseInt( req.getParameter("fourth").toString());
        int multi = third * fourth;
    }
}
