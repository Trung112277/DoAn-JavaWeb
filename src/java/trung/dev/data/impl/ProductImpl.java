package trung.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trung.dev.data.dao.ProductDao;
import trung.dev.data.driver.MySQLDriver;
import trung.dev.data.model.Product;

public class ProductImpl implements ProductDao {

    Connection conn;

    public ProductImpl() {
        conn = MySQLDriver.getInstance().getConnection();
    }

    @Override
    public void insert(Product product) {
        // TODO Auto-generated method stub
        try {
            String sql = "INSERT INTO PRODUCTS(id, name, description, image, price, quantity, category_id) VALUES(NULL,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setString(3, product.getImage());
            stmt.setDouble(4, product.getPrice());
            stmt.setInt(5, product.getQuantity());
            stmt.setInt(6, product.getCategoryId());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void update(Product product) {
        // TODO Auto-generated method stub
        try {
            String sql = "UPDATE PRODUCTS SET NAME=?, DESCRIPTION=?, IMAGE=?, PRICE=?, QUANTITY =?, CATEGORY_ID =? WHERE ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setString(3, product.getImage());
            stmt.setDouble(4, product.getPrice());
            stmt.setInt(5, product.getQuantity());
            stmt.setInt(6, product.getCategoryId());
            stmt.setInt(7, product.getId());
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
            
        }
    }

    @Override
    public void delete(int ProductId) {
        // TODO Auto-generated method stub
        try {
            String sql = "DELETE FROM Products where ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, ProductId);
            stmt.execute();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public Product find(int productId) {
        // TODO Auto-generated method stub
        try {
            String sql = "SELECT * FROM PRODUCTS WHERE Id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, productId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                String image = rs.getString("image");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int categoryId = rs.getInt("category_id");

                return new Product(productId, name, description, image, price, quantity, categoryId);
            }
        } catch (SQLException ex) {
        }

        return null;
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        List<Product> productList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM products";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String image = rs.getString("image");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int categoryId = rs.getInt("category_id");

                productList.add(new Product(id, name, description, image, price, quantity, categoryId));
            }
        } catch (SQLException ex) {
        }

        return productList;
    }

    @Override
    public List<Product> findByCategory(int categoryId) {
        List<Product> productList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM products where category_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String image = rs.getString("image");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");

                productList.add(new Product(id, name, description, image, price, quantity, categoryId));
            }
        } catch (SQLException ex) {
        }

        return productList;
    }

}
