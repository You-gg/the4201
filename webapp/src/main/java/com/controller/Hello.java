package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ohhhhhhhhh
 * @description:
 * @date 2021/6/18 15:52
 */
@Controller
@RequestMapping("/hello")
public class Hello {
    @GetMapping("/index")
    public ModelAndView hello(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("mass","hhhhooomass");
        return modelAndView;
    }
}
