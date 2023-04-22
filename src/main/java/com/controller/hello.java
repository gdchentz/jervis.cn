package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hello {

    @RequestMapping("/hello")
    public  String Hello(){
        return  "This new string out: Ok test done! update 21.37";

    }


}
