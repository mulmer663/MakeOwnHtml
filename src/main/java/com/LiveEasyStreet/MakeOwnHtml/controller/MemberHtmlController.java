package com.LiveEasyStreet.MakeOwnHtml.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MemberHtmlController {

    @GetMapping("/member/dae_hyuk")
    public String html_1() {
        return "member/dae_hyuk";
    }

    @GetMapping("/member/jung_won")
    public String html_2() {
        return "member/jung_won";
    }

    @GetMapping("/member/won_gyoon")
    public String html_4() {
        return "member/sinwongyoon";
    }

    @GetMapping("/member/yu_mi")
    public String html_5() {
        return "member/Yumi";
    }

    @GetMapping("/member/dae_hyuk")
    public String html_6() {
        return "member/dae_hyuk";
    }

    @GetMapping("/member/ha_yeong")
    public String html_7() {
        return "member/hayeong";
    }

    @GetMapping("/member/ye_rim")
    public String html_8() {
        return "member/yerim";
    }
}
