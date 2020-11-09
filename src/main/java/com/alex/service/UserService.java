package com.alex.service;

import com.alex.pojo.User;

import java.util.List;

public interface UserService {

    //注册一个用户
    int addUser(User user);


    //查询全部用户
    List<User> queryAllUser();

    //登陆验证
    User loginCheck(String usernam);


    //用户主页
    User userMain(String username);

    //修改密码
    int modified(String username,String newpassword);

}
