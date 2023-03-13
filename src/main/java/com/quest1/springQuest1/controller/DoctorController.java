package com.quest1.springQuest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String index1() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String index2() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String index3() {
        return "Jodie Whittaker";
    }


}