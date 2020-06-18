package com.mine.siis.controller;

import com.mine.siis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final  static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        userService.findUserById(1);
        System.out.println("system.out.println wr  hello World!!!==========");
        LOGGER.info("++++++++++++++++++++++++hello World !!!  ||||");
        return "hello world!!!";
    }
}
