package com.demo.demossm.controller;

import com.demo.demossm.model.Demo;
import com.demo.demossm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demossm")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/demo")
    public Demo selectOne(@RequestParam String id){
        Demo demo = new Demo();
        demo.setId(id);
        return demoService.selectByPrimaryKey(demo);
    }
}
