package cman;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {

        Connection connection = dataSource.getConnection();

        System.out.printf(String.valueOf(connection.getClass()));
        connection.close();


        };

    }

