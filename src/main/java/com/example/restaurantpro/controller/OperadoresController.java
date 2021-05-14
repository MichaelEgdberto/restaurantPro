package com.example.restaurantpro.controller;

import com.example.restaurantpro.dao.UsuariosDao;
import com.example.restaurantpro.manager.OperadorManager;
import com.example.restaurantpro.model.Operadores;
import com.example.restaurantpro.model.Usuarios;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OperadoresController {
    Logger logger = LoggerFactory.getLogger(OperadoresController.class);

    @Autowired
    OperadorManager OpMan;

    @ModelAttribute("usuarios")
    public Usuarios setUpUsuariosForm() {
        return new Usuarios();
    }

    @GetMapping("/login")
    public String getUserLogin(Model model) {
        model.addAttribute("usuarios", new Usuarios());
        return "user/login_template_client";
    }

    @PostMapping("/login")
    public String postUserLogin(Model model, @RequestParam("email") String email) {

        Usuarios user = 

        if (user != null) {
            model.addAttribute("usuario", user);
            return "redirect:/perfil";

        } else {
            user = new Usuarios();
            user.setEmail(email);
            model.addAttribute("usuarios", user);
            return "user/registro_template";
        }
    }
}

