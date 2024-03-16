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
import java.util.List;
import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.dao.OrderDao;
import trung.dev.data.dao.OrderItemDao;
import trung.dev.data.model.Order;
import trung.dev.data.model.OrderItem;
import trung.dev.data.model.User;
import trung.dev.util.StringHelper;

/**
 *
 * @author ĐMX
 */
public class CheckoutServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            response.sendRedirect("LoginServlet");
            return;
        }

        /**
         * Create Order
         */
        User user = (User) session.getAttribute("user");
        String code = StringHelper.randomString(8);
        Order order = new Order(code, "pending", user.getId());
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        orderDao.insert(order);

        /**
         * Create List orderItems
         */
        order = orderDao.findByCode(code);
        OrderItemDao orderItemDao = DatabaseDao.getInstance().getOrderItemDao();
        if (session.getAttribute("cart") != null) {
            List<OrderItem> orderItems = (List<OrderItem>) session.getAttribute("cart");
            for (int i = 0; i < orderItems.size(); i++) {
                OrderItem orderItem = orderItems.get(i);
                orderItem.setOrderId(order.getId());
                orderItemDao.insert(orderItem);
            }
        }

        session.removeAttribute("cart");
        response.sendRedirect("CartServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
