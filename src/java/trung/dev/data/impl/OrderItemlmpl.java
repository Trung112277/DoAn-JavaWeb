package trung.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trung.dev.data.dao.OrderItemDao;
import trung.dev.data.driver.MySQLDriver;
import trung.dev.data.model.OrderItem;

public class OrderItemlmpl implements OrderItemDao {

    Connection conn;

    public OrderItemlmpl() {
        conn = MySQLDriver.getInstance().getConnection();
    }

    @Override
    public void insert(OrderItem orderItem) {
        // TODO Auto-generated method stub
        try {
            String sql = "INSERT INTO order_items(id, quantity, price, product_id, order_id) VALUES(NULL,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderItem.getQuantity());
            stmt.setDouble(2, orderItem.getPrice());
            stmt.setInt(3, orderItem.getProductId());
            stmt.setInt(4, orderItem.getOrderId());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void update(OrderItem orderItem) {
        // TODO Auto-generated method stub
        try {
            String sql = "UPDATE ORDER_ITEMS SET QUANTITY=?, PRODUCT_ID=?, ORDER_ID =? WHERE ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderItem.getQuantity());
            stmt.setInt(2, orderItem.getProductId());
            stmt.setInt(3, orderItem.getOrderId());
            stmt.setInt(4, orderItem.getId());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void delete(int orderItemId) {
        // TODO Auto-generated method stub
        try {
            String sql = "DELETE FROM order_items where ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, orderItemId);
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public OrderItem find(int orderItemId) {
        // TODO Auto-generated method stub
        try {
            String sql = "SELECT * FROM order_items WHERE Id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderItemId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int quantity = rs.getInt("quantity");
                double price = rs.getInt("price");
                int productId = rs.getInt("product_id");
                int orderId = rs.getInt("order_id");

                return new OrderItem(id, quantity, price, productId, orderId);
            }
        } catch (SQLException ex) {
        }

        return null;
    }

    @Override
    public List<OrderItem> findAll() {
        // TODO Auto-generated method stub
        List<OrderItem> orderItemList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM order_items";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                int productId = rs.getInt("product_id");
                int orderId = rs.getInt("order_id");

                orderItemList.add(new OrderItem(id, quantity, price, productId, orderId));
            }
        } catch (SQLException ex) {
        }

        return orderItemList;
    }

    @Override
    public List<OrderItem> findByOrder(int orderId) {
        List<OrderItem> orderItemList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM order_items WHERE ORDER_ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderId);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                int productId = rs.getInt("product_id");

                orderItemList.add(new OrderItem(id, quantity, price, productId, orderId));
            }
        } catch (SQLException ex) {
        }

        return orderItemList;
    }

}
