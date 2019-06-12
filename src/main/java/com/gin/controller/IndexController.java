package com.gin.controller;

import com.gin.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    private String index(){
        System.out.println("第一");
        indexService.index();
        return "/index";
    }
}
