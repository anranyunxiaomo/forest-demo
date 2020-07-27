package com.moxuan.forest.demo.controller;

import com.moxuan.forest.demo.forest.ForestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName dxyt-mdm
 * @ClassName ForestDemoController
 * @Author zhangkai
 * @Description
 * @Date 2020/7/26 3:43 下午
 */
@RestController
@RequestMapping("/forest")
public class ForestDemoController {

    @Resource
    private ForestDemoService forestDemoService;

    @GetMapping("/test")
    public String test(){
        return "请求成功";
    }
    @GetMapping("/demo")
    public void  demo(){
        String s = forestDemoService.simpleRequest();
        System.out.println(s);
    }

}
