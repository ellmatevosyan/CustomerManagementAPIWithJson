package com.picsart.java;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q = req.getParameter("q");

        PrintWriter writer = resp.getWriter();

        writer.write("query:" + q);
        writer.write(LocalDate.now().toString() + '\n');
        writer.write(LocalTime.now().toString());
        writer.write("hello, people!");
    }
}
