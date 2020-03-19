package com.voltanbro.covidstats.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class IndexController {

    public String home() {
        return "home";
    }
}
