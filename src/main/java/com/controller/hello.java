package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class hello {

    @RequestMapping("/hello")
    public  String Hello(Model md){
        md.addAttribute("mess","testkjkjfsa");
        return "hello" ;
    }


}
