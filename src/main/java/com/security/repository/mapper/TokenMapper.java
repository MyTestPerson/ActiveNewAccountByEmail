package com.security.repository.mapper;


import com.security.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TokenMapper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int i) throws SQLException {

        User user = new User();
        user.setUsername(resultSet.getString("username"));

        return user;
    }
}
