package com.mine.siis.controller;

import com.mine.siis.concurrent.ThreadPoolManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Queue;
import java.util.UUID;

@Controller
public class OrderController {

    @Autowired
    ThreadPoolManager threadPoolManager;

    /**
     * 测试模拟下单请求 入口
     * @param id
     * @return
     */
    @GetMapping("/start/{id}")
    public String start(@PathVariable Long id) {
        //模拟的随机数
        String orderNo = System.currentTimeMillis() + UUID.randomUUID().toString();

        threadPoolManager.addOrders(orderNo);

        return "Test ThreadPoolExecutor start";
    }

    /**
     * 停止服务
     * @param id
     * @return
     */
    @GetMapping("/end/{id}")
    public String end(@PathVariable Long id) {

        threadPoolManager.shutdown();

        Queue q = threadPoolManager.getMsgQueue();
        System.out.println("关闭了线程服务，还有未处理的信息条数：" + q.size());
        return "Test ThreadPoolExecutor start";
    }

}
