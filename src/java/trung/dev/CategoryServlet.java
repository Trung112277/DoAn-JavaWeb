/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package trung.dev;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import trung.dev.data.dao.CategoryDao;
import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.dao.ProductDao;
import trung.dev.data.model.Category;
import trung.dev.data.model.Product;

/**
 *
 * @author ĐMX
 */
public class CategoryServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("categoryId") == null) {
            request.getRequestDispatcher("404.jsp").include(request, response);
        } else {
            int categoryId = Integer.parseInt(request.getParameter("categoryId"));
            CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
            Category category = categoryDao.find(categoryId);
            ProductDao productDao = DatabaseDao.getInstance().getProductDao();
            List<Product> productList = productDao.findByCategory(categoryId);
            List<Category> categoryList = categoryDao.findAll();
            request.setAttribute("productList", productList);
            request.setAttribute("category", category);
            request.setAttribute("categoryList", categoryList);

            request.getRequestDispatcher("category.jsp").include(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
