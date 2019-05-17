package com.example.cxzt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class IndexController {
    @RequestMapping("/hello")
    public String index(HashMap<String, Object> map){
        System.out.println("----11111111----");
        map.put("hello", "欢迎进入HTML页面");
        return "/index";
    }
}
