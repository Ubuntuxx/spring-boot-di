package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

    @GetMapping("/string/{texto}")
                                                //ambos nombres debes ser iguaales
    public String variables(@PathVariable String texto, Model model){
        model.addAttribute("titulo","Recibir parametros de la ruta @PthVariable");
        model.addAttribute("resultado","El texto enviado es: " + texto);
        return "variables/ver";
    }
}
