package com.mine.siis.test;

import com.mine.siis.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanApplicationTests {

    public static void main(String[] args) {
        // ------------------------------ 测试一  ------------------------------
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.getBean("myBean");

        // 变体
        context.getBean("mineBean");
        //((AnnotationConfigApplicationContext) context).destroy();
//      ((AnnotationConfigApplicationContext) context).close();
    }
}
