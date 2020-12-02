package com.raju.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api")
public class controller {

    @GetMapping("/hi")
    public ModelAndView getHi(ModelAndView modelAndView){

        modelAndView.setViewName("admin/hello");
        return modelAndView;
    }


}
