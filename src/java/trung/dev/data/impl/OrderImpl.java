package trung.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trung.dev.data.dao.OrderDao;
import trung.dev.data.dao.UserDao;
import trung.dev.data.driver.MySQLDriver;
import trung.dev.data.model.Order;
import trung.dev.data.model.User;

public class OrderImpl implements OrderDao {

    Connection conn;

    public OrderImpl() {
        conn = MySQLDriver.getInstance().getConnection();
    }

    @Override
    public void insert(Order order) {
        // TODO Auto-generated method stub
        try {
            String sql = "INSERT INTO orders(id, code, status, user_id) VALUES(NULL,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, order.getCode());
            stmt.setString(2, order.getStatus());
            stmt.setInt(3, order.getUserId());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void update(Order order) {
        // TODO Auto-generated method stub
        try {
            String sql = "UPDATE ORDERS SET CODE=?, STATUS=?, USER_ID =? WHERE ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, order.getCode());
            stmt.setString(2, order.getStatus());
            stmt.setInt(3, order.getUserId());
            stmt.setInt(4, order.getId());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void delete(int orderId) {
        // TODO Auto-generated method stub
        try {
            String sql = "DELETE FROM orders where ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, orderId);
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public Order find(int orderId) {
        // TODO Auto-generated method stub
        try {
            String sql = "SELECT * FROM orders WHERE Id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String code = rs.getString("code");
                String status = rs.getString("status");
                int userId = rs.getInt("user_id");

                return new Order(id, code, status, userId);
            }
        } catch (SQLException ex) {
        }

        return null;
    }

//	@Override
//	public Order find(String status, String code) {
//		// TODO Auto-generated method stub
//		try {
//			String sql = "SELECT * FROM orders WHERE status=? and code=?";
//			PreparedStatement stmt = conn.prepareStatement(sql);
//			stmt.setString(1, status);
//			stmt.setString(2, code);
//			ResultSet rs = stmt.executeQuery();
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String status = rs.getString("status");
//				String code = rs.getString("code");
//
//				return new order(id, status, code, userId);
//			}
//		} catch (SQLException ex) {
//		}
//
//		return null;
//	}
    @Override
    public List<Order> findAll() {
        // TODO Auto-generated method stub
        List<Order> orderList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Orders";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String status = rs.getString("status");
                String code = rs.getString("code");
                int userId = rs.getInt("user_id");

                orderList.add(new Order(id, code, status, userId));
            }
        } catch (SQLException ex) {
        }

        return orderList;
    }

    @Override
    public Order findByCode(String code) {
        try {
            String sql = "SELECT * FROM orders WHERE code=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, code);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String status = rs.getString("status");
                int userId = rs.getInt("user_id");

                return new Order(id, code, status, userId);
            }
        } catch (SQLException ex) {
        }

        return null;
    }
}
