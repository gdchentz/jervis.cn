package com.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class MyErrorController extends BasicErrorController {
   @Autowired
    public MyErrorController(ErrorAttributes errorAttributes, ServerProperties serverProperties,
                             ErrorProperties errorProperties) {
        super(errorAttributes,ServerProperties.getError(), errorProperties);
    }

    @Override
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse){

        HttpStatus status=getStatus(request);

        Map<String,Object> model=getErrorAttributes(request,isIncludeStackTrace(request, MediaType.TEXT_HTML));
        model.put("msg","this is Error!");
        ModelAndView modelAndView=new ModelAndView("errorPage",model,status);
        return  modelAndView;
    }

    @Override
    public ResponseEntity<Map<String,Object>> error(HttpServletRequest request){
       HttpStatus status=getStatus(request);
       Map<String,Object> body=getErrorAttributes(request,isIncludeStackTrace(request,MediaType.TEXT_HTML));
        body.put("msg","Here is Error");
        return new ResponseEntity<>(body,status);
    }

    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
       return 
    }

}
