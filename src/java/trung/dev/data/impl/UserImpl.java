package trung.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trung.dev.data.dao.UserDao;
import trung.dev.data.driver.MySQLDriver;
import trung.dev.data.model.User;

public class UserImpl implements UserDao {

    Connection conn;

    public UserImpl() {
        conn = MySQLDriver.getInstance().getConnection();
    }

    @Override
    public void insert(User user) {
        // TODO Auto-generated method stub
        try {
            String sql = "INSERT INTO Users(id, email, pass, role) VALUES(NULL,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getRole());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        try {
            String sql = "UPDATE USERS SET EMAIL=?, PASS=?, ROLE=? WHERE ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getRole());
            stmt.setInt(4, user.getId());
            
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void delete(int userId) {
        // TODO Auto-generated method stub
        try {
            String sql = "DELETE FROM Users where ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, userId);
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public User find(int userId) {
        // TODO Auto-generated method stub
        try {
            String sql = "SELECT * FROM users WHERE Id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String pass = rs.getString("pass");
                String role = rs.getString("role");

                return new User(id, email, pass, role);
            }
        } catch (SQLException ex) {
        }

        return null;
    }

    @Override
    public User find(String email) {
        // TODO Auto-generated method stub
        try {
            String sql = "SELECT * FROM users WHERE email=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String pass = rs.getString("pass");
                String role = rs.getString("role");

                return new User(id, email, pass, role);
            }
        } catch (SQLException ex) {
        }

        return null;
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        List<User> userList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Users";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String pass = rs.getString("pass");
                String role = rs.getString("role");

                userList.add(new User(id, email, pass, role));
            }
        } catch (SQLException ex) {
        }

        return userList;
    }

}
