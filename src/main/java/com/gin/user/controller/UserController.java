package com.gin.user.controller;


import com.gin.user.domain.Ro.UserVo;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import user.domain.User;
//import user.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 2019/5/19.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    /*
    @Reference
    private UserService userService;

    @RequestMapping(value = "/listUser",method = RequestMethod.GET)
    @ResponseBody
    private List<UserVo> listUser(){
        List<User> users = userService.listAllUser();
        List<UserVo> userVoList = new ArrayList<UserVo>();
        for (User user:users) {
            UserVo userVo = new UserVo();
            BeanUtils.copyProperties(userVo,user);
            userVoList.add(userVo);
        }

        return userVoList;
    }



    @RequestMapping(value = "/listUserRedis",method = RequestMethod.GET)
    @ResponseBody
    private String listUserRedis(){
        return null;
    }

    @RequestMapping(value = "/saveUser", method=RequestMethod.POST)
    @ResponseBody
    private Integer saveUser(@RequestBody User user){
        Integer saveNum = userService.saveUser(user);
        return saveNum;
    }


    @RequestMapping(value = "/countUser", method=RequestMethod.POST)
    @ResponseBody
    private Integer countUser(@RequestBody User user){
        Integer countNum = userService.countUser();
        return countNum;
    }
    */
}
