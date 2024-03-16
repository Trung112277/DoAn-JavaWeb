/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package trung.dev;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.dao.UserDao;
import trung.dev.data.model.User;

/**
 *
 * @author ĐMX
 */
public class LoginServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
            response.sendRedirect("HomeServlet");
        }
        request.getRequestDispatcher("login.jsp").include(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        User user = userDao.find(email);
        if (user == null) {
            response.sendRedirect("LoginServlet");
        } else {
            if (user.getPassword().equals(password)) {
                response.sendRedirect("HomeServlet");
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
            }
        }
    }
}
