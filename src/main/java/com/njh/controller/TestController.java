package com.njh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.sql.Time;
import java.util.Calendar;

@Controller
public class TestController {
    @RequestMapping("mappingtest.do")
    @ResponseBody
    public Object getTest() {
        int i = 1 / 0;
        return Calendar.getInstance();
    }

    @RequestMapping("index")
    public String gethtml() {
        return "index";
    }

    @RequestMapping("testhrlef")
    public String test(WebRequest request) {
        request.setAttribute("name", 12, WebRequest.SCOPE_SESSION);
        return "index";
    }
}
