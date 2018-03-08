package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zyz on 2018/3/6.
 */
@RestController
public class Hello {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello sb";
    }
}
