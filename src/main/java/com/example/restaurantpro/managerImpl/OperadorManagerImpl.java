package com.example.restaurantpro.managerImpl;

import com.example.restaurantpro.dao.OperadorDao;
import com.example.restaurantpro.dao.RoleDao;
import com.example.restaurantpro.manager.OperadorManager;
import com.example.restaurantpro.model.Operadores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OperadorManager")
public class OperadorManagerImpl implements OperadorManager {

    @Autowired
    OperadorDao OpDao;

    @Autowired
    RoleDao rolDao;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;;

    @Override
    public Operadores traeOperadoresPorUsuario(String usuario) {
        return OpDao.findByUsusario(usuario);
    }

    @Override
    public List getListOperadores() {
        return null;
    }

    @Override
    public void guardarOperador(Operadores operadores) {
        Operadores opTmp = null;
        System.out.println(operadores.toString());

        if (operadores.getId()!= null )
            opTmp = OpDao.getOne(operadores.getId());

        if (opTmp != null && !operadores.getPassword().equals(opTmp.getPassword()))
            operadores.setPassword(bCryptPasswordEncoder.encode(operadores.getPassword()));

        OpDao.save(operadores);
    }
}
