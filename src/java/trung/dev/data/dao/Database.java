package trung.dev.data.dao;

import trung.dev.data.impl.Categorylmpl;
import trung.dev.data.impl.OrderImpl;
import trung.dev.data.impl.OrderItemlmpl;
import trung.dev.data.impl.ProductImpl;
import trung.dev.data.impl.UserImpl;

public class Database extends DatabaseDao {

	@Override
	public UserDao getUserDao() {
		// TODO Auto-generated method stub
		return new UserImpl();
	}

	@Override
	public ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return new ProductImpl();
	}

	@Override
	public CategoryDao getCategoryDao() {
		// TODO Auto-generated method stub
		return new Categorylmpl();
	}

	@Override
	public OrderDao getOrderDao() {
		// TODO Auto-generated method stub
		return new OrderImpl();
	}

	@Override
	public OrderItemDao getOrderItemDao() {
		// TODO Auto-generated method stub
		return new OrderItemlmpl();
	}

}
