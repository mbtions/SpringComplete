package assignment2;

import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");

        if (username != null && !username.isEmpty()) {
            session.setAttribute("username", username);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>Session set for user: " + username + "</h3>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (session != null && session.getAttribute("username") != null) {
            out.println("<h3>Welcome back, " + session.getAttribute("username") + "!</h3>");
        } else {
            out.println("<h3>No active session found.</h3>");
        }
    }
}
