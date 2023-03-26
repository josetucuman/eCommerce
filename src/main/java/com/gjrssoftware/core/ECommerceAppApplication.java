package com.gjrssoftware.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ECommerceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceAppApplication.class, args);
    }

}
