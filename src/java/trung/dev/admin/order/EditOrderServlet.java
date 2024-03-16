/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package trung.dev.admin.order;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import trung.dev.BaseServlet;
import trung.dev.data.dao.CategoryDao;
import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.dao.OrderDao;
import trung.dev.data.model.Category;
import trung.dev.data.model.Order;

/**
 *
 * @author ĐMX
 */
public class EditOrderServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        int id = Integer.parseInt(request.getParameter("id"));
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        Order order = orderDao.find(id);
        
        request.setAttribute("order", order);
        request.getRequestDispatcher("admin/order/edit.jsp").include(request, response);
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        Order order = orderDao.find(id);
        order.setStatus("finished");
        orderDao.update(order);
        
        response.sendRedirect("IndexOrderServlet");
    }
}
