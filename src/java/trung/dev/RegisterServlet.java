/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package trung.dev;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
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
public class RegisterServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.getRequestDispatcher("register.jsp").include(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        User user = userDao.find(email);
        if (user == null) {
            userDao.insert(new User(email, email, "user"));
            response.sendRedirect("LoginServlet");
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("message", "Email was existed.");
            response.sendRedirect("RegisterServlet");
        }
    }
}
