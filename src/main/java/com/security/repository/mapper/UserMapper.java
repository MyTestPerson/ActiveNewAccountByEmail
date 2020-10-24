package com.security.repository.mapper;


import com.security.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int i) throws SQLException {

        User user = new User();
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setEnabled(resultSet.getBoolean("enabled"));

        return user;
    }
}
