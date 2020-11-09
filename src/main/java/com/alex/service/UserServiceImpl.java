package com.alex.service;

import com.alex.dao.UserMapper;
import com.alex.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
   @Autowired
    private UserMapper userMapper;


    @Override
    public User loginCheck(String username) {
         return  userMapper.loginCheck(username);
    }


    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }


    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public User userMain(String username) {
        return userMapper.userMain(username);
    }


    @Override
    public int modified(String username,  String newpassword) {
        return userMapper.modified(username,newpassword);
    }
}
