package com.math;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/math")
public class Math extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String ariph = req.getParameter("+-");

        Logic logic = new Logic();
        int toX = 0, toY = 0;

        try {
            toX = Integer.parseInt(x);
            toY = Integer.parseInt(y);
            String result = logic.check(ariph);
            if (result=="Error value"){
                resp.getWriter().write("Error");
            }
            else {
                String res = logic.Ariph(toX, toY, ariph);
                resp.getWriter().write(x + " " + ariph + " " + y + " = " + res);
                System.out.println(x + " " + ariph + " " + y + " = " + res);
            }
        } catch (NumberFormatException n) {
            System.err.println("Error value");
            resp.getWriter().write("Try again! Enter correct value!");
        }
    }
}



