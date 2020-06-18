package com.mine.siis.service;

import com.mine.siis.dao.UserMapper;
import com.mine.siis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id){
        return userMapper.findUserById(id);
    }
}
