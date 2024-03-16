/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package trung.dev.admin.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import trung.dev.BaseServlet;
import trung.dev.admin.BaseAdminServlet;
import trung.dev.data.dao.CategoryDao;
import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.model.Category;

/**
 *
 * @author ĐMX
 */
public class EditCategoryServlet extends BaseAdminServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        super.doGet(request, response);
        int id = Integer.parseInt(request.getParameter("id"));
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        Category category = categoryDao.find(id);
        
        request.setAttribute("category", category);
        request.getRequestDispatcher("admin/category/edit.jsp").include(request, response);
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        Category category = new Category(id, name, description);
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        categoryDao.update(category);
        
        response.sendRedirect("IndexCategoryServlet");
    }
}
