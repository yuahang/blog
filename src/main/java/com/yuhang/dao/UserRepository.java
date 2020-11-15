package com.yuhang.dao;


import com.yuhang.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

// <主键，主键的类型> 这里继承的方法包括了增删改查
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
