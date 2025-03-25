package com.callor.redierct.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {


    @GetMapping
    public String home() {
        return "home";
    }


    @GetMapping(path={"/list"})
    public String list() {
        return "list";
    }


    @DeleteMapping(path="/delete/{idx}")
    public String delete(@PathVariable int idx) {
        return "redirect:/list";
    }



}
