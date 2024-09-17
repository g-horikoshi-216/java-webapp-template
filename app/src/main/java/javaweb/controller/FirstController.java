package javaweb.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import javaweb.service.*;

@WebServlet("/first")
public class FirstController extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws IOException, ServletException {
            String input = "hello!";
            FirstService fs = new FirstService();
            String message = fs.processString(input);

            req.setAttribute("message", message);
            
            // JSPにフォワード（パスを修正）
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/first.jsp");
            dispatcher.forward(req, res);
    }
}
