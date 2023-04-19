package cman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application {

// test ok 88889996668898989
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



}
