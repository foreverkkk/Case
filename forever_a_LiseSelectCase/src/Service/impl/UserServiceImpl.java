package Service.impl;

import Bean.User;
import Dao.UserDao;
import Dao.impl.UserDaoImpl;
import Service.UserService;

import java.util.List;

/**
 * @author forever
 */

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao，完成查询
        return userDao.findAll();
    }
}
