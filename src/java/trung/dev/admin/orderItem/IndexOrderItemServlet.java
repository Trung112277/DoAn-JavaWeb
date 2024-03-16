/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package trung.dev.admin.orderItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import trung.dev.BaseServlet;
import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.dao.OrderItemDao;
import trung.dev.data.model.OrderItem;

/**
 *
 * @author ĐMX
 */
public class IndexOrderItemServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        int orderId = Integer.parseInt(request.getParameter("orderId"));
        
        OrderItemDao orderItemDao = DatabaseDao.getInstance().getOrderItemDao();
        List<OrderItem> orderItemList = orderItemDao.findByOrder(orderId);
        
        request.setAttribute("orderItemList", orderItemList);
        request.getRequestDispatcher("admin/order_item/index.jsp").include(request, response);
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }
}
