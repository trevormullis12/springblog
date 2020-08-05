package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
//    @ResponseBody
    public String returnLandingMessage() {
        return "home";
    }

    @PostMapping("/")
    public String returnCohort(@RequestParam(name = "cohort") String cohort, Model model) {
        return "";
    }
}
