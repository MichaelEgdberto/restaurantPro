package com.example.restaurantpro.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;

public interface RoleDao extends JpaRepository <Role, Long> {
    Role findByRole(String role);
}
