/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package trung.dev.admin.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import javax.management.relation.Role;
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
public class EditUserServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        int id = Integer.parseInt(request.getParameter("id"));
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        User user = userDao.find(id);
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        List<User> userList = userDao.findAll();
        
        request.setAttribute("userList", userList);
        request.setAttribute("user", user);
        request.getRequestDispatcher("admin/user/edit.jsp").include(request, response);
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String role = request.getParameter("role");
        
        User user = new User(id, email, password, role);
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        userDao.update(user);
        response.sendRedirect("IndexUserServlet");
    }
}
