package com.javarush.module3.project3.quest.controller;

import com.javarush.module3.project3.quest.service.Authorization;
import com.javarush.module3.project3.quest.service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/quest")
public class AuthorizationServlet extends HttpServlet {
    Authorization authorization = new Authorization(UserService.USER_SERVICE);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/authorization.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean isSuccessAuthorization = processAuthorization(req);
        forwardPage(req, resp, isSuccessAuthorization);
    }

    private static void forwardPage(HttpServletRequest req, HttpServletResponse resp, boolean isSuccessAuthorization) throws ServletException, IOException {
        if (isSuccessAuthorization){
            req.getSession().setAttribute("successAuthorization", true);
            req.getRequestDispatcher("WEB-INF/firstQuestion.jsp").forward(req, resp);
        }else {
            req.getSession().setAttribute("successAuthorization", false);
            req.getRequestDispatcher("WEB-INF/authorization.jsp").forward(req, resp);
        }
    }

    private boolean processAuthorization(HttpServletRequest req) {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String buttonClicked = req.getParameter("buttonClicked");
        req.getSession().setAttribute("login", login);
        boolean isSuccessAuthorization;
        if (buttonClicked.equals("login")){
            isSuccessAuthorization = authorization.logInAcc(login, password);
        }else {
            isSuccessAuthorization = authorization.createAcc(login, password);
        }
        return isSuccessAuthorization;
    }
}
