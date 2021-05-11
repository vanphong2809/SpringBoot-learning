package com.phong.spring.controllerweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        return "about";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}
