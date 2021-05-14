package com.example.restaurantpro.controller;

import com.example.restaurantpro.dao.OperadorDao;
import com.example.restaurantpro.dao.RoleDao;
import com.example.restaurantpro.manager.OperadorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class ManagerController {

    @Autowired
    OperadorDao OpDao;

    @Autowired
    RoleDao RoDao;

    @Autowired
    OperadorManager OpMan;


}
