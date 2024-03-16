package trung.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trung.dev.data.dao.CategoryDao;
import trung.dev.data.driver.MySQLDriver;
import trung.dev.data.model.Category;

public class Categorylmpl implements CategoryDao {

    Connection conn;

    public Categorylmpl() {
        conn = MySQLDriver.getInstance().getConnection();
    }

    @Override
    public void insert(Category category) {
        // TODO Auto-generated method stub
        try {
            String sql = "INSERT INTO categories(id, name, description) VALUES(NULL,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, category.getName());
            stmt.setString(2, category.getDescription());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void update(Category category) {
        // TODO Auto-generated method stub
        try {
            String sql = "UPDATE CATEGORIES SET NAME=?, DESCRIPTION=? WHERE ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, category.getName());
            stmt.setString(2, category.getDescription());
            stmt.setInt(3, category.getId());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void delete(int categoryId) {
        // TODO Auto-generated method stub
        try {
            String sql = "DELETE FROM categories where ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, categoryId);
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public Category find(int categoryId) {
        // TODO Auto-generated method stub
        try {
            String sql = "SELECT * FROM Categories WHERE Id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                return new Category(id, name, description);
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
    public List<Category> findAll() {
        // TODO Auto-generated method stub
        List<Category> categoryList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Categories";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                categoryList.add(new Category(id, name, description));
            }
        } catch (SQLException ex) {
        }

        return categoryList;
    }

}
