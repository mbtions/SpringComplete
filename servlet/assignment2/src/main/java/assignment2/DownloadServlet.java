package assignment2;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {

	public DownloadServlet() {
        super();
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
        String filepath = "D:\\Meenakshi\\" + filename;

        File file = new File(filepath);
        if (file.exists()) {
        	
            response.setContentType("text/plain");
            response.setHeader("Content-Disposition", "inline; filename=\"" + filename + "\"");
            FileInputStream fileInputStream = new FileInputStream(file);
            OutputStream out = response.getOutputStream();
            

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            fileInputStream.close();
            out.close();
        } else {
            response.getWriter().println("File not found!"+filepath);
        }
    }
}
