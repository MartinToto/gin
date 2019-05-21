package com.gin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Martin on 2019/5/17.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);


    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    private String index(){
        return "/index";
    }
}
