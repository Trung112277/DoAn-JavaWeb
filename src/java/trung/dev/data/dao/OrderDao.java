package trung.dev.data.dao;

import java.util.List;

import trung.dev.data.model.Order;

public interface OrderDao {

    public void insert(Order order);

    public void update(Order order);

    public void delete(int orderId);

    public Order find(int orderId);
    
    public Order findByCode(String code);

    public List<Order> findAll();
}
