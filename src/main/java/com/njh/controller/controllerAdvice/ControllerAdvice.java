package com.njh.controller.controllerAdvice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.ControllerAdvice
@Slf4j
public class ControllerAdvice {
    @ExceptionHandler
    @ResponseBody
    public Object handler(Exception e) {
        System.out.println("test exceptionhandler");
        return e.getMessage();
    }
}
