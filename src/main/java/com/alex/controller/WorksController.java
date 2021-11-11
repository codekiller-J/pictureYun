package com.alex.controller;

import com.alex.pojo.User;
import com.alex.pojo.Works;
import com.alex.service.UserService;
import com.alex.service.WorksService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.sun.corba.se.spi.orbutil.threadpool.Work;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;



@Controller
@RequestMapping("/works")
public class WorksController {

    @Autowired
    private UserService userService;
    @Autowired
    private WorksService worksService;

    @Autowired
    private ObjectMapper mapper;


    @RequestMapping("/toAddWorks")
    public String toAddWorks(String username, Model model) {
        User user = userService.loginCheck(username);
        model.addAttribute("user", user);
        return "addWorks";
    }


    @RequestMapping(value = "/addWorks", method = RequestMethod.POST)
    public String addWorks(HttpServletRequest request,
                           @RequestParam("username") String username, @RequestParam("works_description") String works_description,
                           @RequestParam("picfile") MultipartFile picfile, Model model
    ) throws JsonProcessingException, FileNotFoundException {
        System.out.println(username);
        System.out.println(works_description);
        System.out.println(null == picfile);
        User user = userService.loginCheck(username);




        //获取servlet的运行路径下的imgs文件夹作为上传图片的存储路径

        String strDirPath = request.getSession().getServletContext().getRealPath("imgs/");

        //检查图片储存路径是否存在，如果不存在，创纪路径
        File rootDir = new File(strDirPath);
        if (!rootDir.exists()) {
            rootDir.mkdirs();
        }
        //获得源文件的文件名
        String fileName = picfile.getOriginalFilename();

        //创纪目标文件 指定文件存储路径和文件名
        File tagetFile = new File(strDirPath + fileName);

        if (fileName != null && fileName.length() > 0) {
            try {
                //将源文件转移到目标文件中，使用transferTo方法
                picfile.transferTo(tagetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Works works = new Works(user.getId(), works_description, fileName);

        worksService.addWorks(works);
        String Info = "上传成功";
        model.addAttribute("Info", Info);
        model.addAttribute("user",user);
        return "getuserimage";
    }



    @RequestMapping("/toGetUserImage")
    public String toGetUserImage(String username, Model model) {
        User user = userService.loginCheck(username);
        model.addAttribute("user",user);
        return "getuserimage";
    }




    @RequestMapping("/getUserImage")
    public String getUserImage( int id,Model model) {
        List<String> list=worksService.getUserImage(id);
        model.addAttribute("list",list);
        System.out.println(list.toString());
        return "userAllImage";
    }




    @RequestMapping("/getDetail")
    @ResponseBody
    public Works getDetail(int works_id) {

        Works works = worksService.getDetail(works_id);

        return works;

    }




    @RequestMapping("/queryAllWorks")
    @ResponseBody
    public List<Works> queryAllWorks() {
        return worksService.getAllworkers();
    }


}
