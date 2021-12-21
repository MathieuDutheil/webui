package com.mathieudutheil.escalade.webui;


import com.mathieudutheil.escalade.core.service.AuthentificationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="AuthentificationServlet", urlPatterns = "/login")
public class AuthentificationServlet extends HttpServlet {

    private AuthentificationService authentificationService;
    public void init() {
        authentificationService = new AuthentificationService();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        if ((login.equals("michel") && password.equals("123456")) || (login.equals("caroline") && password.equals("abcdef"))) {
            out.println("<html>");
            out.println("<body>");
            out.println("<p>Vous vous êtes authentifié avec succès " + login + "/" + password + "</p>");
            out.println("<p><a href=\"home.jsp\">Retour à la page d'accueil</a>");
            HttpSession session = request.getSession();
            session.setAttribute("identifiant", login);
            out.println("</body>");
            out.println("</html>");
        } else {
            out.println("<html>");
            out.println("<body>");
            out.println("<p>Authentification raté " + login + "/" + password + "</a>");
            out.println("<p><a href=\"login.html\">Recommencez la saisie</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
