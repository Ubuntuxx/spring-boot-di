package com.bolsadeideas.springboot.web.app.controller;

import com.bolsadeideas.springboot.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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


    @RequestMapping("/listar")
    public String listar(Model model) {
        List<Usuario> lista = new ArrayList();
        lista.add(new Usuario("Andres","Lopez","correo@correo.com"));
        lista.add(new Usuario("Andres","Lopez","correo@correo.com"));
        lista.add(new Usuario("Andres","Lopez","correo@correo.com"));
        model.addAttribute("titulo", "Listado de usuarios");
        //model.addAttribute("usuarios", lista);
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios = Arrays.asList(new Usuario("Andres","Lopez","correo@correo.com"),
                new Usuario("Andres","Lopez","correo@correo.com"),
                new Usuario("Andres","Lopez","correo@correo.com"),
                new Usuario("Andres","Lopez","correo@correo.com"));
        return usuarios;
    }
}
