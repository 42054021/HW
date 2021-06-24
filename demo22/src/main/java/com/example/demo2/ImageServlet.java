package com.example.demo2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(name = "ImageServlet", value = "/image")
public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream is = getServletContext().getResourceAsStream("/image/QQ120201229171031.jpg");
        InputStream is2 = getClass().getClassLoader().getResourceAsStream("/QQ20201229171031.jpg");
        response.setContentType("image/jpeg");
        byte[] buffer = new byte[1024];
        OutputStream os = response.getOutputStream();
        int bytesRead = 0;
        while ((bytesRead = is2.read(buffer)) != -1 ) {
            os.write(buffer, 0,  bytesRead);
        }
        os.flush();
        os.close();
    }
}
