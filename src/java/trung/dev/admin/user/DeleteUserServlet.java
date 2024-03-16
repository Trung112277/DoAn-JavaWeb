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
import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.dao.UserDao;

/**
 *
 * @author ĐMX
 */
public class DeleteUserServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        int id = Integer.parseInt(request.getParameter("id"));
        
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        userDao.delete(id);
        
        response.sendRedirect("IndexUserServlet");
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }
}
