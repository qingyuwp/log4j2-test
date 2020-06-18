package com.mine.siis.config;

import com.mine.siis.pojo.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(value = "mineBean",initMethod = "init",destroyMethod = "destroy")
    public MyBean myBean(){
        return new MyBean();
    }
}
