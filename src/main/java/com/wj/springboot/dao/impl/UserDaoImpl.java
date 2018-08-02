package com.wj.springboot.dao.impl;

import com.wj.springboot.dao.UserDao;
import com.wj.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> listUser() {
        return jdbcTemplate.query("select id,name from user", new UserRowMapper());
    }

    @Override
    public String addUser(User user) {
        int resRow = jdbcTemplate.update("insert into user (name) values (?)",user.getUserName());
        return String.valueOf(resRow);
    }

    private class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setUserId(resultSet.getLong("id"));
            user.setUserName(resultSet.getString("name"));
            return user;
        }
    }
}
