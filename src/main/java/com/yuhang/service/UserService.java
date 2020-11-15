package com.yuhang.service;


import com.yuhang.pojo.User;

public interface UserService {

    User checkUser(String username, String password);

}
