package com.dhc.dhc_xatrain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dhc.dhc_xatrain.daos")
public class DhcXatrainApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhcXatrainApplication.class, args);
    }

}
