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
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import trung.dev.data.model.OrderItem;

/**
 *
 * @author ĐMX
 */
public class OrderServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                actionCreate(request, response);
                break;
            case "update":
                actionUpdate(request, response);
                break;
            case "delete":
                actionDelete(request, response);
                break;
            default:
                throw new AssertionError();
        }

        response.sendRedirect("CartServlet");
    }

    private boolean isProductInCart(int productId, List<OrderItem> cart) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getProductId() == productId) {
                return true;
            }
        }
        return false;
    }

    private void actionCreate(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();

        int productId = Integer.parseInt(request.getParameter("productId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));

        OrderItem orderItem = new OrderItem(quantity, price, productId, 0);
        List<OrderItem> cart = new ArrayList<>();

        if (session.getAttribute("cart") != null) {
            cart = (List<OrderItem>) session.getAttribute("cart");
            if (isProductInCart(productId, cart)) {
                //update quantity
                for (int i = 0; i < cart.size(); i++) {
                    if (cart.get(i).getProductId() == productId) {
                        cart.get(i).setQuantity(cart.get(i).getQuantity() + quantity);
                    }
                }
            } else {
                cart.add(orderItem);
            }
        } else {
            cart.add(orderItem);
        }

        session.setAttribute("cart", cart);
    }

    private void actionDelete(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        int productId = Integer.parseInt(request.getParameter("productId"));
        if (session.getAttribute("cart") != null) {
            List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");
            for (int i = 0; i < cart.size(); i++) {
                if (cart.get(i).getProductId() == productId) {
                    cart.remove(i);
                }
            }
        }
    }

    private void actionUpdate(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        int productId = Integer.parseInt(request.getParameter("productId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if (session.getAttribute("cart") != null) {
            List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");
            for (int i = 0; i < cart.size(); i++) {
                if (cart.get(i).getProductId() == productId) {
                    cart.get(i).setQuantity(quantity);
                }
            }
        }

    }
}
