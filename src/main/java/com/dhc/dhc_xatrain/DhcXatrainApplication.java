package com.dhc.dhc_xatrain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.dhc.dhc_xatrain.daos")
@EnableTransactionManagement
public class DhcXatrainApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhcXatrainApplication.class, args);
    }

}
