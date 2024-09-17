package javaweb.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javaweb.service.SecondService;
import common.constant.*;

import javax.servlet.annotation.*;

@WebServlet("/second")
public class SecondController extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
            SecondService ss = new SecondService();
            req.setCharacterEncoding("UTF-8");

            String name = req.getParameter("name");
            System.out.println(name);

            req.setAttribute("name", ss.execute(name));
            RequestDispatcher rd = req.getRequestDispatcher(CommonConst.JSP_BASE_DIR + "/second.jsp");
            rd.forward(req, res);
    }
    
}
