package com.mine.siis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mine.siis.dao")// //扫描的mapper
public class Log4j2TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Log4j2TestApplication.class, args);
    }

}
