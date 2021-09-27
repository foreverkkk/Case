package Dao.impl;

import Bean.User;
import Dao.UserDao;
import Util.JdbcDruidUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    JdbcTemplate template = new JdbcTemplate(JdbcDruidUtil.getDataSource());
    @Override
    public List<User> findAll() {
        //使用JDBC操作数据库
        String sql ="select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }
}
