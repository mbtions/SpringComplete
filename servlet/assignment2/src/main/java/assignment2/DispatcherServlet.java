package assignment2;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        if ("include".equals(action)) {
            RequestDispatcher rd = request.getRequestDispatcher("IncludeServlet");
            out.println("<h3>Before including the IncludeServlet content</h3>");
            rd.include(request, response);
            out.println("<h3>After including the IncludeServlet content</h3>");
        } else if ("forward".equals(action)) {
            RequestDispatcher rd = request.getRequestDispatcher("ForwardServlet");
            rd.forward(request, response);
        } else {
            out.println("<h3>Invalid action</h3>");
        }
    }
}
