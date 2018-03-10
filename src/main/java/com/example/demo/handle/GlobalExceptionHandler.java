package com.example.demo.handle;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String, Object> exceptionHandler(HttpRequest request, Exception e){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success",false);
        map.put("errMsg", e.getMessage());
        return map;
    }
}
