package trung.dev.data.model;

import trung.dev.data.dao.DatabaseDao;
import trung.dev.data.dao.ProductDao;

public class OrderItem {
	private int id;
	private int quantity;
	private double price;
	private int productId;
	private int orderId;
        
        private Product product;

	public OrderItem(int quantity, double price, int productId, int orderId) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.productId = productId;
		this.orderId = orderId;
	}

	public OrderItem(int id, int quantity, double price, int productId, int orderId) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.productId = productId;
		this.orderId = orderId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
        
        public Product getProduct(){
            ProductDao productDao = DatabaseDao.getInstance().getProductDao();
            return productDao.find(productId);
        }

}
