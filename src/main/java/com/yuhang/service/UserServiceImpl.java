package com.yuhang.service;

import com.yuhang.dao.UserRepository;
import com.yuhang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User checkUser(String username, String password) {

        // sql 语句都集成了。跟mybatis的区别
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user;

    }


}