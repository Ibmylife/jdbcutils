package com.njh.jdbcutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.njh.controller"})
public class JdbcutilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcutilsApplication.class, args);
    }
}
