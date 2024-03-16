package trung.dev.data.dao;

import java.util.List;

import trung.dev.data.model.OrderItem;

public interface OrderItemDao {

    public void insert(OrderItem orderItem);

    public void update(OrderItem orderItem);

    public void delete(int orderItemId);

    public OrderItem find(int orderItemId);

    public List<OrderItem> findAll();

    public List<OrderItem> findByOrder(int orderId);
}
