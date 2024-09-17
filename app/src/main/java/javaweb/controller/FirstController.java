package javaweb.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import common.constant.CommonConst;
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
            
            RequestDispatcher dispatcher = req.getRequestDispatcher(CommonConst.JSP_BASE_DIR + "/first.jsp");
            dispatcher.forward(req, res);
    }
}
