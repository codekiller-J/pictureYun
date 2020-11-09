package com.alex.dao;

import com.alex.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //注册一个用户
    int addUser(User user);

    //通过username去查询用户
    User loginCheck(String username);

    //查询全部用户
    List<User> queryAllUser();

    //用户首页
    User userMain(String username);

    //修改密码
    int modified(@Param("username") String username, @Param("password") String newpassword);


}
