package trung.dev.data.dao;

import java.util.List;

import trung.dev.data.model.User;

public interface UserDao {

    public void insert(User user);

    public void update(User user);

    public void delete(int userId);

    public User find(int userId);
    
    public User find(String email);

    public List<User> findAll();
}
