/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package trung.dev.admin.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import trung.dev.BaseServlet;
import trung.dev.data.dao.CategoryDao;
import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.dao.ProductDao;
import trung.dev.data.dao.UserDao;
import trung.dev.data.model.Category;
import trung.dev.data.model.Product;
import trung.dev.data.model.User;

/**
 *
 * @author ĐMX
 */
public class CreateUserServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        request.getRequestDispatcher("admin/user/create.jsp").include(request, response);
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String role = request.getParameter("role");
        
        User user = new User(email, password, role);
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        userDao.insert(user);
        
        response.sendRedirect("IndexUserServlet");
    }
}
