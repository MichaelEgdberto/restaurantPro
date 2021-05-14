package com.example.restaurantpro.dao;

import com.example.restaurantpro.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosDao extends JpaRepository <Usuarios, Long> {
    Usuarios findByEmail(String email);
}
