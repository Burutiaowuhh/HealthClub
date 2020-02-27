package com.mao.healthclub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mao.healthclub.mapper")
public class HealthclubApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthclubApplication.class, args);
    }

}
