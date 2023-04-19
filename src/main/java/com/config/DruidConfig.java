package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewFilter;
import com.alibaba.druid.support.http.StatViewServlet;
import com.zaxxer.hikari.util.DriverDataSource;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletRegistration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;

@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }


//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//
//        ServletRegistrationBean bean = new ServletRegistrationBean();
//        bean.setServlet(    (Servlet) new StatViewServlet());
//        bean.setUrlMappings(Arrays.asList("/druid/**"));
//        return bean;
//
//    }


}
