package com.alex.controller;

import com.alex.pojo.User;
import com.alex.pojo.loginInfo;
import com.alex.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


 //跨域
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private UserService userService;


    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)       //注册

    public String addUser(User user, Model model) {

        User user1 = userService.loginCheck(user.getUsername());    //先在表里面查一下是否有对应的username，有的话就不能注册。

        if (null == user1) {
            userService.addUser(user);
            String Info = "注册成功，请登录！";
            model.addAttribute("msg", Info);
            return "login";
        } else {
            String Info = "用户名已存在，请重新输入";
            model.addAttribute("msg", Info);
            return "register";
        }
    }


    @RequestMapping("/toLogin")
    public String toLogin() {

        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)                   //登陆

    public String Login(loginInfo loginInfo, Model model) throws JsonProcessingException {


        User user = userService.loginCheck(loginInfo.getUsername());

        System.out.println(loginInfo.getUsername());

        if (null == user) {
            String info = "用户不存在，请重新输入";
            model.addAttribute("msg", info);
            return "login";
        }
        if (loginInfo.getPassword().equals(user.getPassword())) {
            model.addAttribute("msg", loginInfo);
            String info = "登陆成功";

            return "usermain";
        } else {
            String info = "密码错误,请重新输入";
            model.addAttribute("msg", info);
            return "login";
        }
    }


//    @RequestMapping(value = "/main", method = RequestMethod.GET)      //用户首页
//
//    public String userMain(String username) {
//      return "usermain";
//    }


    @RequestMapping("/toModified")
    public String toModified(String username, Model model) {
        User user = userService.loginCheck(username);
        model.addAttribute("msg", user);
        return "modified";
    }

    @RequestMapping(value = "/modified", method = RequestMethod.POST)              //修改密码

    public String modified(@RequestParam("username") String username, @RequestParam("newpassword") String newpassword,Model model) {
        System.out.printf("%s  %s%n", username, newpassword);
        int x = userService.modified(username, newpassword);
        if (x == 1) {
            String Info="修改成功，请重新登录";
            model.addAttribute("msg",Info);
            return "login";
        } else {
            String Info="修改失败，请重新时输入";
            model.addAttribute("msg",Info);
            return "modified";
        }
    }


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/tomain")
    public String tomain(String username,Model model){
        model.addAttribute("msg",username);
        model.addAttribute("user",username);
        return "usermain";
    }

}
