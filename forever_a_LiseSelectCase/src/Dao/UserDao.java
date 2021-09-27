package Dao;

import Bean.User;

import java.util.List;

/**
 * @author forever
 */
public interface UserDao {
    public List<User> findAll();
}
