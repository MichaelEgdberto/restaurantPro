package com.example.restaurantpro.controller;

import com.example.restaurantpro.dao.OperadorDao;
import com.example.restaurantpro.dao.RoleDao;
import com.example.restaurantpro.dao.UsuariosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.management.relation.Role;

@Controller
public class ClienteController {
    @Autowired
    UsuariosDao usuariosDao;

    @Autowired
    RoleDao roleDao;

    @Autowired
    OperadorDao operadorDao;
}
