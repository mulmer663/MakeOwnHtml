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

//    @GetMapping("/member/jung_won")
//    public String html_2() {
//        return "member/jung_won";
//    }
//
//    @GetMapping("/member/chan_sol")
//    public String html_3() {
//        return "member/chan_sol";
//    }
//
//    @GetMapping("/member/wong_yoon")
//    public String html_4() {
//        return "member/wong_yoon";
//    }
//
//    @GetMapping("/member/yu_mi")
//    public String html_5() {
//        return "member/yu_mi";
//    }
//
//    @GetMapping("/member/dae_hyuk")
//    public String html_6() {
//        return "member/dae_hyuk";
//    }
//
//    @GetMapping("/member/ha_yeong")
//    public String html_7() {
//        return "member/ha_yeong";
//    }
//
//    @GetMapping("/member/ye_rim")
//    public String html_8() {
//        return "member/ye_rim";
//    }
}
