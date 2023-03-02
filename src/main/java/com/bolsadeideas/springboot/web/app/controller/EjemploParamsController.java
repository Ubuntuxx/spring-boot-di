package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
    @GetMapping("/string")
    public String EjemploParamsController(@RequestParam(name = "texto", required = false) String texto, Model model) {
        model.addAttribute("resultado", "El parametro enviado es: " + texto);
        return "params/ver";
    }
}


