package com.controller;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * @author ohhhhhhhhh
 * @description: 学生控制类
 * @date 2021/6/19 15:44
 */
@Controller
@RequestMapping("/s")
public class StudentCont {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/s")
    @ResponseBody
    public String Test(){
        return "s-->test";
    }

    @GetMapping("/All")
    public ModelAndView student(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",studentService.selectAll());
//        给哪个jsp
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping("/ById/{id}")
    public ModelAndView byId(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("student", studentService.byId(id));
        return modelAndView;
    }
    @PostMapping("/addId")
    public String addId(Student student){
        studentService.addId(student);
        return "redirect:/s/All";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        studentService.deleteById(id);
        return "redirect:/s/All";
    }

    @PostMapping("/update")
    public String update(Student student){
        studentService.update(student);
        return "redirect:/s/All";
    }





}
