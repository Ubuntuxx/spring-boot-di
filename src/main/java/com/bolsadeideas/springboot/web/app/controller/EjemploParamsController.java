package com.bolsadeideas.springboot.web.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/string")
    public String EjemploParamsController(@RequestParam(name = "texto", required = false) String texto, Model model) {
        model.addAttribute("resultado", "El parametro enviado es: " + texto);
        return "params/ver";
    }

    @GetMapping("/mix-params")
    public String EjemploParamsController(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
        model.addAttribute("resultado", "El saludo es: " + saludo + " y el numero es: " + numero);
        return "params/ver";
    }
}


