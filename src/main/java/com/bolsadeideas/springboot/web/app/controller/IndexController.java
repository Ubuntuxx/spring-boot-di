package com.bolsadeideas.springboot.web.app.controller;

import com.bolsadeideas.springboot.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/model")
public class IndexController {
    @GetMapping({"/", "/index", "/main"})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola springboot");
        return "index";
    }

    @RequestMapping(value = "/detalle", method = RequestMethod.GET)
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setApellido("Amador");
        usuario.setNombre("Luis");
        usuario.setEmail("luis@mail.com");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }
}
