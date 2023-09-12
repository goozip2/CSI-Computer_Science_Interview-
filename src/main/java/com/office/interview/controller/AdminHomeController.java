package com.office.interview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {

    //������ Ȩ������
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String home() {
        System.out.println("[AdminHomeController] home()");

        String nextPage = "adminhome";
        
        return nextPage;
    }
}
