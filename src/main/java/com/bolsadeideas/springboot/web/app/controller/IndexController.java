package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Reques
public class IndexController {
    @GetMapping({"/", "/index", "/main"})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola springboot");
        return "index";
    }
}
