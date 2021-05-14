package com.example.restaurantpro.manager;

import com.example.restaurantpro.model.Operadores;

import java.util.List;

public interface OperadorManager {
    Operadores traeOperadoresPorUsuario(String usuario);
    List getListOperadores();
    void guardarOperador(Operadores operadores);
}
