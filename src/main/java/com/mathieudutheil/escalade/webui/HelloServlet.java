package com.mathieudutheil.escalade.webui;

import com.mathieudutheil.escalade.core.dto.CiviliteDto;
import com.mathieudutheil.escalade.core.service.CiviliteService;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private CiviliteService civiliteService;
    private CiviliteDto civiliteDto;
    String test;
    public void init() {
        message = "Hello World!";
        civiliteService = new CiviliteService();
        civiliteDto = civiliteService.getCivilite((byte) 3);
        test = civiliteDto.getCivilite();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + test + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}