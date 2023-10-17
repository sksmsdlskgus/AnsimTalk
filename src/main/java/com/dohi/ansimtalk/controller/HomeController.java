package com.dohi.ansimtalk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {
//메인 ->home.html로 이동
    @RequestMapping("/")
    public String home() {
        log.info("home controller");
        return "on-boarding/starting";
    }
}
