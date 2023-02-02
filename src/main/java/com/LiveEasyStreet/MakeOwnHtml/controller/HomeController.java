package com.LiveEasyStreet.MakeOwnHtml.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {


    /**
     * 홈페이지를 home.html와 연결
     *
     * @return home(홈페이지)에 연결
     */
    @RequestMapping("/")
    public String home() {
        log.info("home controller");
        return "home";
    }
}

