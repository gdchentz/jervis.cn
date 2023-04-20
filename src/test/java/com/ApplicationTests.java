package com;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test

    public void contextLoads() throws SQLException {

        String sql="select * from employee";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.printf(JSON.toJSONString(maps));


    };

    }
