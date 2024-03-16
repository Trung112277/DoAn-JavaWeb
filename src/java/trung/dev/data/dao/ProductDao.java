package trung.dev.data.dao;

import java.util.List;

import trung.dev.data.model.Product;

public interface ProductDao {

    public void insert(Product product);

    public void update(Product product);

    public void delete(int productId);

    public Product find(int productId);

    public List<Product> findAll();

    public List<Product> findByCategory(int categoryId);

}
