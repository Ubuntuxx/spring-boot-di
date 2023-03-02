package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class EjemploParamsController {
    public String EjemploParamsController(Model model){

        return "params/ver";
    }
}


