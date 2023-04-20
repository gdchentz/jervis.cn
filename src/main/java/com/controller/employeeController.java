package com.controller;

import com.dao.employeeMapper;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Map;


@RestController
public class employeeController {

    @Autowired
    private employeeMapper empMapper;


    @GetMapping("/employees")
    public  Object employees(){
        return empMapper.queryEmployees();
    }

    @GetMapping("/employee/{id}")
    public  Object employee(@PathVariable Integer id){

        return  empMapper.queryEmployee(id);
    }

}
